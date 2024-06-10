
package com.st10440715.practicumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class mainactivity3 : AppCompatActivity() {
    private var etDay: EditText? = null
    private var etMiniTemp: EditText? = null
    private var etMaxiTemp: EditText? = null
    private var tvAverage: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainactivity3)


        etDay = findViewById(R.id.etDay)
        etMiniTemp = findViewById(R.id.etMiniTemp)
        etMaxiTemp = findViewById(R.id.etMaxiTemp)
        tvAverage = findViewById(R.id.tvAverage)

        val btnAverage = findViewById<Button>(R.id.btnAve)
        btnAverage.setOnClickListener {
            calculateTheAverage()
        }

        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener {
            Intent(this, MainActivity::class.java)
            startActivity(intent)       //back to splash screen
        }
    }

    private fun calculateTheAverage() {
        val miniTemp = etMiniTemp?.text.toString().toIntOrNull() ?: 0
        val maxiTemp = etMaxiTemp?.text.toString().toIntOrNull() ?: 0

        val average = (miniTemp + maxiTemp) / 2
        tvAverage?.text = "Average Temperature: $average"
    }

}