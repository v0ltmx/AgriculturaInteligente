package com.example.agriculturainteligente.culturas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.agriculturainteligente.Agriculturas
import com.example.agriculturainteligente.R
import com.example.agriculturainteligente.databinding.ActivityFeijaoBinding
import com.example.agriculturainteligente.dialogs.DialogFeijao
import com.example.agriculturainteligente.viewmodels.Vmodel

class Feijao : AppCompatActivity() {
    lateinit var binding: ActivityFeijaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feijao)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_feijao)

        binding.apply {
            voltarFeijao.setOnClickListener{
                val intent = Intent(this@Feijao, Agriculturas::class.java)
                startActivity(intent)
            }
            botaoSobreFeijao.setOnClickListener {
                var dialog = DialogFeijao()
                dialog.show(supportFragmentManager,"Dialog")
            }
        }
    }
}