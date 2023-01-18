package com.ide.footballmatch.livetv.activity;
//
//import static com.pesonal.adsdk.AppManage.ADMOB_N;
//import static com.pesonal.adsdk.AppManage.FACEBOOK_N;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.footscore.football.soccer.activity.R;
//import com.pesonal.adsdk.AppManage;
//
//public class Live_Streem extends AppCompatActivity {
//
//    Button btn_hindi, btn_english, btn_play;
//    RelativeLayout native_ads;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_live_streem);
//
//        native_ads = findViewById(R.id.native_ads);
//        AppManage.getInstance(Live_Streem.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
//
//        btn_hindi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AppManage.getInstance(Live_Streem.this).showInterstitialAd(Live_Streem.this, new AppManage.MyCallback() {
//                    public void callbackCall() {
//                        Intent intent = new Intent(Live_Streem.this, Channle_list.class);
//                        startActivity(intent);
//                    }
//                },"",AppManage.app_mainClickCntSwAd);
//
//            }
//        });
//
//        btn_english.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AppManage.getInstance(Live_Streem.this).showInterstitialAd(Live_Streem.this, new AppManage.MyCallback() {
//                    public void callbackCall() {
//                        Intent intent = new Intent(Live_Streem.this, Channle_list.class);
//                        startActivity(intent);
//                    }
//                },"",AppManage.app_mainClickCntSwAd);
//
//            }
//        });
//
//    }
//
//    @Override
//    public void onBackPressed() {
//        AppManage.getInstance(Live_Streem.this).showBackPressAd(Live_Streem.this, new AppManage.MyCallback() {
//            @Override
//            public void callbackCall() {
//                Intent intent = new Intent(Live_Streem.this, footballscore_FirstActivity.class);
//                startActivity(intent);
//                // finish();
//            }
//        });
//
//    }
