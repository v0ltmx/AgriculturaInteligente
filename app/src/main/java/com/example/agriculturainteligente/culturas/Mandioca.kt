package com.example.agriculturainteligente.culturas

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.agriculturainteligente.Agriculturas
import com.example.agriculturainteligente.R
import com.example.agriculturainteligente.databinding.ActivityMandiocaBinding
import com.example.agriculturainteligente.dialogs.DialogFeijao
import com.example.agriculturainteligente.dialogs.DialogMandioca
import com.example.agriculturainteligente.viewmodels.Vmodel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mandioca.*

class Mandioca : AppCompatActivity() {
    lateinit var binding: ActivityMandiocaBinding
    lateinit var viewModel: Vmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mandioca)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_mandioca)
        //viewModel = ViewModelProvider(this).get(Vmodel::class.java)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        binding.apply {
            voltarMandioca.setOnClickListener{
                val intent = Intent(this@Mandioca, Agriculturas::class.java)
                startActivity(intent)
            }
            botaoSobreMandioca.setOnClickListener {
                var dialog = DialogMandioca()
                dialog.show(supportFragmentManager,"Dialog")
            }
        }
    }

    /*
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1->{
                when(resultCode){

                    Activity.RESULT_OK->{
                        val result = data?.extras?.getString("resultado")
                        viewModel.resultado1 = result.toString()
                        binding.txtResultadomandioca.text = result
                    }
                }
            }

        }*/

    }




