package com.example1.remotelearnig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val backImageView = findViewById<ImageView>(R.id.back)
        backImageView.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val SignUpTextView = findViewById<TextView>(R.id.signUp)
        SignUpTextView.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        val fogTextView = findViewById<TextView>(R.id.FOG)
        fogTextView.setOnClickListener {
            val intent = Intent(this, FOG::class.java)
            startActivity(intent)
        }

    }
}