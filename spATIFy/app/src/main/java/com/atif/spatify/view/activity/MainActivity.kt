package com.atif.spatify.view.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.atif.spatify.R
import com.atif.spatify.view.fragments.AlbumsFragment
import com.atif.spatify.view.fragments.FavoritesFragment
import com.atif.spatify.view.fragments.SongsFragment
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarToggle: ActionBarDrawerToggle
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val albumButton = findViewById<ImageView>(R.id.albumButton)
        val songButton = findViewById<ImageView>(R.id.songButton)
        val favoriteButton = findViewById<ImageView>(R.id.favoritesButton)

        drawerLayout = findViewById(R.id.drawerLayout)
        actionBarToggle = ActionBarDrawerToggle(this, drawerLayout, 0, 0)
        drawerLayout.addDrawerListener(actionBarToggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        actionBarToggle.syncState()
        navView = findViewById(R.id.navView)


        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.about -> {
                    val intent = Intent(this, AboutPageActivity::class.java)
                    startActivity(intent)
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

        favoriteButton.setOnClickListener {
            val favoritesFragment = FavoritesFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contentLayout, favoritesFragment)
            transaction.commit()
            println("favoritesButton clicked.")
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