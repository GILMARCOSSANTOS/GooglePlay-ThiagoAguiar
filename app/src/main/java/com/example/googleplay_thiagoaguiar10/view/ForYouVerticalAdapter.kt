package com.example.googleplay_thiagoaguiar10.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay_thiagoaguiar10.R
import kotlinx.android.synthetic.main.item_game_for_you.view.*

class ForYouVerticalAdapter : RecyclerView.Adapter<ForYouVerticalAdapter.VerticalHolder>() {

    /*
   <!--
   ▬▬▬ DOCUMENTAÇÃO = Aula 03.007
   ▬ Navegação entre Activitys:
   • Activity Anterior: GameFragment.kt
   • Activity Atual: ForYouVerticalAdapter;
   • Activity Próxima: ForYouHorizontalAdapter;
   ▬ Descrição:
   •
   -->
    */

    /*
  <!--
  ▬▬▬ DOCUMENTAÇÃO = Aula 03.009
  ▬ Navegação entre Activitys:
  • Activity Anterior: ForYouHorinzontalAdapter
  • Activity Atual: ForYouVerticalAdapter;
  • Activity Próxima: item_game_for_you;
  ▬ Descrição:
  • Instanciar 'this.rV_horizontal_fragmentGame_id.adapter = ForYouHorinzontalAdapter()';
  -->
   */

    class VerticalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            with(itemView) {
                this.rV_horizontal_fragmentGame_id.layoutManager = LinearLayoutManager(
                    itemView.context, RecyclerView.HORIZONTAL, false
                )
                this.rV_horizontal_fragmentGame_id.adapter = ForYouHorinzontalAdapter()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalHolder {
        return VerticalHolder(
            LayoutInflater.from(parent.context).inflate
                (R.layout.item_game_for_you, parent, false)
        )
    }

    override fun onBindViewHolder(holder: VerticalHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 10
}