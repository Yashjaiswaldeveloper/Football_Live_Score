package com.ide.footballmatch.livetv.activity;

import static com.pesonal.adsdk.AppManage.ADMOB_I;
import static com.pesonal.adsdk.AppManage.FACEBOOK_I;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.webkit.WebView;

import com.ide.footballmatch.livetv.R;
import com.ide.footballmatch.livetv.databinding.ActivityMyWebBinding;
import com.pesonal.adsdk.AppManage;

public class MyWebActivity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web);
        webview=findViewById(R.id.webview);
        AppManage.getInstance(MyWebActivity.this).loadInterstitialAd(this, ADMOB_I[0], FACEBOOK_I[0]);
        webview.loadUrl(getIntent().getStringExtra("urls"));
    }

    @Override
    public void onBackPressed() {
        AppManage.getInstance(MyWebActivity.this).showBackPressAd(MyWebActivity.this, new AppManage.MyCallback() {
            @Override
            public void callbackCall() {
                MyWebActivity.super.onBackPressed();
            }
        });

    }
}