package com.arjungupta08.espressouitests

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleText = findViewById<EditText>(R.id.title)
        val descText = findViewById<EditText>(R.id.desc)
        val button = findViewById<Button>(R.id.next)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("text", "${titleText.text.toString()} : ${descText.text.toString()}")
            startActivity(intent)
        }

    }
}