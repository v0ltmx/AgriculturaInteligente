package com.example.agriculturainteligente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        val myWebView1: WebView = findViewById(R.id.webview)
        myWebView1.loadUrl("https://sobre-tads.vercel.app/")

    }
}