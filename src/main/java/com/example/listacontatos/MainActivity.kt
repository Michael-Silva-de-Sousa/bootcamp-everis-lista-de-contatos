package com.example.listacontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvlist: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        updateList()
    }

    private fun bindView(){
        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList(){
        adapter.updateList(
            arrayListOf(
                Contact(
                    "Michael Silva de Sousa",
                    "(11) 9.7786 - 0977",
                    "img.png"
                ),
                Contact(
                    "Gabriela Barrales",
                    "(11) 9.8897 - 1066",
                    "img.png"
                )
            )
        )
    }
}