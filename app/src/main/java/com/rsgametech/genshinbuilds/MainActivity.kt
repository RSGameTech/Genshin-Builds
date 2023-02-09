package com.rsgametech.genshinbuilds

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainScreen = findViewById<WebView>(R.id.mainWebview)
        webViewSetUp(mainScreen)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(mainScreen: WebView) {
        mainScreen.webViewClient = WebViewClient()
        mainScreen.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://genshinbuild-devilslinger.glideapp.io/")
        }
    }
}