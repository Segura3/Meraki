package com.seguras.meraki.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.seguras.meraki.R
import com.seguras.meraki.databinding.FragmentCarritoBinding
import com.seguras.meraki.model.Carrito
import com.seguras.meraki.view.adapter.CarritoAdapter


class CarritoFragment : Fragment() {

    private lateinit var binding: FragmentCarritoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCarritoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var datos = ArrayList<Carrito>()

        //Se necesita obtener esta informacion de algua fuente como una base de datos
        val producto = Carrito(1, "Playera Raglan", "100", "1")
        val producto2 = Carrito(1, "Tasa navideña", "150", "2")
        val producto3 = Carrito(1, "Pañalero 3 años", "180", "3")
        val producto4 = Carrito(1, "Pañalero 2 años", "180", "1")
        //val producto5 = Carrito(1, "Pañalero 1 años", "180", "5")
        datos.add(producto)
        datos.add(producto2)
        datos.add(producto3)
        datos.add(producto4)
        //datos.add(producto5)


        val adapter = CarritoAdapter(datos)

        with(binding){
            rvCarrito.layoutManager = LinearLayoutManager(requireContext())
            rvCarrito.adapter = adapter
        }
    }
}