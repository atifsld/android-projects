package com.atif.spatify.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.data.Album
import com.atif.spatify.data.AlbumCredit
import com.atif.spatify.view.activity.AlbumDetailActivity
import com.squareup.picasso.Picasso


class AlbumCreditViewAdapter(var recyclerDataArrayList: List<AlbumCredit>, var context: Context?) :
    RecyclerView.Adapter<AlbumCreditViewAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_credit, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        val albumCredit: AlbumCredit = recyclerDataArrayList[position]
        holder.credit_name.text = albumCredit.creditName
        holder.credit_contribution.text = albumCredit.creditContribution
        Picasso
            .get()
            .load(albumCredit.creditImageUrl)
            .into(holder.credit_image)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val credit_name: TextView = itemView.findViewById(R.id.credit_name)
        val credit_contribution: TextView = itemView.findViewById(R.id.credit_contribution)
        val credit_image: ImageView = itemView.findViewById(R.id.credit_image)
    }
}
