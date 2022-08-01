package com.atif.spatify.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
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

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val song: Song = recyclerDataArrayList[position]
        holder.songTitle.text = song.songName
        holder.songArtist.text = song.songArtists
        holder.songDuration.text = song.songDuration
        holder.shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, song.createShareString())
            context!!.startActivity(intent)
        }
        Picasso
            .get()
            .load(song.songAlbumArtUrl)
            .into(holder.songArt)
    }

    override fun getItemCount(): Int {
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val songTitle: TextView = itemView.findViewById(R.id.song_title)
        val songArtist: TextView = itemView.findViewById(R.id.song_artist)
        val songArt: ImageView = itemView.findViewById(R.id.song_art_iv)
        val songDuration: TextView= itemView.findViewById(R.id.song_duration)
        val shareButton: ImageButton = itemView.findViewById(R.id.share_button)
    }
}
