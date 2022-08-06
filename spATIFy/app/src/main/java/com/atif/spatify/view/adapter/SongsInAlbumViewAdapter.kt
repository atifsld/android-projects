package com.atif.spatify.view.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.entity.Song
import com.atif.spatify.view.viewmodel.SpatifyViewModel

class SongsInAlbumViewAdapter(var context: Context, val spatifyViewModel: SpatifyViewModel) :
    RecyclerView.Adapter<SongsInAlbumViewAdapter.RecyclerViewHolder>() {

    private var recyclerDataArrayList = ArrayList<Song>()

    fun updateList(newList:List<Song>)
    {
        Log.i("List Changed", "updateList: $newList")
        recyclerDataArrayList.clear()

        recyclerDataArrayList.addAll(newList)
        //notify data change
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.song_in_album_card_layout, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val song: Song = recyclerDataArrayList[position]
        holder.songTitle.text = song.songName
        holder.songTitle.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(song.songSpotifyUrl))
            context.startActivity(intent)
        }
        holder.songArtist.text = song.songArtists
        holder.songTrackNumber.text = song.songTrackNumber.toString()
        holder.shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, song.createShareString())
            context.startActivity(intent)
        }
        if(song.songIsFavorite) {
            holder.favoritesButton.setImageResource(R.drawable.starred)
        } else {
            holder.favoritesButton.setImageResource(R.drawable.starwhite)
        }
        holder.favoritesButton.setOnClickListener {
            if(song.songIsFavorite) {
                spatifyViewModel.removeSongFromFavorites(song.id)
                Log.i("TAG", "${song.songName} removed from favorites.")
                Toast.makeText(context, "${song.songName} removed from favorites.", Toast.LENGTH_SHORT).show()
                holder.favoritesButton.setImageResource(R.drawable.starwhite)
                notifyDataSetChanged()
            } else {
                spatifyViewModel.addSongToFavorites(song.id)
                Log.i("TAG", "${song.songName} added to favorites.")
                Toast.makeText(context, "${song.songName} added to favorites.", Toast.LENGTH_SHORT).show()
                holder.favoritesButton.setImageResource(R.drawable.starred)
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int {
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val songTitle: TextView = itemView.findViewById(R.id.song_title)
        val songArtist: TextView = itemView.findViewById(R.id.song_artist)
        val songTrackNumber: TextView = itemView.findViewById(R.id.song_track_number)
        val shareButton: ImageButton = itemView.findViewById(R.id.share_button)
        val favoritesButton: ImageButton = itemView.findViewById(R.id.song_in_album_favorite)
    }
}
