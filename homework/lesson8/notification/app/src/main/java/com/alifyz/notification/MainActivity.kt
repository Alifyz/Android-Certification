package com.alifyz.notification


import android.app.NotificationChannel
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.app.NotificationManager
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.support.v4.app.NotificationCompat


class MainActivity : AppCompatActivity() {

    val PRIMARY_CHANNEL_ID = "Default Notification ID"
    val NOTIFICATION_ID = 1
    lateinit var notificationManager : NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE)
                as NotificationManager
        createNotificationChannels()
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
        val notificationBuilder = getNotificationBuilder()
        notificationManager.notify(NOTIFICATION_ID, notificationBuilder.build())
    }

    fun cancelNotification() {
        notificationManager.cancel(NOTIFICATION_ID)
    }

    fun updateNotification() {
        val androidImage = BitmapFactory.decodeResource(resources, R.drawable.ic_launcher_foreground)
        val notificationBuilder = getNotificationBuilder()
        notificationBuilder.setStyle(
            NotificationCompat.BigPictureStyle().bigPicture(androidImage).setBigContentTitle("Big Image Test"))

        notificationManager.notify(NOTIFICATION_ID, notificationBuilder.build())
    }


    fun createNotificationChannels() {


        //Only Builds the Notification for Android Oreo and above
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(PRIMARY_CHANNEL_ID,
                    "Test Notification Channel", NotificationManager.IMPORTANCE_DEFAULT)

            //Custom Notification Channel Settings
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.RED
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
        }
    }

    //Builds the Notification
    fun getNotificationBuilder() : NotificationCompat.Builder {
        val builder = NotificationCompat.Builder(this, PRIMARY_CHANNEL_ID)
            .setContentTitle("Notification Title")
            .setContentText("Issued Notification #1")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
        return builder
    }
}
