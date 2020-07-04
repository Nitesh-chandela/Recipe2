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

import java.io.File;
import java.util.ArrayList;

public class display_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder > {


    dbclass db;
    ArrayList<String> text;
    ArrayList<String> image;
    Context context;
    ArrayList<String> text2;

   // String mtext;



   display_adapter(Context context, ArrayList<String> image,ArrayList<String> text,ArrayList<String> text2) //,
    {
        this.context=context;
        this.image = image;
        this.text=text;
        this.text2=text2;

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.display,viewGroup,false);
        return new MyView(view);

    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i)
    {

        final MyView holder = (MyView) viewHolder;
        db = new dbclass(context);
        holder.txt.setText(text.get(i));
        holder.img.setImageResource(Integer.parseInt(image.get(i)));

        holder.txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.txt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, subhome.class);
                        intent.putExtra("home", text2.get(i));
                        intent.putExtra("my_txt", text.get(i));
                        context.startActivity(intent);
                    }
                });



            }
        });

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, subhome.class);
                        intent.putExtra("home", text2.get(i));
                        intent.putExtra("my_txt", text.get(i));
                        context.startActivity(intent);
                    }
                });



            }
        });

        holder.img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Cursor res = db.getimage(Integer.parseInt(image.get(i)), text.get(i),text2.get(i)); //


                if(res.getCount()>0){
                    holder.img2.setImageResource(R.drawable.heart);
                }

                final Cursor res1=db.getimage(Integer.parseInt(image.get(i)), text.get(i),text2.get(i));  //,
                if(res1.getCount()>0)
                {
                    db.delete(Integer.parseInt(image.get(i)));
                    holder.img2.setImageResource(R.drawable.heart);
                    Toast.makeText(context, "Removed From Favourite", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    @Override
    public int getItemCount() {
        return text.size();

    }


    class MyView extends RecyclerView.ViewHolder     {
        TextView txt;
        ImageView img,img2;
        public MyView(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.distxt);
            img=itemView.findViewById(R.id.disimg);
            img2=itemView.findViewById(R.id.disheart);

        }
    }
}
