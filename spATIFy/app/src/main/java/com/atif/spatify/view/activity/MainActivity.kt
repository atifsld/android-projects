package com.atif.spatify.view.activity

import android.content.ClipData
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.atif.spatify.R
import com.atif.spatify.view.fragments.AlbumsFragment
import com.atif.spatify.view.fragments.SongsFragment
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarToggle: ActionBarDrawerToggle
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val albumButton = findViewById<Button>(R.id.albumButton)
        val songButton = findViewById<Button>(R.id.songButton)

        drawerLayout = findViewById(R.id.drawerLayout)
        actionBarToggle = ActionBarDrawerToggle(this, drawerLayout, 0, 0)
        drawerLayout.addDrawerListener(actionBarToggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        actionBarToggle.syncState()
        navView = findViewById(R.id.navView)


        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.about -> {
                    Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.contactus -> {
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:7356015305"))
                    startActivity(intent)
                    true
                }
                else -> {
                    false
                }
            }
        }

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

        loadAlbumFragment()
    }

    override fun onSupportNavigateUp(): Boolean {
        drawerLayout.openDrawer(navView)
        return true
    }

    override fun onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun loadAlbumFragment() {
        val albumsFragment = AlbumsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contentLayout, albumsFragment)
        transaction.commit()
    }
}