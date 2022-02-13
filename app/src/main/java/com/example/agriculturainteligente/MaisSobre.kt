package com.example.agriculturainteligente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MaisSobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mais_sobre)
        val myWebView2: WebView = findViewById(R.id.WebView)
        myWebView2.loadUrl("https://sobre-tads.vercel.app/")
    }
}