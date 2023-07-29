package com.example.notification_27

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {

    val CHANNEL_ID = "channelid"
    val CHANNEL_NAME = "channelName"
    val notificationId = 0


    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createNotificationchannel()

        //pennding Intent
        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this,0, intent, PendingIntent.FLAG_MUTABLE)

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("30 days of App devlopment tutorial 27")
            .setContentText("Congralutations for showing up till today")
            .setSmallIcon(R.drawable.baseline_insert_emoticon_24)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .build()

        val notificatonmanager = NotificationManagerCompat.from(this)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            notificatonmanager.notify(notificationId,notification)
        }
    }

        fun createNotificationchannel(){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                val channel = NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT).apply {
                    description = "This is my notification channel"
                    lightColor = Color.GREEN
                    enableLights(true)
                }

                val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager.createNotificationChannel(channel)
            }
        }
    }