package com.example.myapplication11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edname1 : EditText
    lateinit var edname2 : EditText
    lateinit var bt : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edname1=findViewById(R.id.edittext1)
        edname2=findViewById(R.id.edittext2)
        bt=findViewById(R.id.button2)
        bt.setOnClickListener {
            val fname = edname1.text.toString()
            val lname = edname2.text.toString()
            Toast.makeText(applicationContext, "$fname $lname", Toast.LENGTH_SHORT).show()
        }
    }
}