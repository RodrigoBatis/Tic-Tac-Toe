package com.example.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*

class Partida1v1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_partida1v1)

        val space1 = findViewById<TextView>(R.id.name1)
        val space2 = findViewById<TextView>(R.id.name2)

        val intent: Intent = getIntent()

        space1.text = intent.getStringExtra("player1")
        space2.text = intent.getStringExtra("player2")

    }
        //Funtion para adicionar id nos Buttons
        fun btnClick(view: View){
            val btnSelecionado = view as ImageView
            var id = 0

            // Setando id nos Buttons
            when(btnSelecionado.id){
                R.id.btn1 -> id = 1
                R.id.btn2 -> id = 2
                R.id.btn3 -> id = 3
                R.id.btn4 -> id = 4
                R.id.btn5 -> id = 5
                R.id.btn6 -> id = 6
                R.id.btn7 -> id = 7
                R.id.btn8 -> id = 8
                R.id.btn9 -> id = 9
            }
            inicioJogo(id, btnSelecionado)
        }

        //arrays para guardar a jogadas de cada jogador
        var jogador1 = ArrayList<Int>()
        var jogador2 = ArrayList <Int>()
        //turno do jogador
        var vezJogador = 1

        // Funtion responsavel pela verificação de quem está jogando
        fun inicioJogo (id:Int, btnSelecionado:ImageView){

            if (vezJogador ==1 ){
                btnSelecionado.setImageResource(R.drawable.x)
                jogador1.add(id)
                vezJogador =2
            }else if(vezJogador ==2){
                btnSelecionado.setImageResource(R.drawable.bolinha)
                jogador2.add(id)
                vezJogador =1
            }
            btnSelecionado.isEnabled = false
            checarVencedor()
        }

    // Funtion para verificar quem ganhou a partida
    fun checarVencedor (){
        var vencedor = -1

        // **** Inicio verificação das Horizontais ****
        //Horizontal 1
        if (jogador1.contains(1) && jogador1.contains(2) && jogador1.contains(3)){
            vencedor = 1
        }else if (jogador2.contains(1) && jogador2.contains(2) && jogador2.contains(3)){
            vencedor = 2
        }
        //Horizontal 2
        if (jogador1.contains(4) && jogador1.contains(5) && jogador1.contains(6)){
            vencedor = 1
        }else if (jogador2.contains(4) && jogador2.contains(5) && jogador2.contains(6)){
            vencedor = 2
        }
        //Horizontal 3
        if (jogador1.contains(7) && jogador1.contains(8) && jogador1.contains(9)){
            vencedor = 1
        }else if (jogador2.contains(7) && jogador2.contains(8) && jogador2.contains(9)){
            vencedor = 2
        }

        // **** Inicio verificação das Verticais ****

        //Vertical 1
        if (jogador1.contains(1) && jogador1.contains(4) && jogador1.contains(7)){
            vencedor = 1
        }else if (jogador2.contains(1) && jogador2.contains(4) && jogador2.contains(7)){
            vencedor = 2
        }
        //Vertical 2
        if (jogador1.contains(2) && jogador1.contains(5) && jogador1.contains(8)){
            vencedor = 1
        }else if (jogador2.contains(2) && jogador2.contains(5) && jogador2.contains(8)){
            vencedor = 2
        }
        //Vertical 3
        if (jogador1.contains(3) && jogador1.contains(6) && jogador1.contains(9)){
            vencedor = 1
        }else if (jogador2.contains(3) && jogador2.contains(6) && jogador2.contains(9)){
            vencedor = 2
        }

        // **** Inicio verificação das Diagonais ****

        //Diagonal 1
        if (jogador1.contains(1) && jogador1.contains(5) && jogador1.contains(9)){
            vencedor = 1
        }else if (jogador2.contains(1) && jogador2.contains(5) && jogador2.contains(9)){
            vencedor = 2
        }
        //Diagonal 2
        if (jogador1.contains(3) && jogador1.contains(5) && jogador1.contains(7)){
            vencedor = 1
        }else if (jogador2.contains(3) && jogador2.contains(5) && jogador2.contains(7)){
            vencedor = 2
        }

        if(vencedor!=-1) {
            if (vencedor == 1) {
                Toast.makeText(this, "Player 1 Win the Game!!!", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Player 2 Win the Game!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }






}