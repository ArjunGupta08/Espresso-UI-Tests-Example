package com.arjungupta08.espressouitests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text = findViewById<TextView>(R.id.text)
        val intent = intent.getStringExtra("text")
        text.text = intent

    }
}