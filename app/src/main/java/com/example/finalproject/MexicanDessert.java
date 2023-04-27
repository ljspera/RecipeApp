package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MexicanDessert extends AppCompatActivity {

    private WebView MexicanDessert;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        MexicanDessert = (WebView) findViewById(R.id.ItalianAppetizer);
        MexicanDessert.setWebViewClient(new MexicanDessert.myWebClient());
        MexicanDessert.getSettings().setJavaScriptEnabled(true);
        MexicanDessert.loadUrl("https://insanelygoodrecipes.com/mexican-desserts/");

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
        if(MexicanDessert.canGoBack()) {
            MexicanDessert.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}