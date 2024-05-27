package com.example.mini

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mini.networking.HttpHelper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        HttpHelper.getUser()
    }
}