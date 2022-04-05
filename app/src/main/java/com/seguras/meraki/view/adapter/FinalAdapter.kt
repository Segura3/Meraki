package com.seguras.meraki.view.adapter

import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.seguras.meraki.R
import com.seguras.meraki.databinding.CardFinalBinding
import com.seguras.meraki.model.Final

class FinalAdapter(val finals: ArrayList<Final>): RecyclerView.Adapter<FinalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_final, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemFinalProducto.text= finals[position].producto
        holder.itemFinalCantidad.text = "Cantidad: " + finals[position].cantidad
        holder.itemFinalPrecio.text = "$ " + finals[position].precio
        holder.ivFinalItem.setImageResource(R.drawable.prod1)
    }

    override fun getItemCount(): Int {
        return finals.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemFinalProducto: TextView
        var itemFinalCantidad: TextView
        var itemFinalPrecio: TextView
        var ivFinalItem: ImageView

        init {
            itemFinalProducto = itemView.findViewById(R.id.tvFinalProducto)
            itemFinalCantidad = itemView.findViewById(R.id.tvFinalCantidad)
            itemFinalPrecio = itemView.findViewById(R.id.tvFinalPrecio)
            ivFinalItem = itemView.findViewById(R.id.ivFinalItem)

        }
    }
}