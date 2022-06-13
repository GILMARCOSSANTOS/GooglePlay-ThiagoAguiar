package com.example.googleplay_thiagoaguiar10.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.googleplay_thiagoaguiar10.R
import com.example.googleplay_thiagoaguiar10.model.GameType
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
<!--
▬▬▬ DOCUMENTAÇÃO = 009:
• Activity Anterior: activity_main
• Activity Atual: MainFragment
• Activity Próxima: fragment_main.xml
• Descrição: Excluir Códigos desnecessários que são criados de Forma
automática.
1 - A única parte do Código que será usada será a Classe MainFragment() e o Método 'OncreateView()':
class MainFragment : Fragment() {

override fun onCreateView(
inflater: LayoutInflater, container: ViewGroup?,
savedInstanceState: Bundle?
): View? {
// Inflate the layout for this fragment
return inflater.inflate(R.layout.fragment_main, container, false)
}
}
-->
 */

/*
<!--
▬▬▬ DOCUMENTAÇÃO = 011:
▬ Navegação entre Activitys:
• Activity Anterior: fragment_main.xml
• Activity Atual: MainFragment
• Activity Próxima:
▬ Descrição:
• Implementar os Métodos onViewCreated();
• Implemenar os Métodos FragmentTypeAdapter();

-->
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    /*
    •Não vai mais usar:
         val arrayList = arrayListOf("Assss", "Bsss", "Csdd", "Dddd", "Esds", "Fsdas", "Gasd", "Hsda", "Iasd", "sdaJ")

     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.frag_view_pager.adapter = FragmentTypeAdater(this)
        //Impedir rolagem lateral do TabLayout
        view.frag_view_pager.isUserInputEnabled = false

        TabLayoutMediator(view.tab_layout, view.frag_view_pager) { tab, position ->
            tab.text = GameType.values()[position].label
        }.attach()
    }
}






