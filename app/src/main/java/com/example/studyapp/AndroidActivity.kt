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
            Topic("Project Structure", "Important folders", "There is multiple folders in the project that serve different purposes:\n" +
                    "\n" +
                    "Gradle Scripts: Used to build .apk file for the app to be deployed. The developer can import dependencies using build.gradle file.\n" +
                    "\n" +
                    "Manifests: Contains AndroidManifest.xml which allows us to get permissions for wifi, gps… etc from user’s phone (and also to define activities and intent filters).\n" +
                    "\n" +
                    "Java: Has 3 subfolder with the same name as the package’s. The difference is that one of them is for app logic, the other two are for testing.\n" +
                    "The app logic folder contains Kotlin files of activities including MainActivity.kt which is the entry point of the app.\n" +
                    "\n" +
                    "Resource: Holds various types of app resources including: \n" +
                    "- drawable: Contains app’s icons.\n" +
                    "- layout: Contains visual aspects of app (user interfaces). eg.: activity_main.xml.\n" +
                    "- mipmap: Contains app’s icons with different sizes and configurations.\n" +
                    "- values: Contains app’s values which are: colors.xml for colors values, strings.xml for string values, and theme subfolder that contains themes.xml files for both light and night modes."),

            Topic("Design", "UI design", "Important views (so far):\n" +
                    "- TextView: to display text.\n" +
                    "- Plain Text: to input text.\n" +
                    "- Button: to be pressed :D.\n" +
                    "- LinearLayout: Horizontal to place elements next to each other (in a row). Vertical to place elements below each other (in a column).\n" +
                    "\n" +
                    "Important (and common) attributes:\n" +
                    "- id: helps in handling the view in activity (logic) file.\n" +
                    "- layout_width & layout_height: the width & height of the view. Their values can be: match_parent, wrap_content, or specific numeric value.\n" +
                    "- text: text displayed in view."),

            Topic("Logic", "To make the app interactive", "There is an override of onCreate function which sets the layout file as content view. onCreate function is the starting point of the activity.\n" +
                    "Initialize view elements by using findViewById(R.id.view_ID) function. Make sure to do this after the call of setContentView().\n" +
                    "To initiate the variable of view outside onCreate() function, use lateinit keyword to tell android that these variables will be initialized later in code.\n")
        )
    }
}