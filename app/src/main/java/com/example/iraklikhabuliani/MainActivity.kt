package com.example.iraklikhabuliani

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageButton:ImageButton
    private lateinit var editText1:EditText
    private lateinit var accauntBattun:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPref = getSharedPreferences("MyAplication", Context.MODE_PRIVATE)
        init()
        imageButton.setOnClickListener{
            var name = editText1.text.toString()

            if(!TextUtils.isEmpty(name)){
                sharedPref.edit().putString("NameOfUser",name).apply ()
            }
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        accauntBattun.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    private fun init(){
        imageButton = findViewById<ImageButton>(R.id.imageButton1)
        editText1 = findViewById<EditText>(R.id.editTextTextPersonName3)
        accauntBattun = findViewById<ImageView>(R.id.imageView)
    }


}