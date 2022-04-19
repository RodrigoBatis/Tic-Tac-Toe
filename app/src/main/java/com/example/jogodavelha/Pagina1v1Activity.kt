package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

private lateinit var nome1EditText: EditText
private lateinit var nome2EditText: EditText

class Pagina1v1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina1v1)

        val go = findViewById<Button>(R.id.go)

        go.setOnClickListener {

            nome1EditText = findViewById(R.id.nomeJogador1)
            nome2EditText = findViewById(R.id.nomeJogador2)

            if (validarCampos()){

                val nome1 = nome1EditText.text.toString()
                val nome2 = nome2EditText.text.toString()


            val intent = Intent(this, Partida1v1::class.java)

                intent.putExtra("player1", nome1)
                intent.putExtra("player2", nome2)

                startActivity(intent)

            }
        }

    }

    private fun validarCampos(): Boolean {
        var noError= true
        if (nome1EditText.text.isBlank()){
            nome1EditText.setError("Digite o nome")
            noError = false
        }
        if (nome2EditText.text.isBlank()){
            nome2EditText.setError("Digite o nome")
            noError = false
        }
        return noError
    }
}