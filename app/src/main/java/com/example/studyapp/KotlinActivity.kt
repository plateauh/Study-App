package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var kotlinRecyclerView: RecyclerView

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        title = "Kotlin Review"

        kotlinRecyclerView = findViewById(R.id.rvKotlin)
        kotlinRecyclerView.adapter = RecyclerViewAdapter(setTopics())
        kotlinRecyclerView.layoutManager = LinearLayoutManager(this)
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
            Topic("Topic1", "Topic 1 is great", "Topic 1 details"),
            Topic("Topic2", "Topic 2 is great", "Topic 2 details"))
    }
}