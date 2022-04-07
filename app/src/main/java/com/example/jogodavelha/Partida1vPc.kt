package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Partida1vPc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_partida1v_pc)

        val space1 =findViewById<TextView>(R.id.name1)

        val intent: Intent = getIntent()

        space1.text = intent.getStringExtra("player1")
    }
}