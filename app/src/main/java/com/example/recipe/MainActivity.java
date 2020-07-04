package com.example.recipe;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        tablayout = findViewById(R.id.tablayout);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        viewpager.setAdapter(fragmentAdapter);
        tablayout.setupWithViewPager(viewpager);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.fav) {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);

        }

        if (id == R.id.share) {
            Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
               // share.setPackage("com.google.android.gm");
                String shareSub = "Receipe";
                share.putExtra(Intent.EXTRA_SUBJECT, getPackageName());
                startActivity(Intent.createChooser(share, "Hindi Receipes"));
        }

        if (id == R.id.fee) {
            Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.setPackage("com.google.android.gm");

               intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"info@inforises.com"});
                intent.putExtra(Intent.EXTRA_TEXT,"Share your experience");
                startActivity(intent);
        }

        if (id == R.id.exit) {
            finish();
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        String txt=item.toString();
        int id = item.getItemId();

     if (id == R.id.nasta) {
         Intent intent = new Intent(this, home.class);
         intent.putExtra("type", txt);
         startActivity(intent);
     }
        if (id == R.id.partha) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.chatni) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.aachar) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.salad) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.roti) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.sabzi) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.sambhar) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.maithai) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.festival) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.nonvg) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }

        if (id == R.id.punj) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.south) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.soup) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }

        if (id == R.id.guj) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }

        if (id == R.id.beng) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.birya) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.child) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }
        if (id == R.id.sharbat) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }

        if (id == R.id.fast) {
            Intent intent = new Intent(this, home.class);
            intent.putExtra("type", txt);
            startActivity(intent);
        }



        if (id == R.id.nav_share) {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            String shareSub = "Receipe";
            share.putExtra(Intent.EXTRA_SUBJECT, getPackageName());
            startActivity(Intent.createChooser(share, "Hindi Receipes"));
        }


        if (id == R.id.nav_rate){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+getPackageName()));
            startActivity(intent);
        }

        if (id == R.id.feed) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.setPackage("com.google.android.gm");

            intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"info@inforises.com"});
            intent.putExtra(Intent.EXTRA_TEXT,"Share your experience");
            startActivity(intent);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public class FragmentAdapter extends FragmentPagerAdapter {

        Context mycontext;

        public FragmentAdapter(FragmentManager fm, Context mycontext) {
            super(fm);
            this.mycontext = mycontext;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new tab2();
                case 1:
                    return new tab3();
                default:
                    return new tab2();
            }
        }

        @Override
        public int getCount()

        {
            return 2;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "HOME ";
                case 1:
                    return "VIDEOS";
                default:
                    return "HOME";

            }

        }

    }
}
