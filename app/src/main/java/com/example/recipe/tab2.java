package com.example.recipe;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import java.util.ArrayList;


public class tab2 extends Fragment {

    CarouselView carouselView;
    final int[] sampleImages = {R.drawable.fav_, R.drawable.ani2, R.drawable.ani4, R.drawable.laddu,R.drawable.ani6,R.drawable.ani7};

    ArrayList<String> list=new ArrayList<>();
    int[] images = {R.drawable.nasta, R.drawable.paratha, R.drawable.chatni, R.drawable.achar,
            R.drawable.salad, R.drawable.roti, R.drawable.sabzi, R.drawable.sambhar,
            R.drawable.mithai, R.drawable.festival_food, R.drawable.non_veg, R.drawable.punjabi_food,
            R.drawable.south_indian_food, R.drawable.soup, R.drawable.gujrati_food, R.drawable.bengali_food, R.drawable.pulaw,
            R.drawable.childrens_food, R.drawable.sarbat, R.drawable.fast};


    RecyclerView recyclerView;

    public tab2() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        recyclerView = view.findViewById(R.id.recycler2);
        list.add("Nasta Receipes");list.add("Paratha Receipes");list.add("Chatni Receipes");
        list.add("Aachar Receipes");list.add("Salad Receipes");list.add("Roti Receipes");list.add("Sabzi Receipes");list.add("Sambhar Receipes");
        list.add("Mithai Receipes");list.add("Festival Food Receipes");list.add("Non Veg Receipes");list.add("Punjabi Food Receipes");list.add("South Indian Receipes");
        list.add("Soup Receipes");list.add("Gujarati Food Receipes");list.add("Bengali Food Receipes");list.add("Biryani Receipes");list.add("Children Food Receipes");list.add("Sharbat Receipes");
        list.add("Fast Food Receipes");
        recycler_adapter2 recyclerAdapter = new recycler_adapter2(getContext(), list, images);
        GridLayoutManager grid = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(grid);
        recyclerView.setAdapter(recyclerAdapter);

        carouselView = view.findViewById(R.id.sli);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        return view;
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(final int position, final ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(position==4){
                                Intent intent2 =new Intent(getContext(),subhome.class);
                                intent2.putExtra("home","South Indian Receipes");
                                intent2.putExtra("my_txt","आटे  का डोसा ");
                                startActivity(intent2);
                    }

                    if(position==1){
                        Intent intent2 =new Intent(getContext(),subhome.class);
                        intent2.putExtra("home","Children Food Receipes");
                        intent2.putExtra("my_txt","मैगी  रेसिपी");
                        startActivity(intent2);
                    }
                    if(position==2){

                        Intent intent2 =new Intent(getContext(),subhome.class);
                        intent2.putExtra("home","Salad Receipes");
                        intent2.putExtra("my_txt","कक्रंची सलाद");
                        startActivity(intent2);

                    }
                    if(position==3){
                        Intent intent2 =new Intent(getContext(),subhome.class);
                        intent2.putExtra("home","Festival Food Receipes");
                        intent2.putExtra("my_txt","बेसन के लड्डू");
                        startActivity(intent2);

                    }

                }
            });
        }
    };


}
