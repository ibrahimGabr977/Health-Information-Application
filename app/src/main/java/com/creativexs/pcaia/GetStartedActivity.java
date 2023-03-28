package com.creativexs.pcaia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class GetStartedActivity extends AppCompatActivity {
    SharedPreferences mPrefs;
    final String welcomeScreenShownPref = "welcomeScreenShown";

    private int x=0;
    private ImageView imageView=null;
    private TextView titleTextView=null,contentTextView=null;
    private TextView[] balls=null;
    private Button button=null;

    private ViewGroup.LayoutParams params,paramsStandarded=null;

    private String titles[]=null;
    private String [] content=null;

    private int images[]=null;


    private Intent intent;
    private int screenHeight;
    private int screenWidth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_agetstarted);



        mPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        Boolean welcomeScreenShown = mPrefs.getBoolean(welcomeScreenShownPref, false);

        intent =new Intent(GetStartedActivity.this,DisplayActivity.class);
        screenHeight=getWindowManager().getDefaultDisplay().getHeight();
        screenWidth=getWindowManager().getDefaultDisplay().getWidth();


        if (!welcomeScreenShown) {

            titles=new String[]{"Welcome","Be Informed","Precautions","Hope"};

            content=new String[]{"To Pcaia application",
                    "Follow all news about new precautions against diseases.\nAll information reviewed by specialists",
                    "Helping to apply the frequently protective measures against diseases by notifications and follow up what you should eat for immune",
                    "We hope protection and good health for you, your family, your region, your friends and for whole the world"};


            images=new int[]{R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4};


            imageView = findViewById(R.id.a1ImageView);
            titleTextView = findViewById(R.id.a1TextView1);
            contentTextView = findViewById(R.id.a1TextView2);

            balls = new TextView[]{findViewById(R.id.a1Ball1), findViewById(R.id.a1Ball2),
                    findViewById(R.id.a1Ball3), findViewById(R.id.a1Ball4)};


            button = findViewById(R.id.a1Next_btn);

//            Glide.with(this).load(images[x]).into(imageView);
            titleTextView.setText(titles[x]);
            contentTextView.setText(content[x]);

            paramsStandarded = balls[x].getLayoutParams();

            params = balls[x].getLayoutParams();
            params.height = 27;
            params.width = 27;
            balls[x].setLayoutParams(params);

            balls[x].setBackground(getResources().getDrawable(R.drawable.a1_bg_ballselect));



            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putBoolean(welcomeScreenShownPref, true);
            editor.commit(); // Very important to save the preference

        }else {

            intent.putExtra("screenHeight",screenHeight);
            intent.putExtra("screenWidth",screenWidth);
            startActivity(intent);
        }



    }





    public void next(View view) {
        x++;
//            Glide.with(this).load(images[x]).into(imageView);
            titleTextView.setText(titles[x]);
            contentTextView.setText(content[x]);

            balls[x].setLayoutParams(params);
            balls[x].setBackground(getResources().getDrawable(R.drawable.a1_bg_ballselect));

            balls[x-1].setLayoutParams(paramsStandarded);
            balls[x-1].setBackground(getResources().getDrawable(R.drawable.a1_bg_balls));



            if (x==3){
                button.setText("Start");
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        intent.putExtra("screenHeight",screenHeight);
                        intent.putExtra("screenWidth",screenWidth);
                        startActivity(intent);
                    }
                });

            }




    }

    public void skip(View view) {
        for (int i=0;i<3;i++){
            balls[i].setLayoutParams(paramsStandarded);
            balls[i].setBackground(getResources().getDrawable(R.drawable.a1_bg_balls));
        }

//        Glide.with(this).load(images[3]).into(imageView);
        titleTextView.setText(titles[3]);
        contentTextView.setText(content[3]);

        balls[3].setLayoutParams(params);
        balls[3].setBackground(getResources().getDrawable(R.drawable.a1_bg_ballselect));


        button.setText("Start");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("screenHeight",screenHeight);
                intent.putExtra("screenWidth",screenWidth);
                startActivity(intent);
            }
        });

    }
}




