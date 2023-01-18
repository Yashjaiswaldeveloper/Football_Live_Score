package com.ide.footballmatch.livetv.activity;

import static com.pesonal.adsdk.AppManage.ADMOB_I;
import static com.pesonal.adsdk.AppManage.FACEBOOK_I;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.ide.footballmatch.livetv.R;
import com.ide.footballmatch.livetv.fragments.LeagueScheduleFragment;
import com.ide.footballmatch.livetv.fragments.StandingFragment;
import com.pesonal.adsdk.AppManage;

public class footballscore_LeagueDetailsActivity extends AppCompatActivity {
   // LinearLayout adView;
    public String leagueKey;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout tabLayout;
    String[] titleText = {"Schedule", "Standings"};

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.footballscore_activity_league_details);
        this.leagueKey = getIntent().getStringExtra("leagueKey");
        this.mViewPager = (ViewPager) findViewById(R.id.pager);
        this.tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        this.mSectionsPagerAdapter = sectionsPagerAdapter;
        this.mViewPager.setAdapter(sectionsPagerAdapter);
        AppManage.getInstance(footballscore_LeagueDetailsActivity.this).loadInterstitialAd(this, ADMOB_I[0], FACEBOOK_I[0]);

        this.tabLayout.setupWithViewPager(this.mViewPager);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public Fragment getItem(int i) {
            if (i == 0) {
                LeagueScheduleFragment leagueScheduleFragment = new LeagueScheduleFragment();
                Bundle bundle = new Bundle();
                bundle.putString("key", footballscore_LeagueDetailsActivity.this.leagueKey);
                leagueScheduleFragment.setArguments(bundle);
                return leagueScheduleFragment;
            }
            StandingFragment standingFragment = new StandingFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("key", footballscore_LeagueDetailsActivity.this.leagueKey);
            standingFragment.setArguments(bundle2);
            return standingFragment;
        }

        public int getCount() {
            return footballscore_LeagueDetailsActivity.this.titleText.length;
        }

        public CharSequence getPageTitle(int i) {
            return footballscore_LeagueDetailsActivity.this.titleText[i];
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }


    @Override
    public void onBackPressed() {
        AppManage.getInstance(footballscore_LeagueDetailsActivity.this).showBackPressAd(footballscore_LeagueDetailsActivity.this, new AppManage.MyCallback() {
            @Override
            public void callbackCall() {
                Intent intent = new Intent(footballscore_LeagueDetailsActivity.this, footballscore_LeagueListActivity.class);
                finish();
            }
        });
    }
}


