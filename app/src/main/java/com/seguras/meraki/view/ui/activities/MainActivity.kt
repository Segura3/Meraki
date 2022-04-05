package com.seguras.meraki.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.seguras.meraki.R
import com.seguras.meraki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun click(view: View) {
        val intent = Intent(this, bottomNavigationBar::class.java)

        startActivity(intent)
    }

    fun clickForgot(view: View) {
        Toast.makeText(this,"En construcción", Toast.LENGTH_SHORT).show()
    }
    fun clickReg(view: View) {
        Toast.makeText(this,"En construcción", Toast.LENGTH_SHORT).show()
    }
}