package com.atif.spatify.view.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.view.fragments.AlbumDetailFragment
import com.atif.spatify.view.fragments.AlbumsFragment
import com.atif.spatify.view.fragments.FavoritesFragment
import com.atif.spatify.view.fragments.SongsFragment
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory
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
                    Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, AboutPageActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.contactus -> {
                    Toast.makeText(this, "Contact Us", Toast.LENGTH_SHORT).show()
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:+917356015305"))
                    startActivity(intent)
                    true
                }
                else -> {
                    false
                }
            }
        }

        albumButton.setOnClickListener {
           loadAlbumFragment()
            println("albumButton clicked.")
        }

        songButton.setOnClickListener {
            loadSongFragment()
            println("songButton clicked.")
        }

        favoriteButton.setOnClickListener {
            loadFavoriteFragment()
            println("favoritesButton clicked.")
        }
        if(intent.data != null) {
            val uri = intent.data.toString()
            val uriPath = uri
            val  albumUuid = uriPath.replace("https://www.spatify.com/", "")
            Toast.makeText(this, "UUID in path=$uriPath", Toast.LENGTH_SHORT).show()
            val albumDetailFragment = AlbumDetailFragment()
            val bundle = Bundle()
            bundle.putString("albumUuid", albumUuid)
            albumDetailFragment.arguments = bundle
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contentLayout, albumDetailFragment)
            transaction.commit()
            return
        }
        loadAlbumFragment()
    }

    private fun loadFavoriteFragment() {
        val favoritesFragment = FavoritesFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contentLayout, favoritesFragment)
        transaction.commit()
    }

    private fun loadSongFragment() {
        val songsFragment = SongsFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contentLayout, songsFragment)
        transaction.commit()
    }

    override fun onSupportNavigateUp(): Boolean {

        Toast.makeText(this, "Hamburger clicked. Launching drawer", Toast.LENGTH_SHORT).show()
        drawerLayout.openDrawer(navView)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(actionBarToggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {

        Toast.makeText(this, "Back pressed.", Toast.LENGTH_SHORT).show()
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START)
            Toast.makeText(this, "Closing drawer.", Toast.LENGTH_SHORT).show()

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