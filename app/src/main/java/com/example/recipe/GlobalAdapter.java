package com.example.recipe;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GlobalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder > {
    dbclass db;
    String text;
    ArrayList<String> list_item;
    Context mcontext;
    int[] image;

    GlobalAdapter(Context context, ArrayList<String> list, int[] images,String text)
    {
        this.mcontext = context;
        this.list_item = list;
        this.image = images;
        this.text=text;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.global_layout, viewGroup, false);
        return new MyView(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {

        final MyView holder = (MyView) viewHolder;
         db = new dbclass(mcontext);
        holder.txt.setText(list_item.get(i));
        holder.img.setImageResource(image[i]);


        holder.txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, subhome.class);
                intent.putExtra("home", text);
                intent.putExtra("my_txt", list_item.get(i));
                intent.putExtra("int", i);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);

            }
        });

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, subhome.class);
                intent.putExtra("home", text);
                intent.putExtra("my_txt", list_item.get(i));
                intent.putExtra("int", i);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);

            }
        });


        final Cursor res = db.getimage(image[i], list_item.get(i),text); //
        if(res.getCount()>0){
            holder.img2.setImageResource(R.drawable.dil);
        }
        holder.img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Cursor res = db.getimage(image[i], list_item.get(i),text);  ///readable,


                if(res.getCount()>0){
                    holder.img2.setImageResource(R.drawable.heart);
                }

                final Cursor res1=db.getimage(image[i], list_item.get(i),text);//
                if(res1.getCount()>0)
                {
                    db.delete(image[i]);
                    holder.img2.setImageResource(R.drawable.heart);
                    Toast.makeText(mcontext, "Removed From Favourite", Toast.LENGTH_SHORT).show();
                }
                else {
                    String get_img = String.valueOf(image[i]);
                    boolean check = db.insertdata(get_img, list_item.get(i),text);  //writable
                    if (check){
                        Toast.makeText(mcontext, "Added To Favourite", Toast.LENGTH_SHORT).show();
                        holder.img2.setImageResource(R.drawable.dil);
                    } else {
                        Toast.makeText(mcontext, "ERROR", Toast.LENGTH_SHORT).show();
                    }
                }

                }
        });

    }
    @Override
    public int getItemCount() {
        return list_item.size();

    }


    class MyView extends RecyclerView.ViewHolder {
        TextView txt;
        ImageView img, img2;

        public MyView(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.gbtxt);
            img = itemView.findViewById(R.id.gbimg);
           img2 = itemView.findViewById(R.id.heart);
        }

    }
}