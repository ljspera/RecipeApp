package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ChineseDessert extends AppCompatActivity {

    private WebView ChineseDessert;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        ChineseDessert = (WebView) findViewById(R.id.ItalianAppetizer);
        ChineseDessert.setWebViewClient(new ChineseDessert.myWebClient());
        ChineseDessert.getSettings().setJavaScriptEnabled(true);
        ChineseDessert.loadUrl("https://insanelygoodrecipes.com/chinese-desserts/");

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
        if(ChineseDessert.canGoBack()) {
            ChineseDessert.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}