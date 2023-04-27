package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ItalianSour extends AppCompatActivity {

    private WebView ItalianEntree;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        ItalianEntree = (WebView) findViewById(R.id.ItalianAppetizer);
        ItalianEntree.setWebViewClient(new ItalianSour.myWebClient());
        ItalianEntree.getSettings().setJavaScriptEnabled(true);
        ItalianEntree.loadUrl("https://www.foodandwine.com/travel/europe/italy/italian-main-dishes");

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
        if(ItalianEntree.canGoBack()) {
            ItalianEntree.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}