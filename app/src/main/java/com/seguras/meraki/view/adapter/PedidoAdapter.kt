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
import com.seguras.meraki.model.Pedido

class PedidoAdapter(val pedidos: ArrayList<Pedido>): RecyclerView.Adapter<PedidoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_pedidos, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemPedId.text = "Pedido #" + pedidos[position].id.toString()
        holder.itemFecha.text = pedidos[position].fecha
        holder.itemPedCantidad.text = "Numero de artículos: " + pedidos[position].cantidad
        holder.itemPedPrecio.text = "$ " + pedidos[position].precio
        holder.itemPedEstatus.text = pedidos[position].pedestatus
        holder.ivPedItem.setImageResource(R.drawable.prod1)
    }

    override fun getItemCount(): Int {
        return pedidos.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemPedId: TextView
        var itemFecha: TextView
        var itemPedCantidad: TextView
        var itemPedPrecio: TextView
        var itemPedEstatus: TextView
        var ivPedItem: ImageView

        init {
            itemPedId = itemView.findViewById(R.id.tvPedido)
            itemFecha = itemView.findViewById(R.id.tvPedidoFecha)
            itemPedCantidad = itemView.findViewById(R.id.tvPedidoCantidad)
            itemPedPrecio = itemView.findViewById(R.id.tvPedidoPrecio)
            ivPedItem = itemView.findViewById(R.id.ivPedidoItem)
            itemPedEstatus =itemView.findViewById(R.id.tvPedidoEstatus)
        }
    }
}