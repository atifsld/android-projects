package com.atif.hellojohn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        val name = intent.getStringExtra("name")
        val statusTextView = findViewById<TextView>(R.id.status_text_view)
        statusTextView.text = "Thanks $name, you have successfully signed up!"
    }
}