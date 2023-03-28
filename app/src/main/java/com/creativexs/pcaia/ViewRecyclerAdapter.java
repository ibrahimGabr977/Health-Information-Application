package com.creativexs.pcaia;


import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.InterstitialAd;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


public class ViewRecyclerAdapter extends RecyclerView.Adapter<ViewRecyclerAdapter.ViewHolderAdapter> {

    private Context context;
    private ArrayList<String> words;
    private ArrayList<Integer> imagesIds;
    private int currentViewpagerPosition;
    private InterstitialAd mInterstitialAd;


    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public void setImagesIds(ArrayList<Integer> imagesIds) {
        this.imagesIds = imagesIds;
    }

    public void setCurrentViewpagerPosition(int currentViewpagerPosition) {
        this.currentViewpagerPosition = currentViewpagerPosition;
    }

    ViewRecyclerAdapter(Context context, ArrayList<String> words, ArrayList<Integer> imagesIds, int currentViewpagerPosition, InterstitialAd mInterstitialAd){
        this.context=context;
        this.words=words;
        this.imagesIds=imagesIds;
        this.currentViewpagerPosition=currentViewpagerPosition;
        this.mInterstitialAd=mInterstitialAd;
    }

    @NonNull
    @Override
    public ViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View inflateView= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_display_1precautions_holderadapter,parent,false);
        ViewGroup.LayoutParams params=inflateView.getLayoutParams();
        params.height=(int) (((Activity)context).getIntent().getIntExtra("screenHeight",0)*0.23);
        inflateView.setLayoutParams(params);
        ViewHolderAdapter viewHolderAdapter=new ViewHolderAdapter(inflateView);
        return viewHolderAdapter;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdapter holder, int position){

            holder.x=position*2;
            holder.y=position*2+1;


                if (words.size()>holder.y) {


                    Picasso.with(context).load(imagesIds.get(holder.x)).noPlaceholder().fit()
                            .into(holder.imageStart);

                    holder.textStart.setText(ArraysImagesAndWords.textSplitter(words.get(holder.x))[0]);


                    Picasso.with(context).load(imagesIds.get(holder.y)).noPlaceholder().fit()
                            .into(holder.imageEnd);
                    holder.textEnd.setText(ArraysImagesAndWords.textSplitter(words.get(holder.y))[0]);

                }


    }

    @Override
    public int getItemCount() {
        return imagesIds.size()/2;
    }



    public class ViewHolderAdapter extends RecyclerView.ViewHolder {

        private ImageView imageStart,imageEnd;
        private TextView textStart,textEnd;
        private int x,y;

        public ViewHolderAdapter(@NonNull View itemView) {
            super(itemView);

            final DisplayPopupWindow[] displayPopupWindow = {null};

            imageStart=itemView.findViewById(R.id.a2f1rImageStart);
            textStart=itemView.findViewById(R.id.a2f1rTextStart);
            imageEnd=itemView.findViewById(R.id.a2f1rImageEnd);
            textEnd=itemView.findViewById(R.id.a2f1rTextEnd);




            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                imageStart.setClipToOutline(true);
                imageEnd.setClipToOutline(true);

            }
            imageStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  displayPopupWindow[0] =new DisplayPopupWindow(context, ArraysImagesAndWords.getWordsSubs(currentViewpagerPosition),
                          ArraysImagesAndWords.getImagesSubs(currentViewpagerPosition),x);
                  displayPopupWindow[0].displayWindow();


                    if (ArraysImagesAndWords.willShow() && mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                }
            });

            imageEnd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayPopupWindow[0] =new DisplayPopupWindow(context, ArraysImagesAndWords.getWordsSubs(currentViewpagerPosition),
                            ArraysImagesAndWords.getImagesSubs(currentViewpagerPosition),y);
                    displayPopupWindow[0].displayWindow();

                    if (ArraysImagesAndWords.willShow() && mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }
                }
            });


        }
    }
}
