package com.example.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

private lateinit var nome1EditText: EditText

class Pagina1vpc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina1vpc)

        val easy = findViewById<Button>(R.id.btneasy)
        val middle = findViewById<Button>(R.id.btnmiddle)
        val hard = findViewById<Button>(R.id.btnhard)

        easy.setOnClickListener {
            nome1EditText = findViewById(R.id.nomeJogador1)

            if (validarCampos()){
                val nome1 = nome1EditText.text.toString()

            val intent = Intent(this, Partida1vPc::class.java)

            intent.putExtra("player1", nome1 )

            startActivity(intent)

            }
        }

        middle.setOnClickListener {

            nome1EditText = findViewById(R.id.nomeJogador1)

            if (validarCampos()){
                val nome1 = nome1EditText.text.toString()

                val intent = Intent(this, Partida1vPc::class.java)
                startActivity(intent)

            }
        }

        hard.setOnClickListener {

            nome1EditText = findViewById(R.id.nomeJogador1)

            if (validarCampos()){
                val nome1 = nome1EditText.text.toString()

                val intent = Intent(this, Partida1vPc::class.java)
                startActivity(intent)

            }
        }

    }
    private fun validarCampos(): Boolean {
        var noError = true
        if (nome1EditText.text.isBlank()) {
            nome1EditText.setError("Digite o nome")
            noError = false
        }
        return noError
    }
}