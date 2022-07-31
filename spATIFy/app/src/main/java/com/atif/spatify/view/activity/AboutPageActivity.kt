package com.atif.spatify.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element


class AboutPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val aboutPage: View = AboutPage(this)
            .isRTL(false)
            //        .setImage(R.drawable.logo)
            .addItem(Element().setTitle("Version 1.0"))
            .addGroup("Connect with us")
            .addEmail("atif.mohd.sld@gmail.com")
            .addFacebook("the.medy")
            .addTwitter("atifsld")
            .addGitHub("atifsld")
            .create()

        setContentView(aboutPage)
    }
}