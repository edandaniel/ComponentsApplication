package com.edandaniel.componentsapplication

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIDService: FirebaseInstanceIdService(){
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        // Get updated InstanceID token.
        val token:String? = FirebaseInstanceId.getInstance().token
        Log.i("TOKEN", "Refreshed token: " + token!!)
    }
}