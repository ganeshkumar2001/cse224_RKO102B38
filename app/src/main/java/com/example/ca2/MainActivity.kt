package com.example.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1=findViewById<EditText>(R.id.editq1)
        val button1=findViewById<Button>(R.id.signin)

        button1.setOnClickListener {
            var out:String=edit1.text.toString()
            Toast.makeText(this,out,Toast.LENGTH_SHORT).show()
        }
    }
}