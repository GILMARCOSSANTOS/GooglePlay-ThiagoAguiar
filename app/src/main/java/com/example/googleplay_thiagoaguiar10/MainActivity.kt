package com.example.googleplay_thiagoaguiar10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    /*Variáveis de Escopo Global*/
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Funções() */
        declararVariaveis()

        recyclerView.adapter = TmpAdapter()
    }

    class TmpAdapter : RecyclerView.Adapter<TmpView>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TmpView {
            return TmpView(
                LayoutInflater.from(parent.context).inflate(
                    android.R.layout.simple_list_item_1, parent, false
                )
            )
        }

        /* Testar branch*/

        override fun onBindViewHolder(holder: TmpView, position: Int) {
            (holder.itemView as TextView).text = "$position pos"
        }

        override fun getItemCount(): Int {
            return 35
        }

    }

    private fun declararVariaveis() {
        recyclerView = findViewById(R.id.rcclerVwTemporario_id)
    }
}

class TmpView(itemView: View) : RecyclerView.ViewHolder(itemView) {

}
