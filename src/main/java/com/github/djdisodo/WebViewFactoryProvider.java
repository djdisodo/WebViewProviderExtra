package com.github.djdisodo;

import android.webkit.WebView;
import android.webkit.WebViewProvider;

public interface WebViewFactoryProvider extends android.webkit.WebViewFactoryProvider {
    @Override
    default WebViewProvider createWebView(WebView webView, WebView.PrivateAccess privateAccess) {
        return null;
    }

    WebViewProvider createWebView(WebView webView, WebViewPrivateAccess privateAccess);
}
