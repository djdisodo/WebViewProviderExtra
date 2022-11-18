package com.github.djdisodo;

import android.webkit.WebView;
import android.webkit.WebViewProvider;

public interface WebViewFactoryProvider extends android.webkit.WebViewFactoryProvider {
    @Override
    default WebViewProvider createWebView(WebView webView, WebView.PrivateAccess privateAccess) {
        return createWebView(webView, new WebViewPrivateAccess(privateAccess));
    }

    WebViewProvider createWebView(WebView webView, WebViewPrivateAccess privateAccess);
}
