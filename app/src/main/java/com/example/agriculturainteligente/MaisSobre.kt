package com.example.agriculturainteligente

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import com.example.agriculturainteligente.databinding.ActivityMaisSobreBinding
import androidx.databinding.DataBindingUtil.setContentView

class MaisSobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMaisSobreBinding
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mais_sobre)
        binding = setContentView(this, R.layout.activity_mais_sobre)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        binding.apply {
            WebView.settings.javaScriptEnabled = true
            WebView.webChromeClient = WebChromeClient()
            WebView.loadUrl("https://sobre-tads.vercel.app/")
            btnVoltar.setOnClickListener {
                val intent = Intent(this@MaisSobre, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}