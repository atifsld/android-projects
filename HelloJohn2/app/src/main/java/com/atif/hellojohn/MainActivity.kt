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
        val inputText = findViewById<TextView>(R.id.input_name)
        val signupButton = findViewById<Button>(R.id.singup_button)
        var personName = ""
        submitButton.setOnClickListener {
            personName = inputText.text.toString()
            val helloTextView = findViewById<TextView>(R.id.helloText)
            if(personName == "") {
                helloTextView.text = "Hello world!"
                signupButton.visibility = INVISIBLE
                Toast.makeText(
                    this@MainActivity,
                    "Please enter your name!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                signupButton.visibility = VISIBLE
                val newHelloMessage = "Hello $personName!"
                helloTextView.text = newHelloMessage
            }
        }

        signupButton.setOnClickListener {
            if(personName == "") {
                Toast.makeText(
                    this@MainActivity,
                    "Please enter your name!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                var intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name", personName)
                startActivity(intent)
            }
        }
    }
}