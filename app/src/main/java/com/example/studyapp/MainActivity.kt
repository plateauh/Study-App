package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

lateinit var kotlinButton: Button
lateinit var androidButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton = findViewById(R.id.kotlinBtn)
        kotlinButton.setOnClickListener {
            val intent = Intent(this, KotlinActivity::class.java)
            startActivity(intent)
        }

        androidButton = findViewById(R.id.androidBtn)
        androidButton.setOnClickListener {
            val intent = Intent(this, AndroidActivity::class.java)
            startActivity(intent)
        }
    }

}