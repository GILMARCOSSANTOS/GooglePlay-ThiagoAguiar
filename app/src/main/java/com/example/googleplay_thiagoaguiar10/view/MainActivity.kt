package com.example.googleplay_thiagoaguiar10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay_thiagoaguiar10.view.MainFragment



class MainActivity : AppCompatActivity() {

    /*Variáveis de Escopo Global*/
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.container_frameLayout_actvtMain, MainFragment())
                .commitNow()
        }
    }

}
