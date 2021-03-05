package com.example.listacontatos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

/** Essa classe realiza o gerenciamento da lista de contatos
 * */
class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder>(){

    /** Variavel que armazena a lista.
     * */
    private val list : MutableList<Contact> = mutableListOf()

    /**
     * Responsavel por criar cada item visual na tela.
     * Infla a lista para poder exibir.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactAdapterViewHolder(view)
    }

    /**
     * Responsavel por obter cada item do array
     * e popular na lista do RecycleView. Populando a lista.
     */
    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    /**
     * Quantidade de itens que existe na lista.
     */
    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(list: List<Contact>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()//Notifica o adapter que a lista utilizada na rendereização foi modificada.
    }

    /** Essa classe realiza o gerenciamento dos itens da lista de contatos.
     * */
    class ContactAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private  val tvName: TextView = itemView.findViewById(R.id.lv_name)
        private  val tvPhone: TextView = itemView.findViewById(R.id.lv_phone)
        private  val tvPhoto: TextView = itemView.findViewById(R.id.lv_photo)

        fun bind(contact: Contact){
            tvName.text = contact.name
            tvPhone.text = contact.phone
            tvPhoto.text = contact.photo
        }
    }
}