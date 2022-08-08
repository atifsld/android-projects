package com.atif.spatify.view.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.atif.spatify.R
import com.atif.spatify.SpatifyApplication
import com.atif.spatify.databinding.FragmentAlbumDetailBinding
import com.atif.spatify.entity.Album
import com.atif.spatify.view.adapter.AlbumCreditViewAdapter
import com.atif.spatify.view.adapter.SongsInAlbumViewAdapter
import com.atif.spatify.view.viewmodel.SpatifyViewModel
import com.atif.spatify.view.viewmodel.SpatifyViewModelFactory
import com.squareup.picasso.Picasso


class AlbumDetailFragment : Fragment(R.layout.fragment_album_detail) {
    private var albumUuid: String? = null
    private lateinit var binding: FragmentAlbumDetailBinding
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAlbumDetailBinding.bind(view)

        Toast.makeText(context, "albumUuid = ${albumUuid}", Toast.LENGTH_SHORT).show()
        val album: Album? = albumUuid?.let { spatifyViewModel.getAlbum(it) }
        val albumTitleTextView = binding.albumTitle
        val albumLabel = binding.albumLabelName
        val albumArtistTextView = binding.albumArtist
        val albumYearTextView = binding.albumYear
        val albumArtImageView = binding.albumArtIv
        val albumDescription = binding.albumDescription
        val shareButton = binding.albumShareButton

        val spotifyButton = binding.albumSpotifyButton
        val wikipediaButton = binding.albumWikipediaButton
        val geniusButton = binding.albumGeniusButton

        spotifyButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album!!.albumSpotifyUrl))
            startActivity(intent)
        }
        wikipediaButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(album!!.albumWikipediaUrl))
            startActivity(intent)
        }
        geniusButton.setOnClickListener{
            if(album!!.albumGeniusUrl == null) {
                Toast.makeText(context, "This album does not have a Genius lyrics page.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(Intent.ACTION_VIEW).setData(Uri.parse(album.albumGeniusUrl))
                startActivity(intent)
            }
        }
        shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
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


        val songsInAlbumRecyclerView = binding.songsInAlbumRecyclerView
        songsInAlbumRecyclerView.layoutManager = LinearLayoutManager(context)
        val songsAdapter = context?.let { SongsInAlbumViewAdapter(it, spatifyViewModel) }
        songsInAlbumRecyclerView.adapter = songsAdapter
        spatifyViewModel.getSongsFromAlbum(albumUuid!!).observe(viewLifecycleOwner) { songs ->
            songsAdapter?.updateList(songs)
        }

        val albumCreditRecyclerView = binding.albumCreditsRecyclerView
        albumCreditRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val adapter = AlbumCreditViewAdapter(context)
        albumCreditRecyclerView.adapter = adapter
        spatifyViewModel.getCreditsForAlbum(albumUuid!!).observe(viewLifecycleOwner) { songs ->
            songs?.let {
                adapter.updateList(it)
            }
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_album_detail, container, false)
    }
}