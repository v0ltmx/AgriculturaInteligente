package com.example.agriculturainteligente

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.CalendarView
import android.widget.Toast

class Calculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)
        val myWebView: WebView = findViewById(R.id.webview)
        //myWebView.loadUrl("https://sobre-tads.vercel.app/")
        myWebView.loadUrl("https://calendario-seven.vercel.app/")
        //val myWebView1: WebView = findViewById(R.id.webview)
        //myWebView1.loadUrl("https://calculo-agro-clima.vercel.app/")
        //myWebView.loadUrl("https://www.climatempo.com.br/climatologia/1373/macaiba-rn")


        }
    }


