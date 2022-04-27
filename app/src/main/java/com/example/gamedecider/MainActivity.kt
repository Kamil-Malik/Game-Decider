package com.example.gamedecider

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    val gameList = arrayListOf("Geometry Dash")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDecide = findViewById<Button>(R.id.btn_decide)
        val btnTambah = findViewById<Button>(R.id.btn_tambah)
        val tvGame = findViewById<TextView>(R.id.tvGame)
        val addGame = findViewById<EditText>(R.id.add_game)
        btnDecide.setOnClickListener {
            val random = Random()
            val randomGame = random.nextInt(gameList.count())
            tvGame.text = gameList[randomGame]
        }
        btnTambah.setOnClickListener {
            val newGame = addGame.text.toString()
            gameList.add(newGame)
            addGame.text.clear()
        }
    }
}