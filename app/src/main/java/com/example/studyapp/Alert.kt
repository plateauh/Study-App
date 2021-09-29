package com.example.studyapp

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

class Alert (private val context: Context, private val topic: Topic) {

    init {
        val dialogBuilder = AlertDialog.Builder(context)
        dialogBuilder.setMessage(topic.details)
            .setPositiveButton("OK", DialogInterface.OnClickListener {
                    dialog, _ -> dialog.cancel()
            })

        val alert = dialogBuilder.create()
        alert.setTitle(topic.title)
        alert.show()
    }
}