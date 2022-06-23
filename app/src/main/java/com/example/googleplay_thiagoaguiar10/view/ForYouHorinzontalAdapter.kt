package com.example.googleplay_thiagoaguiar10.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay_thiagoaguiar10.R
import kotlinx.android.synthetic.main.item_game_for_you.view.*

class ForYouHorinzontalAdapter: RecyclerView.Adapter<ForYouHorinzontalAdapter.HorizontalHolder>() {

    /*
   <!--
   ▬▬▬ DOCUMENTAÇÃO = Aula 03.008
   ▬ Navegação entre Activitys:
   • Activity Anterior: ForYouVerticalAdapter;
   • Activity Atual: ForYouHorinzontalAdapter
   • Activity Próxima: ForYouVerticalAdapter;
   ▬ Descrição:
   •
   -->
    */

    class HorizontalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            with(itemView) {

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalHolder {
        return HorizontalHolder(
            LayoutInflater.from(parent.context).inflate
                (R.layout.item_game, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HorizontalHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 30
}