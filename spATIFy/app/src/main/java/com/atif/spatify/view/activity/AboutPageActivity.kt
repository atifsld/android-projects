package com.atif.spatify.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.atif.spatify.R
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element


class AboutPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appDescription = "Spatify was created to be a catalogue of the world's best music - every album listed is curated by celebrated musicologists and reviewers, and is updated on a weekly basis."
        val aboutPage: View = AboutPage(this)
            .setDescription(appDescription)
            .setImage(R.drawable.logosmall)
            .isRTL(false)
            .addItem(Element().setTitle("Version 1.0"))
            .addGroup("Reach out to me")
            .addEmail("atif.mohd.sld@gmail.com")
            .addTwitter("atifsld")
            .addGitHub("atifsld")
            .create()

        setContentView(aboutPage)
    }
}