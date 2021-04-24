package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

   private lateinit var increment_view : TextView
   private lateinit var button_click : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increment_view = findViewById(R.id.increment_view)
        button_click = findViewById(R.id.button_increment)

        var clickedTimes = 0

        button_click.setOnClickListener {

            clickedTimes += 1

            increment_view.text = clickedTimes.toString()

        }

    }
}