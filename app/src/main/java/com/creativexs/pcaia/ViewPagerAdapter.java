package com.creativexs.pcaia;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.gms.ads.InterstitialAd;
import com.squareup.picasso.Picasso;


public class ViewPagerAdapter extends PagerAdapter {

        private Context context;
        private Integer[] images;
        private String[] words;
        private InterstitialAd mInterstitialAd;


        private DisplayPopupWindow displayPopupWindow=null;

        ViewPagerAdapter(Context context, Integer images[], String [] words, InterstitialAd mInterstitialAd){

            this.context=context;
            this.images=images;
            this.words=words;
            this.mInterstitialAd=mInterstitialAd;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view ==(ConstraintLayout)object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, final int position) {
            LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View lyv=layoutInflater.inflate(R.layout.activity_display_1precautions_pageradapter,container,false);

            container.addView(lyv);

            ImageView imageView=lyv.findViewById(R.id.a2f1pImageView);


            Picasso.with(context).load(images[position]).noPlaceholder().fit().into(imageView);

            TextView textView=lyv.findViewById(R.id.a2f1pPost_tv);
            textView.setText(words[position]);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayPopupWindow=new DisplayPopupWindow(context,words,ArraysImagesAndWords.images1,position);
                    displayPopupWindow.displayWindow();



                    if (ArraysImagesAndWords.willShow() && mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }



                }
            });

            ConstraintLayout constraintLayout=lyv.findViewById(R.id.a2f1pTextsContainer);



            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                imageView.setClipToOutline(true);
                constraintLayout.setClipToOutline(true);
            }


            return lyv;

        }


    @Override
    public float getPageWidth(int position) {
        return 0.91f;
    }

    @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((ConstraintLayout) object);
        }
    }

