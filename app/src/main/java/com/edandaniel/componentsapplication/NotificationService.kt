package com.edandaniel.componentsapplication

import android.app.IntentService
import android.content.Intent
import android.util.Log

class NotificationService: IntentService("") {
    override fun onHandleIntent(intent: Intent?) {
        val msg = intent?.getStringExtra("MSG")
        val msg2 = intent?.getStringExtra("MSG2")
        //Log.i("HEY-THERE","SERVICE HAS BEEN CALLED")
        Log.i("HEY-THERE",msg)
    }
}