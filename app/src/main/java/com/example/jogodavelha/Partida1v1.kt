package com.example.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Partida1v1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_partida1v1)

        val bu1 =findViewById<Button>(R.id.btn1)
        val bu2 =findViewById<Button>(R.id.btn2)
        val bu3 =findViewById<Button>(R.id.btn3)
        val bu4 =findViewById<Button>(R.id.btn4)
        val bu5 =findViewById<Button>(R.id.btn5)
        val bu6 =findViewById<Button>(R.id.btn6)
        val bu7 =findViewById<Button>(R.id.btn7)
        val bu8 =findViewById<Button>(R.id.btn8)
        val bu9 =findViewById<Button>(R.id.btn9)

        val space1 =findViewById<TextView>(R.id.name1)
        val space2 =findViewById<TextView>(R.id.name2)

        val intent: Intent = getIntent()

        space1.text = intent.getStringExtra("player1")
        space2.text = intent.getStringExtra("player2")

    }
}