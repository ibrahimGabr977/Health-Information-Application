package com.creativexs.pcaia;


import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.Arrays;

public class FragmentFoods extends Fragment {
private ArrayList<Integer> imagesIds;
private ArrayList<String> wordsIds;
private InterstitialAd mInterstitialAd;

     FragmentFoods(InterstitialAd mInterstitialAd) {
         this.mInterstitialAd=mInterstitialAd;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View viewRoot=inflater.inflate(R.layout.activity_display_2foodsfrag,container,false);

        final RecyclerView recyclerView= viewRoot.findViewById(R.id.a2f2RecyclerView);; //recyclerview for view all sub images

        final TextView viewAllRecycler=viewRoot.findViewById(R.id.a2f2ViewAllImage_tv); //clicked textView to show the popup window with images



        final LinearLayoutManager linearLayoutManager=new LinearLayoutManager(container.getContext());

        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                imagesIds =new ArrayList<>(Arrays.asList(ArraysImagesAndWords.getFoodImages()));

                wordsIds =new ArrayList<>(Arrays.asList(ArraysImagesAndWords.getFoodWords()));

                final FoodsRecyclerAdapter viewRecyclerAdapter =  new FoodsRecyclerAdapter(container.getContext(),wordsIds, imagesIds,mInterstitialAd
                ); //recyclerview adapter class

                recyclerView.setHasFixedSize(true);
                recyclerView.setItemViewCacheSize(20);
                recyclerView.setDrawingCacheEnabled(true);
                recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
                recyclerView.setNestedScrollingEnabled(false);

                recyclerView.setLayoutManager(linearLayoutManager);



        recyclerView.setAdapter(viewRecyclerAdapter);



        viewRecyclerAdapter.notifyDataSetChanged();


        viewAllRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow displayPopupWindow =new DisplayPopupWindow(container.getContext(),
                        ArraysImagesAndWords.getFoodWords()
                        ,ArraysImagesAndWords.getFoodImages(),0);

                displayPopupWindow.displayWindow();

            }
        });

    }
},0L);



        return viewRoot;
    }
}
