package com.example.recipe;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class recycler_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder >
{
    ArrayList<String> list_item;
    Context mcontext;
    int[] image;

    recycler_adapter(Context context,ArrayList<String> list,int[] images)
    {
        this.mcontext=context;
        this.list_item = list;
        this.image=images;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.item_layout,viewGroup,false);
         return new MyView(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i)
    {

        MyView holder = (MyView) viewHolder;
        holder.txt.setText(list_item.get(i));
        holder.img.setImageResource(image[i]);


    }

    @Override
    public int getItemCount() {
        return list_item.size();

    }

        class MyView extends RecyclerView.ViewHolder {
        TextView txt;
        ImageView img,img1;
        public MyView(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.mytxt);
            img=itemView.findViewById(R.id.image);;

        }
    }
}
