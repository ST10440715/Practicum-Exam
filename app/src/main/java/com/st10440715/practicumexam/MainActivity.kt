package com.st10440715.practicumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMain = findViewById<Button>(R.id.btnMain)
        btnMain.setOnClickListener {
            Intent (this,MainScreen :: class.java)
            startActivity(intent)       //next page
        }
        }

    }