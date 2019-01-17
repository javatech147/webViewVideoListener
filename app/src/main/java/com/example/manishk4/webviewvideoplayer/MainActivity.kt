package com.example.manishk4.webviewvideoplayer

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

@SuppressLint("SetJavaScriptEnabled")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        * This javaScriptEnabled is mandatory if you have written java script code in HTML file
        * */
        webView.settings.javaScriptEnabled = true

        // It is mandatory to add webViewClient
        webView.webViewClient = WebViewClient()
        webView.loadUrl("file:///android_asset/sample_video.html")
        webView.addJavascriptInterface(WebAppInterface(this), "Android")


        /* webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true
        webView.settings.mediaPlaybackRequiresUserGesture = false
        webView.webChromeClient = WebChromeClient()
        webView.loadUrl("file:///android_asset/sample_video.html")
        webView.addJavascriptInterface(WebAppInterface(this), "Android")*/
    }
}
