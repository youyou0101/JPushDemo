package com.jpush

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

import cn.jpush.android.api.JPushInterface

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("wsl", "regId: " + JPushInterface.getRegistrationID(this))

        val textView = findViewById<TextView>(R.id.tx_name)
        textView.text = when(BuildConfig.APPLICATION_ID) {
            "com.jpush.demo1" -> "极光1"
            "com.jpush.demo2" -> "极光2"
            "com.jpush.demo3" -> "极光3"
            else -> ""
        }
    }

}
