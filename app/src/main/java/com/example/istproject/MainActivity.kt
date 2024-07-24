package com.example.istproject

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val download = findViewById<Button>(R.id.btnDownload)
        val upload = findViewById<Button>(R.id.btnUpload)

        download.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_LONG).show()
        }

        upload.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }


        val dark = findViewById<Button>(R.id.btnDark)
        val light = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<LinearLayout>(R.id.layout)

        dark.setOnClickListener{
              layout.setBackgroundResource(R.color.black)
        }

        light.setOnClickListener{
            layout.setBackgroundResource(R.color.pink)
        }

    }
}