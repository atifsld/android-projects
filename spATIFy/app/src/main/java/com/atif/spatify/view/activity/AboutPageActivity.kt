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

        val aboutPage: View = AboutPage(this)
            .setDescription("Spatify was created to be a catalogue of the world's best music. Every album listed is curated by celebrated musicologists and reviewers, and is updated on a weekly basis.")
            .setImage(R.drawable.logosmall)
            .isRTL(false)
            .addItem(Element().setTitle("Version 1.0"))
            .addGroup("Connect with us")
            .addEmail("atif.mohd.sld@gmail.com")
            .addTwitter("atifsld")
            .addGitHub("atifsld")
            .create()

        setContentView(aboutPage)
    }
}