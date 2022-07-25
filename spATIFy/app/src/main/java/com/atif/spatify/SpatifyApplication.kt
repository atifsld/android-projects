package com.atif.spatify

import android.app.Application
import org.json.JSONArray
import java.io.IOException
import java.nio.charset.Charset

class SpatifyApplication: Application() {

    var albumNameList: ArrayList<String> = ArrayList()
    var albumArtistList: ArrayList<String> = ArrayList()
    var albumYearList: ArrayList<Int> = ArrayList()

    override fun onCreate() {
        super.onCreate()
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
            println("Couldn't load data")
            ex.printStackTrace()
            return ""
        }
        return json
    }
}