package com.edandaniel.componentsapplication

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService: FirebaseMessagingService(){
    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        Log.d("NOTIFICATION_TITLE", p0?.notification?.title)
        Log.d("NOTIFICATION_BODY", p0?.notification?.body)

        NotificationUtils
                .showNotification(this,
                        13244,
                        "PUSH",
                        "PUSH",
                        p0?.notification?.title!!,
                        p0?.notification?.body!!)
    }
}