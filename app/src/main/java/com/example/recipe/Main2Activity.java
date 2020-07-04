package com.example.recipe;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.mycolor));

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        TextView txxt=(TextView)findViewById(R.id.txtview);
        txxt.setText("Favourites");

        RecyclerView rec = findViewById(R.id.recy);

        final dbclass db = new dbclass(getApplicationContext());
        Cursor all_data = db.getalldata();
        ArrayList<String> my_text = new ArrayList<>();
        ArrayList<String> my_img = new ArrayList<>();
        ArrayList<String> my_txt2 = new ArrayList<>();
        while(all_data.moveToNext()){
            my_text.add(all_data.getString(2));
            my_img.add(all_data.getString(1));
            my_txt2.add(all_data.getString(3));
        }

        display_adapter recyclerAdapter = new display_adapter(getApplicationContext(),my_img,my_text,my_txt2); //
        rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        rec.setAdapter(recyclerAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);

    }

}
