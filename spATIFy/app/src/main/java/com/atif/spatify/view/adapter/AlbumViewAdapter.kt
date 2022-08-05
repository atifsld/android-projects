package com.atif.spatify.view.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.data.Album
import com.atif.spatify.view.activity.AlbumDetailActivity
import com.atif.spatify.view.fragments.AlbumDetailFragment
import com.squareup.picasso.Picasso


class AlbumViewAdapter(var context: Context?) :
    RecyclerView.Adapter<AlbumViewAdapter.RecyclerViewHolder>() {

    private var recyclerDataArrayList = ArrayList<Album>()

    fun updateList(newList:List<Album>)
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
            LayoutInflater.from(parent.context).inflate(R.layout.album_card_layout, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val album: Album = recyclerDataArrayList[position]
        holder.albumTitle.text = album.albumName
        holder.albumArtists.text = album.albumArtists
        holder.albumYear.text = album.albumYear.toString()
        holder.albumArtIv.setOnClickListener{
            Log.d("ONCLICKALBUM", "ONCLICKALBUM")
            val albumDetailFragment = AlbumDetailFragment()
            val bundle = Bundle()
            bundle.putString("albumUuid", album.id)
            albumDetailFragment.arguments = bundle
            val fragmentManager: FragmentManager = (context as AppCompatActivity).supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.contentLayout, albumDetailFragment).addToBackStack(null).commit()
        }
        Picasso
            .get()
            .load(album.albumArtUrl)
            .into(holder.albumArtIv)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val albumTitle: TextView = itemView.findViewById(R.id.album_title)
        val albumArtIv: ImageView = itemView.findViewById(R.id.album_art_iv)
        val albumArtists: TextView = itemView.findViewById(R.id.album_artist)
        val albumYear: TextView = itemView.findViewById(R.id.album_year)
    }
}