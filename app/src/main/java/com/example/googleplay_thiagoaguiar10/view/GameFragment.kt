package com.example.googleplay_thiagoaguiar10.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay_thiagoaguiar10.R

class GameFragment: Fragment(){

    private var forYouVerticalAdapter: ForYouVerticalAdapter? = null

    /*
    <!--
    ▬▬▬ DOCUMENTAÇÃO = Aula 03.006
    ▬ Navegação entre Activitys:
    • Activity Anterior: item_game_for_you.xml;
    • Activity Atual: GameFragment.kt
    • Activity Próxima: ForYouVerticalAdapter;
    ▬ Descrição:
    • Renderizar os itens de 'item_game.xml' e 'item_game_foryou.xml'.
    • Renderizar 'fragment_game.xml'.
    • Invocar 'view.findViewById<RecyclerView>(R.id.rV_vertical_fragmentGame_id)';
    -->
     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        forYouVerticalAdapter = ForYouVerticalAdapter()
        view.findViewById<RecyclerView>(R.id.rV_vertical_fragmentGame_id).adapter = forYouVerticalAdapter


    }
}

