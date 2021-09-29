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
            Topic("Print", "Print to console in Kotlin", "Kotlin has 2 print methods:\n\n" +
                    "- print(): the cursor will stay at the same line after execution.\n\n" +
                    "- println(): the cursor will move to the next line after execution."),

            Topic("val & var", "Variables declaration", "In Kotlin, there is 2 types of variables:\n" +
                    "val: which is immutable (unchangeable value).\n\n" +
                    "var: which is mutable (changeable value).\n\n" +
                    "To define & initialize a variable without specifying the data type, follow this rule:\n\n" +
                    "(val/var) variable_name = value\n\n" +
                    "eg.: val message = “Hello World”"),

            Topic("Data types", "Useful data types", "Kotlin has various data types, including but not limited to:\n\n" +
                    "- Int\n" +
                    "- Float\n" +
                    "- Boolean\n" +
                    "- String\n" +
                    "- Char"),
            Topic("String Manipulation", "Concatenation & Interpolation", "Concatenation: you can simply concat multiple strings by using +. eg.: “Hello ” + “World”.\n\n" +
                    "Interpolation: you can embed a variable value in a string using \$. eg.: “Good Morning \$message”."),

            Topic("If statements & When", "if(), if() else, &&, ||, and !", "In Kotlin, there is an equivalence of switch() which is when. It either can be:\n\n" +
                    "- when {}: without a variable (a way to clean multiple ifs that are not necessarily related).\n\n" +
                    "- when (variable) {}: with a variable to apply conditions on it."),

            Topic("Loops", "for & while loops", "- for loop: eg. for (i in message), for (i in 0…10). in keyword is doing magic!\n\n" +
                    "- while loop: don’t forget to control it! you don’t want to be stuck in an infinite loop!"),

            Topic("Try/Catch", "An example", "try {\n\n" +
                    "\t// Code blocks that might cause crashing\n\n" +
                    "} catch (exception_variable_name: Exception_Type){\n\n" +
                    "\t// What to do after crashing\n\n" +
                    "}")
        )
    }
}