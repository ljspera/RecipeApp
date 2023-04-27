package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MexicanAppetizer extends AppCompatActivity {

    private WebView MexicanAppetizer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        MexicanAppetizer = (WebView) findViewById(R.id.ItalianAppetizer);
        MexicanAppetizer.setWebViewClient(new MexicanAppetizer.myWebClient());
        MexicanAppetizer.getSettings().setJavaScriptEnabled(true);
        MexicanAppetizer.loadUrl("https://www.acouplecooks.com/mexican-appetizers/");

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
        if(MexicanAppetizer.canGoBack()) {
            MexicanAppetizer.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}