package com.example.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageButton = findViewById<ImageButton>(R.id.imageButton3)
        imageButton.setOnClickListener {
            Toast.makeText(this@MainActivity,  "Berhasil", Toast.LENGTH_LONG).show()
        }
    }
}