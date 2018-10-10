package com.edandaniel.componentsapplication

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val notificationTime = Calendar.getInstance().timeInMillis + 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener{
            val alarmManager = getSystemService(Context.ALARM_SERVICE)
                    as AlarmManager

            val alarmIntent = Intent(this,
                    AlarmReceiver::class.java)
            alarmIntent.putExtra("","")

            val pendingIntent = PendingIntent.getBroadcast(this,
                    0,alarmIntent,PendingIntent.FLAG_CANCEL_CURRENT)

            alarmManager.set(AlarmManager.RTC_WAKEUP,
                    Calendar.getInstance().timeInMillis,pendingIntent)
        }

        btnTwo.setOnClickListener{
            NotificationUtils
                    .showNotification(this,
                            1234,
                            "CHANNEL_BUTTON_TWO",
                            "CHANNEL_BUTTON_TWO_NAME",
                            "Hello Notification","Hello my baby, Hello my honey")
        }
    }
}
