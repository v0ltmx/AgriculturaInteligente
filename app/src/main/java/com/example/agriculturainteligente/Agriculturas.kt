package com.example.agriculturainteligente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.agriculturainteligente.culturas.Feijao
import com.example.agriculturainteligente.culturas.Mandioca
import com.example.agriculturainteligente.culturas.Milho
import com.example.agriculturainteligente.databinding.ActivityAgriculturasBinding

class Agriculturas : AppCompatActivity() {
    lateinit var binding: ActivityAgriculturasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agriculturas)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_agriculturas)
        binding.apply {

            voltarInicio.setOnClickListener{
                val intent = Intent(this@Agriculturas, MainActivity::class.java)
                startActivity(intent)
            }
            botaoMandioca.setOnClickListener {
                val intent = Intent(this@Agriculturas, Mandioca::class.java)
                startActivity(intent)
            }
            botaoMilho.setOnClickListener {
                val intent = Intent(this@Agriculturas, Milho::class.java)
                startActivity(intent)
            }
            botaoFeijao.setOnClickListener {
                val intent = Intent(this@Agriculturas, Feijao::class.java)
                startActivity(intent)
            }
        }
    }
}