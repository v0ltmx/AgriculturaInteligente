package com.example.agriculturainteligente.culturas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.agriculturainteligente.Agriculturas
import com.example.agriculturainteligente.R
import com.example.agriculturainteligente.databinding.ActivityMilhoBinding

import com.example.agriculturainteligente.dialogs.DialogMilho
import com.example.agriculturainteligente.viewmodels.Vmodel

class Milho : AppCompatActivity() {
    lateinit var binding: ActivityMilhoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milho)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_milho)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        binding.apply {
            voltarMilho.setOnClickListener{
                val intent = Intent(this@Milho, Agriculturas::class.java)
                startActivity(intent)
            }
            botaoSobreMilho.setOnClickListener {
                var dialog = DialogMilho()
                dialog.show(supportFragmentManager,"Dialog")
            }
        }
    }
}