package com.example.sorteioprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View){
        //Gerar número aleatório
        val numeroAleatorio = (0..10).random()

        val texto = findViewById<TextView>(R.id.numEscolhido)
        texto.setText("O numero sorteado foi: ${numeroAleatorio}")
    }
}