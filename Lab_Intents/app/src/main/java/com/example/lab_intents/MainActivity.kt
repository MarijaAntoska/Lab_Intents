package com.example.lab_intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat.startActivityForResult
import android.os.Environment







class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bundle : Bundle? = intent.extras

        val userNameControl=findViewById<TextView>(R.id.text1)

        if(bundle != null)
        {
            val userName= bundle.get("UserName")
            userNameControl.text = userName.toString()
        }


        val button1 = findViewById<Button>(R.id.firstButton)
        button1.setOnClickListener(){
            val firstIntent = Intent(this, ExplicitActivity::class.java)
            startActivity(firstIntent)
    }

        val button2 = findViewById<Button>(R.id.secondButton)
        button2.setOnClickListener(){
            val firstIntent = Intent(this, ImplicitActivity::class.java)

            startActivity(firstIntent)

}

        val button3 = findViewById<Button>(R.id.thirdButton)
        button3.setOnClickListener(){

            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_SUBJECT, " MPiP Send Title")
            intent.putExtra(Intent.EXTRA_TEXT, "Content send from MainActivity ")

            startActivity(Intent.createChooser(intent, "Email via..."))

        }

        val button4 = findViewById<Button>(R.id.forthButton)
        button4.setOnClickListener() {

            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivity(intent)

        }


    }

}