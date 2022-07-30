package com.atif.spatify.view

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.data.Song

class SongsInAlbumViewAdapter(var recyclerDataArrayList: List<Song>, var context: Context) :
    RecyclerView.Adapter<SongsInAlbumViewAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.song_in_album_card_layout, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongsInAlbumViewAdapter.RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val song: Song = recyclerDataArrayList[position]
        holder.song_title.text = song.songName
        holder.song_title.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(song.songSpotifyUrl))
            context.startActivity(intent)
        }
        holder.song_artist.text = song.getCommaSeparatedArtists()
        holder.song_track_number.text = song.songTrackNumber.toString()
        holder.share_button.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, song.createShareString())
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val song_title: TextView = itemView.findViewById(R.id.song_title)
        val song_artist: TextView = itemView.findViewById(R.id.song_artist)
        val song_track_number: TextView = itemView.findViewById(R.id.song_track_number)
        val share_button: ImageButton = itemView.findViewById(R.id.share_button)
    }
}
