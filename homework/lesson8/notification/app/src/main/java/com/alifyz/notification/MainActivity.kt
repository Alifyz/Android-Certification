package com.alifyz.notification

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        btn_notify.setOnClickListener {
            sendNotification()
        }

        btn_cancel.setOnClickListener {
            cancelNotification()
        }

        btn_update.setOnClickListener {
            updateNotification()
        }
    }


    fun sendNotification() {

    }

    fun cancelNotification() {

    }

    fun updateNotification() {

    }
}
