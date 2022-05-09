package com.example.iraklikhabuliani

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var button2:ImageButton
    private lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val sharedPref =getSharedPreferences("MyAplication", Context.MODE_PRIVATE)

        button2 = findViewById<ImageButton>(R.id.imageButton)
        textView = findViewById<TextView>(R.id.textView2)
        textView.text = "Hello, "+sharedPref.getString("NameOfUser","")
        listeners()
    }
    private fun listeners(){
        button2.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}