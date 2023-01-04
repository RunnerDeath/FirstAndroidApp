package ru.startandroid.openactivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secondActButton = findViewById<Button>(R.id.second_activity)
        secondActButton.setOnClickListener{
            val Intent = Intent(this,SecondActivity::class.java)
            startActivity(Intent)
        }
    }
}