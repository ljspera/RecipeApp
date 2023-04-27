package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IndianAppetizer extends AppCompatActivity {

    private WebView IndianAppetizer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        IndianAppetizer = (WebView) findViewById(R.id.ItalianAppetizer);
        IndianAppetizer.setWebViewClient(new IndianAppetizer.myWebClient());
        IndianAppetizer.getSettings().setJavaScriptEnabled(true);
        IndianAppetizer.loadUrl("https://insanelygoodrecipes.com/indian-appetizers/");

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
        if(IndianAppetizer.canGoBack()) {
            IndianAppetizer.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}