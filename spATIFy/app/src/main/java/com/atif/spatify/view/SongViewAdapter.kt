package com.atif.spatify.view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.data.Song
import com.squareup.picasso.Picasso


class SongViewAdapter(var recyclerDataArrayList: List<Song>, var context: Context?) :
    RecyclerView.Adapter<SongViewAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.song_card_layout, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewAdapter.RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val song: Song = recyclerDataArrayList[position]
        holder.song_title.setText(song.songName)
        holder.song_artist.setText(song.getCommaSeparatedArtists())
        holder.song_duration.setText(song.songDuration)
        holder.song_title.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, song.createShareString())
            context!!.startActivity(intent)
        }
        Picasso
            .get()
            .load(song.songAlbumArtUrl)
            .into(holder.song_art)
    }

    override fun getItemCount(): Int {
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val song_title: TextView = itemView.findViewById(R.id.song_title)
        val song_artist: TextView = itemView.findViewById(R.id.song_artist)
        val song_art: ImageView = itemView.findViewById(R.id.song_art_iv)
        val song_duration: TextView= itemView.findViewById(R.id.song_duration)
    }
}
