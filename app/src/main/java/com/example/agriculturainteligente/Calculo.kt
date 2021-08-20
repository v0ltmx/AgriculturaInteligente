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
        myWebView.loadUrl("https://rate-forecast.vercel.app/calendario.html")
        //myWebView.loadUrl("https://www.climatempo.com.br/climatologia/1373/macaiba-rn")

     /*
        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView?.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Note that months are indexed from 0. So, 0 means January, 1 means february, 2 means march etc.
            val msg = "A data selecionada foi " + dayOfMonth + "/" + (month + 1) + "/" + year
            Toast.makeText(this@Calculo, msg, Toast.LENGTH_SHORT).show()
        }
        calendarView?.dateTextAppearance.toString() */
        }
    }
