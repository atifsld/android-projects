package com.atif.spatify.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.data.Album
import com.squareup.picasso.Picasso


class AlbumViewAdapter(var recyclerDataArrayList: List<Album>) :
    RecyclerView.Adapter<AlbumViewAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.album_card_layout, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumViewAdapter.RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val album: Album = recyclerDataArrayList[position]
        holder.album_title.text = album.albumName
        holder.album_artists.text = album.getCommaSeparatedArtists()
        holder.album_year.text = album.albumYear.toString()
        Picasso
            .get()
            .load(album.albumArtUrl)
            .into(holder.album_art_iv)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val album_title: TextView = itemView.findViewById(R.id.album_title)
        val album_art_iv: ImageView = itemView.findViewById(R.id.album_art_iv)
        val album_artists: TextView = itemView.findViewById(R.id.album_artist)
        val album_year: TextView = itemView.findViewById(R.id.album_year)
    }
}
