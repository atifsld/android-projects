package com.atif.spatify.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.atif.spatify.R

class AlbumDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_detail)
        val albumUuid = intent.getStringExtra("albumUuid")
        Toast.makeText(this, albumUuid, Toast.LENGTH_SHORT).show()
    }
}