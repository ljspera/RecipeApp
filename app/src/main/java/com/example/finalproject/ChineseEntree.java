package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ChineseEntree extends AppCompatActivity {

    private WebView ChineseEntree;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        ChineseEntree = (WebView) findViewById(R.id.ItalianAppetizer);
        ChineseEntree.setWebViewClient(new ChineseEntree.myWebClient());
        ChineseEntree.getSettings().setJavaScriptEnabled(true);
        ChineseEntree.loadUrl("https://www.allrecipes.com/recipes/695/world-cuisine/asian/chinese/");

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
        if(ChineseEntree.canGoBack()) {
            ChineseEntree.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}