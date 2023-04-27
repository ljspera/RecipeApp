package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ChineseAppetizer extends AppCompatActivity {

    private WebView ChineseAppetizer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        ChineseAppetizer = (WebView) findViewById(R.id.ItalianAppetizer);
        ChineseAppetizer.setWebViewClient(new ChineseAppetizer.myWebClient());
        ChineseAppetizer.getSettings().setJavaScriptEnabled(true);
        ChineseAppetizer.loadUrl("https://insanelygoodrecipes.com/chinese-appetizers/");

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
        if(ChineseAppetizer.canGoBack()) {
            ChineseAppetizer.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}