package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MexicanEntree extends AppCompatActivity {

    private WebView MexicanEntree;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_sweet);
        MexicanEntree = (WebView) findViewById(R.id.ItalianAppetizer);
        MexicanEntree.setWebViewClient(new MexicanEntree.myWebClient());
        MexicanEntree.getSettings().setJavaScriptEnabled(true);
        MexicanEntree.loadUrl("https://www.delish.com/cooking/g1393/traditional-mexican-food-0710/");

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
        if(MexicanEntree.canGoBack()) {
            MexicanEntree.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }
}