package com.atif.hellojohn.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.atif.hellojohn.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = intent.getStringExtra("name")
        val statusTextView = findViewById<TextView>(R.id.status_text_view)
        statusTextView.text = "Thanks $name, you have successfully signed up!"
    }
}