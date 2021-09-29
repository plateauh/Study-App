package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var androidRecyclerView: RecyclerView

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        title = "Android Review"

        androidRecyclerView = findViewById(R.id.rvAndroid)
        androidRecyclerView.adapter = RecyclerViewAdapter(setTopics())
        androidRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.toMain -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setTopics(): ArrayList<Topic>{
        return arrayListOf(
            Topic("Topic3", "Topic 3 is great", "Topic 3 details"),
            Topic("Topic4", "Topic 4 is great", "Topic 4 details"))
    }
}