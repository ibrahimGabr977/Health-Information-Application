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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.InterstitialAd;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class FoodsRecyclerAdapter  extends RecyclerView.Adapter<FoodsRecyclerAdapter.FoodsViewHolderAdapter> {

        private Context context;
        private ArrayList<String> words;
        private ArrayList<Integer> imagesIds;
        private InterstitialAd mInterstitialAd;




        FoodsRecyclerAdapter(Context context, ArrayList<String> words, ArrayList<Integer> imagesIds,InterstitialAd mInterstitialAd){
            this.context=context;
            this.words=words;
            this.imagesIds=imagesIds;
            this.mInterstitialAd=mInterstitialAd;
        }

        @NonNull
        @Override
        public FoodsViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflateView= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_display_2foods_holderadapter,parent,false);
            ViewGroup.LayoutParams params=inflateView.getLayoutParams();
            params.height=(int) (((Activity)context).getIntent().getIntExtra("screenHeight",0)*0.23);
            inflateView.setLayoutParams(params);
            FoodsViewHolderAdapter viewHolderAdapter=new FoodsViewHolderAdapter(inflateView);
            return viewHolderAdapter;
        }

        @Override
        public void onBindViewHolder(@NonNull FoodsViewHolderAdapter holder, int position) {

            holder.x=position*2;
            holder.y=position*2+1;



            Picasso.with(context).load(imagesIds.get(holder.x)).noPlaceholder()
                    .fit().into(holder.imageStart);


            holder.textStart.setText(ArraysImagesAndWords.textSplitter(words.get(holder.x))[0]);

            Picasso.with(context).load(imagesIds.get(holder.y)).noPlaceholder()
                    .fit().into(holder.imageEnd);


            holder.textEnd.setText(ArraysImagesAndWords.textSplitter(words.get(holder.y))[0]);





        }

        @Override
        public int getItemCount() {
            return words.size()/2;
        }



        public class FoodsViewHolderAdapter extends RecyclerView.ViewHolder {

            private ImageView imageStart,imageEnd;
            private TextView textStart,textEnd;
            private int x,y;

            public FoodsViewHolderAdapter(@NonNull View itemView) {
                super(itemView);

                final DisplayPopupWindow[] displayPopupWindow = {null};

                imageStart=itemView.findViewById(R.id.a2f2rImageStart);
                textStart=itemView.findViewById(R.id.a2f2rTextStart);
                imageEnd=itemView.findViewById(R.id.a2f2rImageEnd);
                textEnd=itemView.findViewById(R.id.a2f2rTextEnd);




                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    imageStart.setClipToOutline(true);
                    imageEnd.setClipToOutline(true);

                }
                imageStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayPopupWindow[0] =new DisplayPopupWindow(context, ArraysImagesAndWords.getFoodWords(),
                                ArraysImagesAndWords.getFoodImages(),x);
                        displayPopupWindow[0].displayWindow();

                        if (ArraysImagesAndWords.willShow() && mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        }
                    }
                });

                imageEnd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayPopupWindow[0] =new DisplayPopupWindow(context, ArraysImagesAndWords.getFoodWords(),
                                ArraysImagesAndWords.getFoodImages(),y);
                        displayPopupWindow[0].displayWindow();



                            if (ArraysImagesAndWords.willShow() && mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            }

                    }
                });


            }
        }
    }

