package com.example.agriculturainteligente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import androidx.databinding.DataBindingUtil.setContentView
import com.example.agriculturainteligente.databinding.ActivityCalculoBinding

class Calculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityCalculoBinding
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        binding = setContentView(this,R.layout.activity_calculo)
        binding.apply{
            WebView.settings.javaScriptEnabled = true
            WebView.webChromeClient = WebChromeClient()
            WebView.loadUrl("https://calendario-seven.vercel.app/")
            btnVoltar.setOnClickListener {
                val intent = Intent(this@Calculo, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

}
