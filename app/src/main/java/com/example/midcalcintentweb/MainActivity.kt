package com.example.midcalcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCalc: Button
    lateinit var ButtonIntent: Button
    lateinit var ButtonWeb: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc = findViewById(R.id.Btn_Cal)
        ButtonIntent = findViewById(R.id.Btn_int)
        ButtonWeb = findViewById(R.id.Btn_web)


        ButtonCalc.setOnClickListener{
            val intent = Intent(this, calculatorActivity::class.java)
            startActivity(intent)
        }
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,intentActivity::class.java)
            startActivity(intent)
        }
        ButtonWeb.setOnClickListener {
            val intent=Intent(this,webActivity::class.java)
            startActivity(intent)
        }
    }
}
