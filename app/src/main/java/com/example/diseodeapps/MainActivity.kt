package com.example.diseodeapps

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

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
        }// tvEjemplo

        var etEjemplo = findViewById<EditText>(R.id.etEjemplo)
        etEjemplo.addTextChangedListener {
            if(etEjemplo.text.length == 0) etEjemplo.setError("Campo vacio")
        }
        etEjemplo.setSelection(4)
        var inicio = etEjemplo.selectionStart
        var fin = etEjemplo.selectionEnd
        etEjemplo.selectAll()
    }
}