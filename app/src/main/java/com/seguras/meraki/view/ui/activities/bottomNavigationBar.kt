package com.seguras.meraki.view.ui.activities

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.seguras.meraki.R
import com.seguras.meraki.databinding.ActivityBottomNavigationBarBinding
import com.seguras.meraki.view.ui.fragments.CarritoFragment
import com.seguras.meraki.view.ui.fragments.CatalogoFragment
import com.seguras.meraki.view.ui.fragments.HomeFragment
import com.seguras.meraki.view.ui.fragments.PedidosFragment

class bottomNavigationBar : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavigationBarBinding
    private lateinit var homeFragment: HomeFragment
    private lateinit var catalogoFragment: CatalogoFragment
    private lateinit var pedidosFragment: PedidosFragment
    private lateinit var carritoFragment: CarritoFragment
    private val selectedTab: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeLayout: LinearLayout = binding.homeLayout
        val catalogoLayout: LinearLayout = binding.catalogoLayout
        val pedidoslayout: LinearLayout = binding.pedidosLayout
        val carritoLayout: LinearLayout = binding.carritoLayout

        val ivHome: ImageView = binding.ivHome
        val ivCat: ImageView = binding.ivCat
        val ivPedidos: ImageView = binding.ivPedidos
        val ivCart: ImageView = binding.ivCart

        val tvHome: TextView = binding.tvHome
        val tvCat: TextView = binding.tvCat
        val tvPedidos: TextView = binding.tvPedidos
        val tvCart: TextView = binding.tvCart

        homeFragment = HomeFragment()
        catalogoFragment = CatalogoFragment()
        pedidosFragment = PedidosFragment()
        carritoFragment = CarritoFragment()

        supportFragmentManager.beginTransaction().add(R.id.flFragmentCont, homeFragment).commit()
    }

    fun clickHome(view: View) {
        with(binding){
            tvHome.visibility = View.VISIBLE
            tvCat.visibility = View.GONE
            tvPedidos.visibility = View.GONE
            tvCart.visibility = View.GONE

            homeLayout.setBackgroundResource(R.drawable.rb_home)
            catalogoLayout.setBackgroundColor(Color.TRANSPARENT)
            pedidosLayout.setBackgroundColor(Color.TRANSPARENT)
            carritoLayout.setBackgroundColor(Color.TRANSPARENT)

            var scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f)
            scaleAnimation.duration = 200
            scaleAnimation.fillAfter = true
            homeLayout.startAnimation(scaleAnimation)

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(flFragmentCont.id,homeFragment).commit()
        }
    }

    fun clickCatalog(view: View) {
        with(binding){
            tvHome.visibility = View.GONE
            tvCat.visibility = View.VISIBLE
            tvPedidos.visibility = View.GONE
            tvCart.visibility = View.GONE

            homeLayout.setBackgroundColor(Color.TRANSPARENT)
            catalogoLayout.setBackgroundResource(R.drawable.rb_home)
            pedidosLayout.setBackgroundColor(Color.TRANSPARENT)
            carritoLayout.setBackgroundColor(Color.TRANSPARENT)

            var scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f)
            scaleAnimation.duration = 200
            scaleAnimation.fillAfter = true
            catalogoLayout.startAnimation(scaleAnimation)

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(flFragmentCont.id,catalogoFragment).commit()
        }
    }
    fun clickPedidos(view: View) {
        with(binding){
            tvHome.visibility = View.GONE
            tvCat.visibility = View.GONE
            tvPedidos.visibility = View.VISIBLE
            tvCart.visibility = View.GONE

            homeLayout.setBackgroundColor(Color.TRANSPARENT)
            catalogoLayout.setBackgroundColor(Color.TRANSPARENT)
            pedidosLayout.setBackgroundResource(R.drawable.rb_home)
            carritoLayout.setBackgroundColor(Color.TRANSPARENT)

            var scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f)
            scaleAnimation.duration = 200
            scaleAnimation.fillAfter = true
            pedidosLayout.startAnimation(scaleAnimation)

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(flFragmentCont.id,pedidosFragment).commit()
        }
    }
    fun clickCarrito(view: View) {
        with(binding){
            tvHome.visibility = View.GONE
            tvCat.visibility = View.GONE
            tvPedidos.visibility = View.GONE
            tvCart.visibility = View.VISIBLE

            homeLayout.setBackgroundColor(Color.TRANSPARENT)
            catalogoLayout.setBackgroundColor(Color.TRANSPARENT)
            pedidosLayout.setBackgroundColor(Color.TRANSPARENT)
            carritoLayout.setBackgroundResource(R.drawable.rb_home)

            var scaleAnimation = ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f)
            scaleAnimation.duration = 200
            scaleAnimation.fillAfter = true
            carritoLayout.startAnimation(scaleAnimation)

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(flFragmentCont.id,carritoFragment).commit()
        }
    }

    fun clickGoCat(view: View) {
        clickCatalog(view)
    }

    fun clickGoDiseno(view: View) {
        Toast.makeText(this,"Diseño personalizado en construcción", Toast.LENGTH_SHORT).show()
    }
    fun clickGoPedidos(view: View) {
        clickPedidos(view)
    }
    fun clickGoPromo(view: View) {
        //Necesario implementar un filtro para el catalogo, temporalmente solo llamamos al catalogo
        clickCatalog(view)
    }
    fun clickGoPreguntas(view: View) {
        Toast.makeText(this,"Preguntas frecuentes en construcción", Toast.LENGTH_SHORT).show()
    }
    fun clickGoContacto(view: View) {
        Toast.makeText(this,"Contactanos en construcción", Toast.LENGTH_SHORT).show()
    }


    fun comprar(view: View) {
        val intent = Intent(this, Pago::class.java)
        startActivity(intent)
    }

    fun clickGoHome(view: View) {
        clickHome(view)
    }
}