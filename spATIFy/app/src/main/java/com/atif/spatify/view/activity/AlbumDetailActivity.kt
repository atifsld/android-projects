package com.atif.spatify.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_detail)

        if(intent.data != null) {
            val uri = intent.data.toString()
            albumUuid = uri.toString()
            Toast.makeText(this, "Path=$albumUuid", Toast.LENGTH_SHORT).show()
        } else {
            albumUuid = intent.getStringExtra("albumUuid")
            Toast.makeText(this, "UUID in intent=$albumUuid", Toast.LENGTH_SHORT).show()
        }

        val album = albumUuid?.let { SpatifyService.getAlbum(it) }!!
        val albumTitleTextView = findViewById<TextView>(R.id.album_title)
        val albumArtistTextView = findViewById<TextView>(R.id.album_artist)
        val albumYearTextView = findViewById<TextView>(R.id.album_year)
        val albumArtImageView = findViewById<ImageView>(R.id.album_art_iv)
        albumTitleTextView.text = album.albumName
        albumArtistTextView.text = album.getCommaSeparatedArtists()
        albumYearTextView.text = album.albumYear.toString()
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