package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ThaiAppetizer extends AppCompatActivity {

    private WebView ThaiAppetizer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        ThaiAppetizer = (WebView) findViewById(R.id.ItalianAppetizer);
        ThaiAppetizer.setWebViewClient(new ThaiAppetizer.myWebClient());
        ThaiAppetizer.getSettings().setJavaScriptEnabled(true);
        ThaiAppetizer.loadUrl("https://insanelygoodrecipes.com/thai-appetizers/");

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
        if(ThaiAppetizer.canGoBack()) {
            ThaiAppetizer.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}