package com.ide.footballmatch.livetv.activity;



import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ide.footballmatch.livetv.R;
import com.ide.footballmatch.livetv.util.SharePreferencess;

import com.pesonal.adsdk.AppManage;

public class ExitActivity extends AppCompatActivity {
    TextView yes_btn, rate_btn, no_btn;
    RelativeLayout native_ads;
    SharePreferencess sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
        yes_btn = findViewById(R.id.yes_btn);
        rate_btn = findViewById(R.id.rate_btn);
        no_btn = findViewById(R.id.no_btn);
        native_ads = findViewById(R.id.native_ads);
        sp = new SharePreferencess(this);
        AppManage.getInstance(ExitActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
//        AppManage.getInstance(ExitActivity.this).showNative((ViewGroup) findViewById(R.id.ad_banner), ADMOB_B[0], FACEBOOK_NB[0]);

        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                stopVpn();
              //  AppManage.getInstance(ExitActivity.this).showInterstitialAd(ExitActivity.this, new AppManage.MyCallback() {
                 //  public void callbackCall() {
                        startActivity(new Intent(getApplicationContext(), ThankyouActivity.class));
                   }
              //  }, "", AppManage.app_mainClickCntSwAd);


          //  }
        });
        rate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=" + getPackageName())));
                } catch (android.content.ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                }
            }
        });
        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   AppManage.getInstance(ExitActivity.this).showInterstitialAd(ExitActivity.this, new AppManage.MyCallback() {
             //       public void callbackCall() {
                ExitActivity.super.onBackPressed();
                     //   startActivity(new Intent(getApplicationContext(), ThankyouActivity.class));
                    }
            //    }, "", AppManage.app_mainClickCntSwAd);


         //   }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // stopVpn();
    }
}

