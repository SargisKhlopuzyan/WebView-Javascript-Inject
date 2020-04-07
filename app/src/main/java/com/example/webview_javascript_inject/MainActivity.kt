package com.example.webview_javascript_inject

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)

        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.google.com");



        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

//                webView.loadUrl(
//                        "javascript:(function() { " +
//                                "var element = document.getElementById('hplogo');"
//                                + "element.parentNode.removeChild(element);" +
//                                "})()")

                webView.loadUrl(
                    "javascript:(function() { " +
                            "var element = document.querySelector('input.gLFyf');" //.gsfi
                            + "element.value = 'Sargis';" +
                            "})()"
                )
            }
        }

//        sb.append("var inputs = document.getElementsByClassName('gsfi');")
//        webView.addJavascriptInterface(MyJavaScriptInterface(), "MYOBJECT")
    }
}
