package com.ide.footballmatch.livetv.activity;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.ide.footballmatch.livetv.R;
import com.ide.footballmatch.livetv.util.SharePreferencess;
import com.pesonal.adsdk.AppManage;

public class ThankyouActivity extends AppCompatActivity {
    RelativeLayout native_ads;
    SharePreferencess sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        native_ads = findViewById(R.id.native_ads);
        sp = new SharePreferencess(this);
        AppManage.getInstance(ThankyouActivity.this).loadInterstitialAd(this);
        AppManage.getInstance(ThankyouActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
 //       AppManage.getInstance(ThankyouActivity.this).showNativeBanner((ViewGroup) findViewById(R.id.ad_banner), ADMOB_B[0], FACEBOOK_NB[0]);

    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        VPNActivity.stopVpn();
    }
}