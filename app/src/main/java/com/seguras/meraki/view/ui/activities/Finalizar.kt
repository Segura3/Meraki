package com.seguras.meraki.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.seguras.meraki.databinding.ActivityFinalizarBinding
import com.seguras.meraki.model.Final
import com.seguras.meraki.view.adapter.FinalAdapter

class Finalizar : AppCompatActivity() {

    private lateinit var binding: ActivityFinalizarBinding
    var datos = ArrayList<Final>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalizarBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //Se necesita obtener esta informacion de algua fuente como una base de datos
        val final = Final(1, "Playera Raglan", "100", "1")
        val final2 = Final(1, "Tasa navideña", "150", "2")
        val final3 = Final(1, "Pañalero 3 años", "150", "2")
        val final4 = Final(1, "Pañalero 2 años", "180", "1")
        datos.add(final)
        datos.add(final2)
        datos.add(final3)
        datos.add(final4)
        //datos.add(producto5)


        val adapter = FinalAdapter(datos)

        binding.rvPedidoFinal.adapter = adapter
        binding.rvPedidoFinal.layoutManager = LinearLayoutManager(this)
    }

    fun clickFinalizar(view: View) {
        //Esto se puede modificar para presentar una pantalla mas elaborada
        Toast.makeText(this,"Compra completada", Toast.LENGTH_SHORT).show()
    }
    fun backtoOrden(view: View) {
        val intent = Intent(this, Pago::class.java)
        startActivity(intent)
    }
}