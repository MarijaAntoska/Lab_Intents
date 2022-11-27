package com.example.lab_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        val button1 = findViewById<Button>(R.id.ok)
        val nameControl = findViewById<EditText>(R.id.name)

        button1.setOnClickListener() {
            val firstIntent = Intent(this, MainActivity::class.java)
            val name = nameControl.text
            firstIntent.putExtra("UserName",name)
            startActivity(firstIntent)
        }

        val button2 = findViewById<Button>(R.id.cancel)
        button2.setOnClickListener() {
            val firstIntent = Intent(this, MainActivity::class.java)
            startActivity(firstIntent)
        }
    }
}