package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val partida1v1 = findViewById<Button>(R.id.btn1v1)
        val partida1vPc = findViewById<Button>(R.id.btn1vPc)

        partida1v1.setOnClickListener {

            val intent = Intent(this, Pagina1v1Activity::class.java)
            startActivity(intent)
        }

        partida1vPc.setOnClickListener {
            val intent = Intent(this, Pagina1vpc::class.java)
            startActivity(intent)
        }
    }

}