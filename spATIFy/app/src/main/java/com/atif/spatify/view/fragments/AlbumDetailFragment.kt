package com.atif.spatify.view.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.data.Album
import com.atif.spatify.view.adapter.AlbumCreditViewAdapter
import com.atif.spatify.view.adapter.SongsInAlbumViewAdapter
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory
import com.squareup.picasso.Picasso

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlbumDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var albumUuid: String? = null

    private val spatifyViewModel: SpatifyViewModel by viewModels {
        SpatifyViewModelFactory(
            (context?.applicationContext as SpatifyApplication).albumRepository,
            (context?.applicationContext as SpatifyApplication).songRepository,
            (context?.applicationContext as SpatifyApplication).albumCreditRepository
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            albumUuid = it.getString("albumUuid")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_album_detail, container, false)
        Toast.makeText(context, "albumUuid = ${albumUuid}", Toast.LENGTH_SHORT).show()
        val album: Album? = albumUuid?.let { spatifyViewModel.getAlbum(it) }
        val albumTitleTextView = view.findViewById<TextView>(R.id.album_title)
        val albumLabel = view.findViewById<TextView>(R.id.album_label_name)
        val albumArtistTextView = view.findViewById<TextView>(R.id.album_artist)
        val albumYearTextView = view.findViewById<TextView>(R.id.album_year)
        val albumArtImageView = view.findViewById<ImageView>(R.id.album_art_iv)
        val albumDescription = view.findViewById<TextView>(R.id.album_description)
        val shareButton = view.findViewById<ImageButton>(R.id.album_share_button)

        val spotifyButton = view.findViewById<ImageView>(R.id.album_spotify_button)
        val wikipediaButton = view.findViewById<ImageView>(R.id.album_wikipedia_button)
        val geniusButton = view.findViewById<ImageView>(R.id.album_genius_button)

        spotifyButton!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album!!.albumSpotifyUrl))
            startActivity(intent)
        }
        wikipediaButton!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album!!.albumWikipediaUrl))
            startActivity(intent)
        }
        geniusButton!!.setOnClickListener{
            if(album!!.albumGeniusUrl == null) {
                Toast.makeText(context, "This album does not have a Genius lyrics page.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(album!!.albumGeniusUrl))
                startActivity(intent)
            }
        }
        shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, album!!.createShareString())
            startActivity(intent)
        }
        albumTitleTextView.text = album!!.albumName
        albumArtistTextView.text = album.albumArtists
        albumYearTextView.text = album.albumYear.toString()
        albumDescription.text = album.albumDescription
        albumLabel.text = album.albumLabel
        Picasso
            .get()
            .load(album.albumArtUrl)
            .into(albumArtImageView)


        val songsInAlbumRecyclerView = view.findViewById<RecyclerView>(R.id.songs_in_album_recycler_view)
        songsInAlbumRecyclerView.layoutManager = LinearLayoutManager(context)
        val songsAdapter = context?.let { SongsInAlbumViewAdapter(it, spatifyViewModel) }
        songsInAlbumRecyclerView.adapter = songsAdapter
        spatifyViewModel.getSongsFromAlbum(albumUuid!!).observe(viewLifecycleOwner) { songs ->
            songsAdapter?.updateList(songs)
        }

        val albumCreditRecyclerView = view.findViewById<RecyclerView>(R.id.album_credits_recycler_view)
        albumCreditRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val adapter = AlbumCreditViewAdapter(context)
        albumCreditRecyclerView.adapter = adapter
        spatifyViewModel.getCreditsForAlbum(albumUuid!!).observe(viewLifecycleOwner) { songs ->
            songs?.let {
                adapter.updateList(it)
            }
        }
        return view
    }
}