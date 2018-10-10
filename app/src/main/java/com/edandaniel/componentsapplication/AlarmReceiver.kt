package com.edandaniel.componentsapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, NotificationService::class.java)
        service.putExtra("MSG","SERVICE HAS BEEN CALLED")
        service.putExtra("MSG2",
                intent?.getStringExtra("MSG2"))
        context?.startService(service)
    }
}