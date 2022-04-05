package com.seguras.meraki.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.seguras.meraki.databinding.ActivityPagoBinding

class Pago : AppCompatActivity() {

    private lateinit var binding: ActivityPagoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun clickContCompra(view: View) {
        val intent = Intent(this, Finalizar::class.java)
        startActivity(intent)
    }
}