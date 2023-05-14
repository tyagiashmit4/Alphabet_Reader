package com.ashmit.alphabets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class AlphabetsAdapters (private val alphabetList: List<Alphabets>): RecyclerView.Adapter<AlphabetsAdapters.AlphabetViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlphabetViewHolder {
     val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.row_alphabets,parent,false)
        return AlphabetViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: AlphabetViewHolder, position: Int) {
        val currentItem = alphabetList[position]

        holder.tvLetter.text=currentItem.letter
        holder.tvWords.text=currentItem.word
    }

    override fun getItemCount() = alphabetList.size


    class AlphabetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvLetter: TextView= itemView.findViewById(R.id.txt_alphabet)
        val tvWords: TextView= itemView.findViewById(R.id.txt_name)

    }


}