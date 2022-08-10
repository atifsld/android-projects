package com.atif.spatify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val appDescription =
            "Spatify was created to be a catalogue of the world's best music - every album listed is curated by celebrated musicologists and reviewers, and is updated on a weekly basis."
        return AboutPage(context)
            .setDescription(appDescription)
            .setImage(R.drawable.logosmall)
            .isRTL(false)
            .addItem(Element().setTitle("Version 1.0"))
            .addGroup("Reach out to me")
            .addEmail("atif.mohd.sld@gmail.com")
            .addTwitter("the_hindu")
            .addGitHub("atifsld")
            .create()
    }
}