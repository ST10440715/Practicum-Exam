package com.st10440715.practicumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            Intent (this,mainactivity3 :: class.java)
            startActivity(intent)       //next page
        }
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            Intent (this,MainActivity :: class.java)
            startActivity(intent)       //next page
        }
    }
}