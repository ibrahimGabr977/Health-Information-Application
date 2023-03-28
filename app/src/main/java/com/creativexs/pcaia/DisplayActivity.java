package com.creativexs.pcaia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DisplayActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{


    private TextView pageTitle;
    private TextView updatesText;
    private TextView openHelp;
    private SharedPreferences mPrefs;
    final String precautionsShownPref = "precautionsScreenShown",foodsShownPref="foodsScreenShown";
    private DisplayPopupWindow  displayHelpWindow;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_display);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9071903693576316/5852541106");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });



        final AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

//========================================================

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
               mAdView.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAdClosed() {
               mAdView.setVisibility(View.GONE);
            }
        });

//==========================================================


            mPrefs = PreferenceManager.getDefaultSharedPreferences(this);



        final BottomNavigationView btv=findViewById(R.id.btv);
        pageTitle=findViewById(R.id.a2Title_tv);
        updatesText=findViewById(R.id.a2Updates_tv);
        openHelp=findViewById(R.id.helpTextView);



        btv.setOnNavigationItemSelectedListener(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switchToFragment(new FragmentPrecautions(mInterstitialAd));
                pageTitle.setText(R.string.prevn_title);
                updatesText.setVisibility(View.VISIBLE);
                updatesText.setText(R.string.updates);


                openHelp.setVisibility(View.VISIBLE);
                boolean precautionsScreenShown = mPrefs.getBoolean(precautionsShownPref, false);

                if (!precautionsScreenShown){
                    displayHelpWindow=
                            new DisplayPopupWindow(DisplayActivity.this,
                                    0);
                    displayHelpWindow.displayHelpWindow();
                    SharedPreferences.Editor editor = mPrefs.edit();
                    editor.putBoolean(precautionsShownPref, true);
                    editor.commit(); // Very important to save the preference
                }
            }

        },0L);




        displayHelpWindow=
                new DisplayPopupWindow(DisplayActivity.this,
                        btv.getSelectedItemId()== R.id.btv_prevn? 0 : 1);




        openHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayHelpWindow=
                        new DisplayPopupWindow(DisplayActivity.this,
                                btv.getSelectedItemId()== R.id.btv_prevn? 0 : 1);

                displayHelpWindow.displayHelpWindow();

                if (ArraysImagesAndWords.willShow() && mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }

            }
        });

    }





    public void switchToFragment( Fragment fragment) {

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frameLayout,fragment).commit();

        if (ArraysImagesAndWords.willShow() && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btv_prevn:

                switchToFragment(new FragmentPrecautions(mInterstitialAd));
                pageTitle.setText(R.string.prevn_title);
                updatesText.setVisibility(View.VISIBLE);
                updatesText.setText(R.string.updates);
                openHelp.setVisibility(View.VISIBLE);
                break;

            case R.id.btv_foods:

                        Boolean foodsScreenShown= mPrefs.getBoolean(foodsShownPref, false);
                        if (!foodsScreenShown){
                            displayHelpWindow=
                                    new DisplayPopupWindow(DisplayActivity.this,
                                            1);
                            displayHelpWindow.displayHelpWindow();
                            SharedPreferences.Editor editor = mPrefs.edit();
                            editor.putBoolean(foodsShownPref, true);
                            editor.commit(); // Very important to save the preference
                        }
                        switchToFragment(new FragmentFoods(mInterstitialAd));
                        pageTitle.setText(R.string.foods_title);
                        updatesText.setVisibility(View.INVISIBLE);



                break;

            case R.id.btv_stats:
                switchToFragment(new FragmentThree());
                pageTitle.setText(R.string.stats_title);
                updatesText.setVisibility(View.INVISIBLE);
                openHelp.setVisibility(View.INVISIBLE);
                break;

            case R.id.btv_news:
                switchToFragment(new FragmentNews());
                pageTitle.setText(R.string.news_title);
                updatesText.setVisibility(View.INVISIBLE);
                openHelp.setVisibility(View.INVISIBLE);
                break;

            case R.id.btv_notifications:
                switchToFragment(new FragmentNotifications());
                pageTitle.setText(R.string.notif_title);
                updatesText.setVisibility(View.INVISIBLE);
                openHelp.setVisibility(View.INVISIBLE);
                break;


        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
        DisplayPopupWindow displayPopupWindow=new DisplayPopupWindow(this);
        displayPopupWindow.displayRateUsCloseWindow();
    }
}
