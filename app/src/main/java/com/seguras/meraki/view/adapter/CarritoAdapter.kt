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
import com.seguras.meraki.databinding.CardPedidoBinding
import com.seguras.meraki.model.Carrito

class CarritoAdapter(val carritos: ArrayList<Carrito>): RecyclerView.Adapter<CarritoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_pedido, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemNombre.text = carritos[position].nombre
        holder.itemCantidad.setText(carritos[position].cantidad)
        holder.itemPrecio.text = "$ " + carritos[position].precio
        holder.ivItem.setImageResource(R.drawable.prod1)
    }

    override fun getItemCount(): Int {
        return carritos.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemNombre: TextView
        lateinit var itemPrecio: TextView
        lateinit var itemCantidad: EditText
        lateinit var ivItem: ImageView

        init {
            itemNombre = itemView.findViewById(R.id.tvNameProd)
            itemPrecio = itemView.findViewById(R.id.tvPrecio)
            itemCantidad = itemView.findViewById(R.id.etCantidad)
            ivItem = itemView.findViewById(R.id.ivItem)
        }
    }
}



