package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ItalianDessert extends AppCompatActivity {

    private WebView ItalianDessert;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        ItalianDessert = (WebView) findViewById(R.id.ItalianAppetizer);
        ItalianDessert.setWebViewClient(new ItalianDessert.myWebClient());
        ItalianDessert.getSettings().setJavaScriptEnabled(true);
        ItalianDessert.loadUrl("https://www.foodnetwork.com/topics/italian-dessert");

    }

    private class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;

        }
    }

    @Override
    // This method is used to detect back button
    public void onBackPressed() {
        if(ItalianDessert.canGoBack()) {
            ItalianDessert.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }

}