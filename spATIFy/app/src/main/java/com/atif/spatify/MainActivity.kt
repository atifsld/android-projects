package com.atif.spatify

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset


class MainActivity : AppCompatActivity() {

    var albumNameList: ArrayList<String> = ArrayList()
    var albumArtistList: ArrayList<String> = ArrayList()
    var albumYearList: ArrayList<Int> = ArrayList()

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

        loadData()
    }

    private fun loadData() {
        val albumArray = JSONArray(loadJSONFromAsset())
        for(i in 0 until albumArray.length()) {
            val albumDetail = albumArray.getJSONObject(i)
            albumNameList.add(albumDetail.getString("album_name"))
            albumArtistList.add(albumDetail.getString("album_artist"))
            albumYearList.add(albumDetail.getInt("album_year"))
        }
        println(albumNameList)
        println(albumArtistList)
        println(albumYearList)
    }

    private fun loadJSONFromAsset(): String {
        val json: String?
        try {
            val inputStream = assets.open("albums.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            val charset: Charset = Charsets.UTF_8
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, charset)
        } catch (ex: IOException) {
            println("WE FUCKED")
            ex.printStackTrace()
            return ""
        }
        return json

    }
}