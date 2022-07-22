package com.atif.hellojohn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submitButton = findViewById<Button>(R.id.submit_button)
        val personNameEditText = findViewById<TextView>(R.id.personName)
        val singupButton = findViewById<Button>(R.id.singup_button)
        submitButton.setOnClickListener {
            val personName = personNameEditText.text
            val helloTextView = findViewById<TextView>(R.id.helloText)
            if(personName == "") {
                singupButton.visibility = INVISIBLE
                Toast.makeText(
                    this,
                    "Please enter your name!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                singupButton.visibility = VISIBLE
                val newHelloMessage = "Hello $personName"
                helloTextView.text = newHelloMessage
            }
        }

        singupButton.setOnClickListener {
            val personName = personNameEditText.text
            Intent intent = new Intent(this, )
        }
    }
}