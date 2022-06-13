package com.example.googleplay_thiagoaguiar10.view

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.googleplay_thiagoaguiar10.model.GameType

class FragmentTypeAdater(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = GameType.values().size
    /*
    • Não vai mais usar
     override fun getItemCount(): Int {
        return 10
    }
     */

    override fun createFragment(position: Int): Fragment {
        return GameFragment()
    }
}