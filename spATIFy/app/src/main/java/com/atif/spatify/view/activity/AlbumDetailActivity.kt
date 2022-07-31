package com.atif.spatify.view.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.service.SpatifyService
import com.atif.spatify.view.SongsInAlbumViewAdapter
import com.squareup.picasso.Picasso

class AlbumDetailActivity : AppCompatActivity() {
    var albumUuid: String? = null
    var spotifyButton: ImageView? = null
    var geniusButton: ImageView? = null
    var wikipediaButton: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_detail)

        if(intent.data != null) {
            val uri = intent.data.toString()
            val uriPath = uri.toString()
            albumUuid = uriPath.replace("https://www.spatify.com/", "")
            Toast.makeText(this, "UUID in path=$uriPath", Toast.LENGTH_SHORT).show()
        } else {
            albumUuid = intent.getStringExtra("albumUuid")
            Toast.makeText(this, "UUID in intent=$albumUuid", Toast.LENGTH_SHORT).show()
        }

        val album = albumUuid?.let { SpatifyService.getAlbum(it) }!!
        val albumTitleTextView = findViewById<TextView>(R.id.album_title)
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
                .setData(Uri.parse(album.albumSpotifyUrl))
            startActivity(intent)
        }
        wikipediaButton!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album.albumWikipediaUrl))
            startActivity(intent)
        }
        geniusButton!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album.albumGeniusUrl))
            startActivity(intent)
        }
        shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, album.createShareString())
            startActivity(intent)
        }
        albumTitleTextView.text = album.albumName
        albumArtistTextView.text = album.getCommaSeparatedArtists()
        albumYearTextView.text = album.albumYear.toString()
        albumDescription.text = album.albumDescription
        Picasso
            .get()
            .load(album.albumArtUrl)
            .into(albumArtImageView)

        populateSongsInRecyclerView(albumUuid)
    }

    private fun populateSongsInRecyclerView(albumUuid: String?) {
        val songsInAlbumList = SpatifyService.getSongsInAlbum(albumUuid!!)
        val adapter = SongsInAlbumViewAdapter(songsInAlbumList, this)
        val albumRecyclerView = findViewById<RecyclerView>(R.id.songs_in_album_recycler_view)
        albumRecyclerView.adapter = adapter
        albumRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}