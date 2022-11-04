package com.example.diseodeapps

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvEjemplo: TextView = findViewById(R.id.tvEjemplo)
        tvEjemplo.apply {
            text = "Cambiando el Hola Kotlin por este texto más largo...."
            setTextColor(Color.BLUE)

            setOnClickListener{
                setTextColor(Color.GREEN)
            }
        }

    }
}