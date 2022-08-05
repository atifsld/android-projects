package com.atif.spatify.view.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.data.Album
import com.atif.spatify.view.adapter.AlbumCreditViewAdapter
import com.atif.spatify.view.adapter.SongsInAlbumViewAdapter
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory
import com.squareup.picasso.Picasso

class AlbumDetailActivity : AppCompatActivity() {
    private var albumUuid: String? = null
    private var spotifyButton: ImageView? = null
    private var geniusButton: ImageView? = null
    private var wikipediaButton: ImageView? = null

    private val spatifyViewModel: SpatifyViewModel by viewModels {
        SpatifyViewModelFactory(
            (application as SpatifyApplication).albumRepository,
            (application as SpatifyApplication).songRepository,
            (application as SpatifyApplication).albumCreditRepository
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_detail)

        if(intent.data != null) {
            val uri = intent.data.toString()
            val uriPath = uri
            albumUuid = uriPath.replace("https://www.spatify.com/", "")
            Toast.makeText(this, "UUID in path=$uriPath", Toast.LENGTH_SHORT).show()
        } else {
            albumUuid = intent.getStringExtra("albumUuid")
            Toast.makeText(this, "UUID in intent=$albumUuid", Toast.LENGTH_SHORT).show()
        }

        val album: Album? = albumUuid?.let { spatifyViewModel.getAlbum(it) }
        val albumTitleTextView = findViewById<TextView>(R.id.album_title)
        val albumLabel = findViewById<TextView>(R.id.album_label_name)
        val albumArtistTextView = findViewById<TextView>(R.id.album_artist)
        val albumYearTextView = findViewById<TextView>(R.id.album_year)
        val albumArtImageView = findViewById<ImageView>(R.id.album_art_iv)
        val albumDescription = findViewById<TextView>(R.id.album_description)
        val shareButton = findViewById<ImageButton>(R.id.album_share_button)

        spotifyButton = findViewById(R.id.album_spotify_button)
        wikipediaButton = findViewById(R.id.album_wikipedia_button)
        geniusButton = findViewById(R.id.album_genius_button)

        spotifyButton!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album!!.albumSpotifyUrl))
            startActivity(intent)
        }
        wikipediaButton!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album!!.albumWikipediaUrl))
            startActivity(intent)
        }
        geniusButton!!.setOnClickListener{
            if(album!!.albumGeniusUrl == null) {
                Toast.makeText(this, "This album does not have a Genius lyrics page.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(album!!.albumGeniusUrl))
                startActivity(intent)
            }
        }
        shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, album!!.createShareString())
            startActivity(intent)
        }
        albumTitleTextView.text = album!!.albumName
        albumArtistTextView.text = album.albumArtists
        albumYearTextView.text = album.albumYear.toString()
        albumDescription.text = album.albumDescription
        albumLabel.text = album.albumLabel
        Picasso
            .get()
            .load(album.albumArtUrl)
            .into(albumArtImageView)


        val songsInAlbumRecyclerView = findViewById<RecyclerView>(R.id.songs_in_album_recycler_view)
        songsInAlbumRecyclerView.layoutManager = LinearLayoutManager(this)
        val songsAdapter = SongsInAlbumViewAdapter(this, spatifyViewModel)
        songsInAlbumRecyclerView.adapter = songsAdapter
        spatifyViewModel.getSongsFromAlbum(albumUuid!!).observe(this@AlbumDetailActivity) { songs ->
            songs?.let {
                songsAdapter.updateList(it)
            }
        }

        val albumCreditRecyclerView = findViewById<RecyclerView>(R.id.album_credits_recycler_view)
        albumCreditRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter = AlbumCreditViewAdapter(this)
        albumCreditRecyclerView.adapter = adapter
        spatifyViewModel.getCreditsForAlbum(albumUuid!!).observe(this@AlbumDetailActivity) { songs ->
            songs?.let {
                adapter.updateList(it)
            }
        }
    }
}