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


class AlbumViewAdapter(recyclerDataArrayList: ArrayList<Album>, mcontext: Context) :
    RecyclerView.Adapter<AlbumViewAdapter.RecyclerViewHolder>() {
    private val courseDataArrayList: ArrayList<Album>
    private val mcontext: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.album_card_layout, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumViewAdapter.RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val album: Album = courseDataArrayList[position]
        holder.album_title.setText(album.albumName)
        Picasso
            .get()
            .load(album.albumArtUrl)
            .into(holder.album_art_iv)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return courseDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val album_title: TextView
        val album_art_iv: ImageView

        init {
            album_title = itemView.findViewById(R.id.album_title)
            album_art_iv = itemView.findViewById(R.id.album_art_iv)
        }
    }

    init {
        courseDataArrayList = recyclerDataArrayList
        this.mcontext = mcontext
    }
}
