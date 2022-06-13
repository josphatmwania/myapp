package com.myprojects.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// declare unchangeable variable of type button and assign it to findViewById

        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {

            Toast.makeText(this, "My button works!", Toast.LENGTH_SHORT).show()

        }



    }
}