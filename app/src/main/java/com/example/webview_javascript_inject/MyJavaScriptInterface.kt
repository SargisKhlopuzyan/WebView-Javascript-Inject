package com.example.webview_javascript_inject

import android.util.Log
import android.webkit.JavascriptInterface




class MyJavaScriptInterface {
    @JavascriptInterface
    fun processHTML(html: String) {
        //called by javascript
        Log.e("LOG_TAG", "html: $html")
    }
}