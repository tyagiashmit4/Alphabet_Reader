package com.ashmit.alphabets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alphabets=generateList()

        val rvAlphabets=findViewById<RecyclerView>(R.id.rv_alphabets)
        rvAlphabets.adapter=AlphabetsAdapters(alphabets)
        rvAlphabets.layoutManager= LinearLayoutManager(this)
        rvAlphabets.setHasFixedSize(true)
    }

    fun generateList(): List<Alphabets> {
        val alphabets = mutableListOf<Alphabets>()
        alphabets.add(Alphabets("A", "Apple"))
        alphabets.add(Alphabets("B", "Banana"))
        alphabets.add(Alphabets("C", "Cat"))
        alphabets.add(Alphabets("D", "Dog"))
        alphabets.add(Alphabets("E", "Eye"))
        alphabets.add(Alphabets("F", "Fish"))
        alphabets.add(Alphabets("G", "Grapes"))
        alphabets.add(Alphabets("H", "Hen"))
        alphabets.add(Alphabets("I", "Ice"))
        alphabets.add(Alphabets("J", "Joker"))
        alphabets.add(Alphabets("K", "Kite"))
        alphabets.add(Alphabets("L", "Lion"))
        alphabets.add(Alphabets("M", "Monkey"))
        alphabets.add(Alphabets("N", "Nest"))
        alphabets.add(Alphabets("O", "Orange"))
        alphabets.add(Alphabets("P", "Parrot"))
        alphabets.add(Alphabets("Q", "Queen"))
        alphabets.add(Alphabets("R", "Rat"))
        alphabets.add(Alphabets("S", "Snake"))
        alphabets.add(Alphabets("T", "Table"))
        alphabets.add(Alphabets("U", "Umbrella"))
        alphabets.add(Alphabets("V", "Violin"))
        alphabets.add(Alphabets("W", "Watch"))
        alphabets.add(Alphabets("X", "Xray"))
        alphabets.add(Alphabets("Y", "Yak"))
        alphabets.add(Alphabets("Z", "Zebra"))

        return alphabets
    }
}
