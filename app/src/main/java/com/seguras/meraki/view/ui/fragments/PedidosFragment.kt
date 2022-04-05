package com.seguras.meraki.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.seguras.meraki.R
import com.seguras.meraki.databinding.FragmentPedidosBinding
import com.seguras.meraki.model.Pedido
import com.seguras.meraki.view.adapter.PedidoAdapter


class PedidosFragment : Fragment() {

    private lateinit var binding: FragmentPedidosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPedidosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var datos = ArrayList<Pedido>()

        //Se necesita obtener esta informacion de algua fuente como una base de datos
        val pedido = Pedido(36524, "10 de enero de 2022", "100", "1","Procesado")
        val pedido2 = Pedido(10785, "26 de octubre de 2021", "150", "2","Procesado")
        val pedido3 = Pedido(37569, "15 de marzo de 2022", "150", "2","Procesado")
        val pedido4 = Pedido(20485, "30 de diciembre de 2021", "180", "1", "Procesado")
        datos.add(pedido)
        datos.add(pedido2)
        datos.add(pedido3)
        datos.add(pedido4)
        //datos.add(producto5)


        val adapter = PedidoAdapter(datos)

        with(binding){
            rvPedido.layoutManager = LinearLayoutManager(requireContext())
            rvPedido.adapter = adapter
        }
    }
}