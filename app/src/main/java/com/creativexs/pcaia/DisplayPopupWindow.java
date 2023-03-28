package com.creativexs.pcaia;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;



 class DisplayPopupWindow {

    private Context context;
    private String [] words;
    private Integer [] images;
    private int arrayCurrentPosition;
    private int helpnum;
    private Dialog dialogPopup,dialogHelp,dialogRateUs;


     DisplayPopupWindow(Context context, String[] words, Integer[] images, int arrayCurrentPosition) {
        this.context = context;
        this.words = words;
        this.images = images;
        this.arrayCurrentPosition = arrayCurrentPosition;


    }
    DisplayPopupWindow(Context context,int helpnum){
        this.context=context;
        this.helpnum=helpnum;
    }

    DisplayPopupWindow(Context context){
        this.context=context;
    }


     void displayWindow(){

        dialogPopup =new Dialog(context);
        dialogPopup.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogPopup.setContentView(R.layout.popup_layout_viewpager);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();

       dialogPopup.getWindow().setBackgroundDrawable(context.getResources().getDrawable(R.drawable.a2_bg_popup));


        lp.copyFrom(dialogPopup.getWindow().getAttributes());
        lp.width = (int) (((Activity)context).getIntent().getIntExtra("screenWidth",0)*0.8);
        lp.height = (int)(((Activity)context).getIntent().getIntExtra("screenHeight",0)*0.7);

        ViewPager viewPager=dialogPopup.findViewById(R.id.popupViewPager);
        PopupAdapter popupAdapter=new PopupAdapter(context,words,images);
        viewPager.setAdapter(popupAdapter);



        viewPager.setCurrentItem(arrayCurrentPosition);
        viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                final float normalizedposition = Math.abs(Math.abs(position) - 1);
                //4 others below page
                page.setAlpha(normalizedposition);
            }
        });

       dialogPopup.show();
       dialogPopup.getWindow().setAttributes(lp);


    }

     void displayHelpWindow(){

        dialogHelp=new Dialog(context);
        dialogHelp.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogHelp.setContentView(R.layout.help_layout);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();

        dialogHelp.getWindow().setBackgroundDrawable(context.getResources().getDrawable(R.drawable.a2_bg_popup));

        lp.copyFrom(dialogHelp.getWindow().getAttributes());
        lp.width = (int) (((Activity)context).getIntent().getIntExtra("screenWidth",0)*0.8);
        lp.height = (int)(((Activity)context).getIntent().getIntExtra("screenHeight",0)*0.7);

        TextView titleText=dialogHelp.findViewById(R.id.popup2TextTitle);
        TextView contentText=dialogHelp.findViewById(R.id.popup2TextContent);
        ImageView image=dialogHelp.findViewById(R.id.image11);

        Button cancel_popup=dialogHelp.findViewById(R.id.cancel_help);

        cancel_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogHelp.dismiss();
            }
        });


        TextView rateUs=dialogHelp.findViewById(R.id.helpRateUs);
        rateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                try{
//                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+context.getPackageName())));
//               }
//               catch (ActivityNotFoundException e){
//                  context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+
//                          context.getPackageName())));
//               }

                rateOnAmazonMarket(context,context.getPackageName());
            }
        });


        if (helpnum==0){
            titleText.setText(context.getResources().getString(R.string.prevn_help_title));
            contentText.setText(context.getResources().getString(R.string.prevn_help_content));
            image.setImageResource(R.drawable.image_aboutprev);
        }else {
            titleText.setText(context.getResources().getString(R.string.foods_help_title));
            contentText.setText(context.getResources().getString(R.string.foods_help_content));
            image.setImageResource(R.drawable.image_aboutimmune);
        }


        dialogHelp.show();
        dialogHelp.getWindow().setAttributes(lp);

    }

     void displayRateUsCloseWindow(){

        dialogRateUs=new Dialog(context);
        dialogRateUs.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogRateUs.setContentView(R.layout.rateus_popup);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();

        dialogRateUs.getWindow().setBackgroundDrawable(context.getResources().getDrawable(R.drawable.a2_bg_popup));

        lp.copyFrom(dialogRateUs.getWindow().getAttributes());
        lp.width = (int) (((Activity)context).getIntent().getIntExtra("screenWidth",0)*0.7);
        lp.height = (int)(((Activity)context).getIntent().getIntExtra("screenHeight",0)*0.6);

        TextView titleText=dialogRateUs.findViewById(R.id.rateUsTitle);
        TextView contentText=dialogRateUs.findViewById(R.id.rateUsContent);
        ImageView image=dialogRateUs.findViewById(R.id.rateUsImage);

        titleText.setText(context.getResources().getString(R.string.rate_us_title));
        contentText.setText(context.getResources().getString(R.string.rate_us_content));
        image.setImageResource(R.drawable.app_icon);

        Button cancel_popup=dialogRateUs.findViewById(R.id.cancel_RateUs);

        cancel_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogRateUs.dismiss();
            }
        });


        TextView rateUs=dialogRateUs.findViewById(R.id.rateUsBtn);
        rateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                try{
//                   context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+context.getPackageName())));
//               }
//                catch (ActivityNotFoundException e){
//                   context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+
//                            context.getPackageName())));
//                }

                rateOnAmazonMarket(context,context.getPackageName());
            }
        });

      TextView closeApp=dialogRateUs.findViewById(R.id.closeApp);
      closeApp.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              ((Activity) context).finishAffinity();
          }
      });


        dialogRateUs.show();
        dialogRateUs.getWindow().setAttributes(lp);

    }





    public class PopupAdapter extends PagerAdapter {
        private Context mcontext;
        private String [] mwords;
        private Integer [] mimages;

        public PopupAdapter(Context mcontext, String[] mwords, Integer[] mimages) {
            this.mcontext = mcontext;
            this.mwords = mwords;
            this.mimages = mimages;
        }

        @Override
        public int getCount() {
            return mimages.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == (ConstraintLayout) object;
        }


        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {

            LayoutInflater layoutInflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View lyv = layoutInflater.inflate(R.layout.popup_adapter, container, false);
            container.addView(lyv);

            ScrollView scrollView=lyv.findViewById(R.id.popupScrollView);
            TextView titleText = scrollView.findViewById(R.id.popupTextTitle);
            TextView contentText = scrollView.findViewById(R.id.popupTextContent);
            ImageView imageView = lyv.findViewById(R.id.popupImageView);

            Button cancel_popup=lyv.findViewById(R.id.cancel_popup);

            cancel_popup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialogPopup.dismiss();

                }
            });

            titleText.setText(ArraysImagesAndWords.textSplitter(mwords[position])[0]);
            contentText.setText(ArraysImagesAndWords.textSplitter(mwords[position])[1]);

           imageView.setImageResource(mimages[position]);

           imageView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   ((Activity) context).findViewById(R.id.cancel_popup).performClick();
               }
           });

            return lyv;

        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((ConstraintLayout) object);
        }

    }


    private  void rateOnAmazonMarket(Context context, String packageName) {

//        try {
//            String MARKET_AMAZON_URL = "http://slideme.org/application/";
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MARKET_AMAZON_URL + packageName));
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(intent);
//
//        } catch (android.content.ActivityNotFoundException anfe) {
//            String WEB_AMAZON_URL = "http://slideme.org/application/pcaia";
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(WEB_AMAZON_URL));
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(intent);
//        }

//        try {
//            String MARKET_AMAZON_URL = "amzn://apps/android?p=";
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MARKET_AMAZON_URL + packageName));
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(intent);
//        } catch (android.content.ActivityNotFoundException anfe) {
//            String WEB_AMAZON_URL = "http://www.amazon.com/gp/mas/dl/android?p=";
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(WEB_AMAZON_URL + packageName));
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(intent);
//        }

    }

    }



//1
// Alpha property is based on the view position.
//                if(position <= -1.0F || position >= 1.0F) {
//                    page.setAlpha(0.0F);
//                } else if( position == 0.0F ) {
//                    page.setAlpha(1.0F);
//                } else { // position is between -1.0F & 0.0F OR 0.0F & 1.0F
//                    page.setAlpha(1.0F - Math.abs(position));
//                }

//2
//page.setRotation(position * 10);

//3
//                page.setScaleX(normalizedposition / 2 + 0.5f);
//                page.setScaleY(normalizedposition / 2 + 0.5f);

