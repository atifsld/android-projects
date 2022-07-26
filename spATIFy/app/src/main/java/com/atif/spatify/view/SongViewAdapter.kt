package com.atif.spatify.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.data.Song
import com.squareup.picasso.Picasso


class SongViewAdapter(recyclerDataArrayList: ArrayList<Song>, mcontext: Context) :
    RecyclerView.Adapter<SongViewAdapter.RecyclerViewHolder>() {
    private val courseDataArrayList: ArrayList<Song>
    private val mcontext: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.album_card_layout, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewAdapter.RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val song: Song = courseDataArrayList[position]
        holder.song_title.setText(song.songName)
        Picasso
            .get()
            .load(song.songAlbumArtUrl)
            .into(holder.song_art)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return courseDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val song_title: TextView
        val song_artist: TextView
        val song_art: ImageView
        val song_duration: TextView

        init {
            song_title = itemView.findViewById(R.id.song_title)
            song_artist = itemView.findViewById(R.id.song_artist)
            song_art = itemView.findViewById(R.id.song_art_iv)
            song_duration = itemView.findViewById(R.id.song_duration)
        }
    }

    init {
        courseDataArrayList = recyclerDataArrayList
        this.mcontext = mcontext
    }
}
