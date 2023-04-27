package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ThaiEntree extends AppCompatActivity {

    private WebView ThaiEntree;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        ThaiEntree = (WebView) findViewById(R.id.ItalianAppetizer);
        ThaiEntree.setWebViewClient(new ThaiEntree.myWebClient());
        ThaiEntree.getSettings().setJavaScriptEnabled(true);
        ThaiEntree.loadUrl("https://www.delicious.com.au/recipes/collections/gallery/52-easy-thai-recipes-for-any-night-of-the-week/9bmjz8qs?page=3");
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
        if(ThaiEntree.canGoBack()) {
            ThaiEntree.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}