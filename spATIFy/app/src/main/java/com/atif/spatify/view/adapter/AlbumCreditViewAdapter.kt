package com.atif.spatify.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.data.AlbumCredit
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
        holder.creditName.text = albumCredit.creditName
        holder.creditContribution.text = albumCredit.creditContribution
        Picasso
            .get()
            .load(albumCredit.creditImageUrl)
            .into(holder.creditImage)
    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return recyclerDataArrayList.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val creditName: TextView = itemView.findViewById(R.id.credit_name)
        val creditContribution: TextView = itemView.findViewById(R.id.credit_contribution)
        val creditImage: ImageView = itemView.findViewById(R.id.credit_image)
    }
}
