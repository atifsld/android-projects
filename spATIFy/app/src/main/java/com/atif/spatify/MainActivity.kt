package com.atif.spatify

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val albumButton = findViewById<Button>(R.id.albumButton)
        val songButton = findViewById<Button>(R.id.songButton)

        albumButton.setOnClickListener {
            val albumsFragment = AlbumsFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contentLayout, albumsFragment)
            transaction.commit()
            println("albumButton clicked.")
        }

        songButton.setOnClickListener {
            val songsFragment = SongsFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contentLayout, songsFragment)
            transaction.commit()
            println("songButton clicked.")
        }

    }
}