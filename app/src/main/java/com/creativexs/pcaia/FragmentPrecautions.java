package com.creativexs.pcaia;



import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.InterstitialAd;
import java.util.ArrayList;
import java.util.Arrays;

public class FragmentPrecautions extends Fragment {

    private Integer[] images1=ArraysImagesAndWords.images1;
    private String[] words1=ArraysImagesAndWords.words1;
    private InterstitialAd mInterstitialAd;

    public FragmentPrecautions(InterstitialAd mInterstitialAd) {
        this.mInterstitialAd=mInterstitialAd;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewRoot=inflater.inflate(R.layout.activity_display_1precautionsfrag,container,false);


        final ScrollView scrollView=viewRoot.findViewById(R.id.a2ScrollView);
        final  ViewPager viewPager=scrollView.findViewById(R.id.a2ViewPager);

        final TextView viewAllRecycler=scrollView.findViewById(R.id.a2f1ViewAllRec_tv); //clicked textView to show the popup window with images

        final DisplayPopupWindow[] displayPopupWindow = new DisplayPopupWindow[1]; //class for show popup window images

        //recyclerview words and images lists
        final ArrayList<String>[] wordsIds = new ArrayList[]{null};
        final ArrayList<Integer>[] imagesIds = new ArrayList[]{null};

        //words default case in first startup
        wordsIds[0] =new ArrayList<>(Arrays.asList(ArraysImagesAndWords.getWordsSubs(0)));

        //images default case in first startup
       imagesIds[0] =new ArrayList<>(Arrays.asList( ArraysImagesAndWords.getImagesSubs(0)));


        final RecyclerView recyclerView= scrollView.findViewById(R.id.a2f1RecyclerView);; //recyclerview for view all sub images

        final ViewRecyclerAdapter viewRecyclerAdapter =
                new ViewRecyclerAdapter(container.getContext(), wordsIds[0], imagesIds[0],0,mInterstitialAd); //recyclerview adapter class


        final ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(container.getContext(),
                images1,words1,mInterstitialAd);

        final LinearLayoutManager linearLayoutManager=new LinearLayoutManager(container.getContext());

        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                viewPager.setAdapter(viewPagerAdapter);




                viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
                    @Override
                    public void transformPage(@NonNull View page, float position) {
                        final float normalizedposition = Math.abs(Math.abs(position) - 1);

                        page.setAlpha(normalizedposition);

                    }
                });



                recyclerView.setLayoutManager(linearLayoutManager);

                recyclerView.setAdapter(viewRecyclerAdapter);


                viewRecyclerAdapter.notifyDataSetChanged();




                //default value of popup menu in first startup
                viewAllRecycler.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayPopupWindow[0] =new DisplayPopupWindow(container.getContext(),
                                ArraysImagesAndWords.getWordsSubs(0)
                                ,ArraysImagesAndWords.getImagesSubs(0),0);
                        displayPopupWindow[0].displayWindow();

                    }
                });





                //put the images of recyclerview related to the current position of viewpager

                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(final int position) {

                        wordsIds[0] =new ArrayList<>(Arrays.asList(ArraysImagesAndWords.getWordsSubs(position)));

                        imagesIds[0] =new ArrayList<>(Arrays.asList(ArraysImagesAndWords.getImagesSubs(position)));


                        viewRecyclerAdapter.setWords(wordsIds[0]);
                        viewRecyclerAdapter.setImagesIds(imagesIds[0]);
                        viewRecyclerAdapter.notifyDataSetChanged();
                        viewRecyclerAdapter.setCurrentViewpagerPosition(position);


                        viewAllRecycler.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                displayPopupWindow[0] =new DisplayPopupWindow(container.getContext(),ArraysImagesAndWords.getWordsSubs(position)
                                        ,ArraysImagesAndWords.getImagesSubs(position),0);
                                displayPopupWindow[0].displayWindow();

                            }
                        });

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });






//        viewPager.setPageTransformer(true,new CardTransformer(0.9f));

                int screenHeight=getActivity().getIntent().getIntExtra("screenHeight",0);

                Guideline g1=scrollView.findViewById(R.id.a2f1PagersGuide);
                g1.setGuidelineBegin((int) (0.39*screenHeight));

                Guideline g2=scrollView.findViewById(R.id.a2f1TextsGuidePage);
                g2.setGuidelineBegin((int) (0.09*screenHeight));

                Guideline g3=scrollView.findViewById(R.id.a2f1TextsGuideRec);
                g3.setGuidelineBegin((int) (0.47*screenHeight));


                TextView viewAllPagers=scrollView.findViewById(R.id.a2f1ViewAllPage_tv);



                viewAllPagers.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayPopupWindow[0] =new DisplayPopupWindow(container.getContext(),words1,images1,0);
                        displayPopupWindow[0].displayWindow();

                    }
                });

               // progressBar.setVisibility(View.INVISIBLE);

            }
        },0L);




        return viewRoot;
    }



    //    public class CardTransformer implements ViewPager.PageTransformer {
//
//        private final float scalingStart;
//
//        CardTransformer(float scalingStart) {
//            super();
//            this.scalingStart = 1 - scalingStart;
//        }
//
//        @Override
//        public void transformPage(@NonNull View page, float position) {
//
//            if (position >= 0) {
//                final int w = page.getWidth();
//                float scaleFactor = 1 - scalingStart * position;
//
//                page.setAlpha(1 - position);
//                page.setScaleX(scaleFactor);
//                page.setScaleY(scaleFactor);
//                page.setTranslationX(w * (1 - position) - w);
//            }
//        }
//    }





}
