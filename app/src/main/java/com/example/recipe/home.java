package com.example.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;

public class home extends AppCompatActivity {

    ArrayList<String> list=new ArrayList<>();
    int images[];

    RecyclerView rec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(this.getResources().getColor(R.color.mycolor));

        setContentView(R.layout.activity_nasta);
        final RecyclerView rec = (RecyclerView) findViewById(R.id.recycler3);
        final String text = getIntent().getStringExtra("type");


       final TextView txt = (TextView) findViewById(R.id.txtview);
        ImageView imag =(ImageView)findViewById(R.id.imggg2) ;



        Toolbar toolbar = (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null)
        {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        switch (text) {
            case "Nasta Receipes": {
                txt.setText(text);

                imag.setImageResource(R.drawable.kanda);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Nasta Receipes");
                        intent.putExtra("my_txt","कांदा पोहा");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n4,R.drawable.n5,R.drawable.n6,
                        R.drawable.n7, R.drawable.n8,R.drawable.n9,R.drawable.n10,R.drawable.n11,R.drawable.n12,
                        R.drawable.n13, R.drawable.n14,R.drawable.n15};

                list.add("कांदा पोहा");list.add("आलू पोहा ");list.add("लखनवी नायाब पैटीज ");list.add("आलू टिक्की");
                list.add("मिक्स वेग सैंडविच ");list.add("ब्रेड पिज़्ज़ा ");list.add("उपमा");list.add("सेवई उपमा");
                list.add("दलीया पुलाव");list.add("दाल चावल इडली");list.add("लखनवी नायाब पैटीज ");list.add("रवा इडली ");
                list.add("मिकांचीपुरम इडली ");list.add("ब्पोहा इडली");list.add("पेपर डोसा ");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Paratha Receipes": {
                txt.setText(text);
                //imag.setImageResource(a);

                imag.setImageResource(R.drawable.para);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Paratha Receipes");
                        intent.putExtra("my_txt","आलू के पराठे");
                        startActivity(intent);
                    }
                });


                int[] images = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,
                        R.drawable.p8,R.drawable.p9,R.drawable.p10,R.drawable.p11,R.drawable.p12,R.drawable.p13,R.drawable.p14,
                        R.drawable.p15};

                list.add("आलू के पराठे");list.add("प्याज के पराठेi");list.add("गोभी के पराठे");list.add("पनीर के पराठे");
                list.add("पनीर एंड स्प्रिंग अनियन पराठा");list.add("पिज़्ज़ा पराठा");list.add("बाज़ार मसाला पराठा");list.add("आलू चीज़ पराठा");
                list.add("मूंग दाल मसाला पराठा");list.add("मूली का पराठा");list.add("पालक का पराठा");list.add("मसाला पराठा");
                list.add("स्वीट कॉर्न या मकई भरा पराठाा");list.add("पनीर टमाटर पराठा");list.add("मैथी का पराठा");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Chatni Receipes": {
                txt.setText(text);
                //imag.setImageResource(a);
                imag.setImageResource(R.drawable.chat);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Chatni Receipes");
                        intent.putExtra("my_txt","खजूर इमली की चटनी");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6,R.drawable.c7,
                        R.drawable.c8,R.drawable.c9,R.drawable.c10,R.drawable.c11,R.drawable.c12,R.drawable.n13,R.drawable.c14,
                        R.drawable.c15};


                list.add("कच्चे टमाटर चटनी");list.add(" कच्चे आम के चटनी ");list.add("आवला की मिट्ठी");list.add("मूली की चटनी ");
                list.add("पुदीने की चटनी");list.add("खजूर इमली की चटनी ");list.add("इमली की चटनी");list.add("मूंगफली दही चटनी ");
                list.add("लहसून की चटनी");list.add("हरे धनिये की चटनी ");list.add("तौरी की चटनी ");list.add("करुणदे की चटनी ");
                list.add("नारियल की चटनी");list.add("दही पुदीने की चटनी");list.add("अनार दाने की चटनी ");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Aachar Receipes": {
                txt.setText(text);
                //imag.setImageResource(a);
                imag.setImageResource(R.drawable.aac);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Aachar Receipes");
                        intent.putExtra("my_txt","आंवले का अचार ");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,
                        R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,
                        R.drawable.a15};

                list.add("करोंदे का अचार");list.add("करेले का अचार ");list.add("खजूर का अचार ");list.add("आंवले का अचार ");
                list.add("लहसून का अचार ");list.add("निम्बू का खट्टा अचार");list.add("अदरक का अचार");list.add("भरवा लाल मिर्च का अचार ");
                list.add("टमाटर  का खट्टा मीठा अचार");list.add("हरी मिर्च का राइ का अचार");list.add(" आम्बा हल्दी का अचार");
                list.add("प्याज का अचार");list.add( "निम्बू की छिलके का अचार ");list.add("गाजर का अचार");list.add("मंगलोरी  का अचार");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }
            case "Salad Receipes":
            {
                txt.setText(text);
                //imag.setImageResource(a);
                imag.setImageResource(R.drawable.sala);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Salad Receipes");
                        intent.putExtra("my_txt","कक्रंची सलाद");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4,R.drawable.s5,
                        R.drawable.s6,R.drawable.s7,R.drawable.s8,R.drawable.s9,R.drawable.s10,R.drawable.s11,
                        R.drawable.s12,R.drawable.s13,R.drawable.s14,R.drawable.s15};

                list.add("बीन्स और टिल का सलाद" );list.add("अमेरिकन स्वीट कॉर्न सलाद ");list.add("अमेरिकन स्वीट कॉर्न सलाद ");
                list.add("मुल्ली लच्छा सलाद ");list.add("चुकंदर का क्रीम वाल स्वादिष्ट सलाद");list.add("कस्टर्ड सलाद ");
                list.add("मिंट टोमेटो सलाद ");list.add("स्प्राउट सलाद ");list.add("क्रंची सलाद ");list.add("ग्रीक पास्ता सलाद");
                list.add("हेल्थी सलाद");list.add("कैबेज एंड एप्पल सैलेड");list.add( "साउथ इंडियन सलाद ");list.add("तंमतर प्याज रायता ");
                list.add("ककड़ी टमाटर  का रायता ");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Roti Receipes": {
                txt.setText(text);
                //imag.setImageResource(a);
                imag.setImageResource(R.drawable.troti);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Roti Receipes");
                        intent.putExtra("my_txt","तंदूरी रोटी");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.r1,R.drawable.r2,R.drawable.r3,R.drawable.r4,R.drawable.r5,
                        R.drawable.r6,R.drawable.r7,R.drawable.r8,R.drawable.r9,R.drawable.r10,
                        R.drawable.r11,R.drawable.r12,R.drawable.r13,R.drawable.r14,R.drawable.r15};

                list.add("चावल आटे की रोटी ");list.add("बाज़ार की रोटी ");list.add("चपाती");list.add("पूरन पोली");
                list.add("तंदूरी रोटी ");list.add("रवा रोटी ");list.add("हेल्थी ओट्स रोटी");list.add("नारियल मीठी रोटी");
                list.add("पोटैटो एंड बेबी कॉर्न चपाती रोल ");list.add("स्वीट रोटी रेसिपी ");list.add("आलू की पूरी");
                list.add("चावल की पूरी");list.add("छोलिया पूरी ");list.add("राजस्थानी दाल की पूरी ");list.add("आलू भठूरे");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }
            case "Sabzi Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.saaab);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Sabzi Receipes");
                        intent.putExtra("my_txt","मटर पनीर");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.sa1,R.drawable.sa2,R.drawable.sa3,R.drawable.sa4,R.drawable.sa5,
                        R.drawable.sa6,R.drawable.sa7,R.drawable.sa8,R.drawable.sa9,R.drawable.sa10,R.drawable.sa11,
                        R.drawable.sa12,R.drawable.sa13,R.drawable.sa14,R.drawable.sa15};


                list.add("वेज कोल्हापुरी");list.add("मटर पनीर ");list.add("मूंग दाल ");list.add("पालक मशरूम");
                list.add("मखाना काजू करी");list.add("पनीर कोफ्ता ");list.add("बैगन  करी ");list.add("गोभी मटर मसाला ");
                list.add("स्पेशल दाल सब्जील ");list.add("गुजराती स्टाइल आलू की रस वाली सब्जी ");list.add("पालक कड़ी ");list.add("मसालेदार आलू की सब्जी");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Sambhar Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.sam);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Sambhar Receipes");
                        intent.putExtra("my_txt","साम्भर");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.sb1,R.drawable.sb2,R.drawable.sb3,R.drawable.sb4,R.drawable.sb5,
                        R.drawable.sb6,R.drawable.sb7, R.drawable.sb8,R.drawable.sb9,R.drawable.sb10,R.drawable.sb11,
                        R.drawable.sb12,R.drawable.sb13,R.drawable.sb14,R.drawable.sb15};

                list.add("शाही दाल ");list.add("साबुत मसूर की दाल ");list.add("पांच रतन दाल ");list.add( "अरहर की दाल ");
                list.add("दाल मखनी ");list.add("चने की दाल ");list.add("साम्भर ");list.add("वेजिटेबल साम्भर ");list.add("कद्दू सांभर ");
                list.add("चन्ना दाल विध कोकोनट ग्रेवी ");list.add("बटर मिलका साम्भर ");list.add("पारसी दाल ");list.add("मैथी दाल रेसिपी ");
                list.add("दाल कबीला ");list.add("अंकुरित मूंग दाल ");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Mithai Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.mii);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Mithai Receipes");
                        intent.putExtra("my_txt","कगाजर का हलवा");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m5,R.drawable.m6,
                        R.drawable.m7, R.drawable.m8,R.drawable.m9,R.drawable.m10,R.drawable.m11,R.drawable.m12,R.drawable.m13,
                        R.drawable.m14,R.drawable.m15};
                list.add("गाजर का हलवा ");list.add("मूंग दाल का हलवा ");list.add("बेसन का हलवा ");list.add("सेवई का हलवा ");
                list.add("ब्रेड का हलवा ");list.add( "खसखस का हलवा");list.add( "बॉम्बे कराची का हलवा ");list.add(" पैठे का हलवा");
                list.add(" लौकी का हलवा ");list.add("स्ट्रॉबेरी का हलवा");list.add("तरबूज के छिलके का हलवा" );list.add("बाज़ार के आटे  का हलवा");
                list.add("आटे  का हलवा ");list.add("बादाम का हलवा ");list.add("स्वीटकॉर्न बर्फी व हलवा ");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }


            case "Festival Food Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.laddu);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Festival Receipes");
                        intent.putExtra("my_txt","बेसन के लड्डू");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,
                        R.drawable.f7,R.drawable.f8,R.drawable.f9,R.drawable.f10,R.drawable.f11,R.drawable.f12,
                        R.drawable.f13,R.drawable.f14,R.drawable.f15};
                list.add("बेसन के लड्डू");list.add("अनरसे ");list.add("चावल की चकली ");list.add("बेक्ड अंजीर गुजिया ");
                list.add("नारियल का हलवा ");list.add("गुलालाब जामुन ");list.add("बेसन का हलवा ");list.add("चिवड़ा");
                list.add("कुरमुरा तड़का ");list.add("शकरपारे ");list.add("मीठे शकरपारे ");list.add("सूजी के लड्डू ");list.add("माल पुआ ");
                list.add("काजू कतली ");list.add("पनीर मलाई के लाडू ");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Non Veg Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.anda);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Non Veg Receipes");
                        intent.putExtra("my_txt","अंडा करी");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.no1,R.drawable.no2,R.drawable.no3,R.drawable.no4,R.drawable.no5,R.drawable.no6,
                        R.drawable.no7,R.drawable.no8,R.drawable.no9,R.drawable.no10,R.drawable.no11,R.drawable.no12,
                        R.drawable.no13,R.drawable.no14,R.drawable.no15};
                list.add("अंडा करी" );list.add("मसाले दार अंडा फ्राई");list.add("मसाला एग भुर्जी ");list.add("मसाला आमलेट ");
                list.add("एग पकोड़ा करी");list.add( "लेमन ग्रास चिल्ली चिकन");list.add("जायके दार मशरूम आमलेट");list.add(" मटन खोफ्ता ");
                list.add("तंदूरी चिकन");list.add("लज़ीज मसअला मटन");list.add(" चिकन टिक्का मसाला");list.add(" चिकन पकोड़ा");
                list.add(" चिकन मंचूरियन");list.add(" चिकन कटलेट");list.add( "बटर चिकन ");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Punjabi Food Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.bhat);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Punjabi Food Receipes");
                        intent.putExtra("my_txt","भठूरे");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.pu1,R.drawable.pu2,R.drawable.pu3,R.drawable.pu4,R.drawable.pu5,R.drawable.pu6,
                        R.drawable.pu7,R.drawable.pu8,R.drawable.pu9,R.drawable.pu10,R.drawable.pu11,R.drawable.pu12};
                list.add("भठूरे");list.add("पंजाबी ढाबे वाली दाल ");list.add("सरसो का साग मक्के की रोटी");list.add("चना मसाला");
                list.add("दम आलू अमृतसरी ");list.add("मक्के की पिन्नी ");list.add("उरद दाल पिन्नी ");list.add("अलसी की पिन्नी ");
                list.add("अंजीर कोफ्ता करी");list.add("करले की कलोंजी ");list.add("पालक सोया साग स्वीटकॉर्न करी ");list.add("मटर पनीर ढाबा स्टाइल ");


                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "South Indian Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.su3);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","South Indian Food Receipes");
                        intent.putExtra("my_txt","आटे  का डोसा");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.su1,R.drawable.su2,R.drawable.su3,R.drawable.su4,R.drawable.su5,R.drawable.su6,R.drawable.su7,R.drawable.su8,
                        R.drawable.su9,R.drawable.su10,R.drawable.su11,R.drawable.su12,R.drawable.su13};
                list.add("ओट उत्पम ");list.add("ब्रेड उत्पम ");list.add("आटे  का डोसा ");list.add("टमाटर  रसम ");
                list.add("कच्चे केले के चिप्स ");list.add("नीरा डोसा ");list.add("भरवा रवा इडली ");list.add("कर्ड राइस ");
                list.add("लौकी की सब्जी ");list.add("कटहल करी ");list.add("वाते अप्पम");list.add(" ऊनि अप्पम");list.add("कसूंदी ");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Soup Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.sp3);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Soup Receipes");
                        intent.putExtra("my_txt","कक्स वेजिटेबल सूप");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.sp1,R.drawable.sp2,R.drawable.sp3,R.drawable.sp4,R.drawable.sp5,R.drawable.sp6
                        ,R.drawable.sp7,R.drawable.sp8,R.drawable.sp9,R.drawable.sp10,R.drawable.sp11,R.drawable.sp12,R.drawable.sp13};
                list.add("मशरूम सूप ");list.add("वेजिटेबल नूडल सूप ");list.add("लाल सूप ");list.add("ब्रॉक्ली सूप");
                list.add("पालक का सूप ");list.add("मिक्स वेजिटेबल सूप " );list.add("वेजिटेबल नूडल सूप");list.add("स्वीट कॉर्न सूप ");
                list.add("मिक्स वेज मूंग दाल सूप ");list.add("पालक गोभी सूप");list.add("मसूर दाल सूप");list.add("वेज मानचाओ सूप ");
                list.add("वेजटेबल हॉट एन्ड सौर सूप ");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Gujarati Food Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.g1);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Gujarati Food Receipes");
                        intent.putExtra("my_txt","माइक्रोवेव में बेसन का ढोकला");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.g1,R.drawable.g2,R.drawable.g3,R.drawable.g4,R.drawable.g5,R.drawable.g6,
                        R.drawable.g7,R.drawable.g8,R.drawable.g9,R.drawable.g10,R.drawable.g11,R.drawable.g12,
                        R.drawable.g13,R.drawable.g14,R.drawable.g15};
                list.add("माइक्रोवेव में बेसन का ढोकला");list.add("पूरी ");list.add("लहसून की चटनी ");list.add("लोकि की मुठिया ");
                list.add("बाजरा लोकि थेपला ");list.add("निमकी");list.add("साबुत लसोड़े का अचार ");list.add("फ़ारसी पूरी ");
                list.add("भाकरवड़ी ");list.add("मकई शिमला मिर्च ");list.add("रवा पोहा ढोकला");list.add(" मैथी मुठिया ");
                list.add("मसाला रवा इडली ");list.add("दाबेली ");list.add("सूजी के वड़े ");

                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Bengali Food Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.b6);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Bengali Food Receipes");
                        intent.putExtra("my_txt","राजभोग ");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,
                        R.drawable.b7,R.drawable.b8,R.drawable.b9,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13,
                        R.drawable.b14,R.drawable.b15};
                list.add("छेना खीर" );list.add("रसकदम ");list.add("सन्देश ");list.add("मिष्टी दोई ");list.add("एलो झेलो ");
                list.add("राजभोग ");list.add("स्पंज रसगुले ");list.add("चावल का नमकीन पिस्ता ");list.add("रसमिलै ");list.add("पनीर कैसे बनाये");
                list.add("छेना रसगुल्ला");list.add("सैम  मटर आलू ");list.add("बंगाली स्टाइल मैं भुनी खिचड़ी");list.add( "बंगाली मसाला खिचड़ी ");
                list.add("बंगाली लुची आलूर दम");


                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images, text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Biryani Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.pw1);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Biryani Receipes");
                        intent.putExtra("my_txt","वेज पुलाव");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.pw1,R.drawable.pw2,R.drawable.pw3,R.drawable.pw4,R.drawable.pw5,R.drawable.pw6,
                        R.drawable.pw7,R.drawable.pw8,R.drawable.pw9,R.drawable.pw10,R.drawable.pw11,R.drawable.pw12,
                        R.drawable.pw13,R.drawable.pw14,R.drawable.pw15};
                list.add("वेज पुलाव");list.add("कश्मीरी पुलाव ");list.add("छोलिया  पुलाव ");list.add("पनीर पुलाव ");
                list.add("मैक्रोनी राइस पुलाव ");list.add("काबुली चने का पुल्लाओ");list.add("साही पुलाओ ");
                list.add("मैथी मटर पुलाव ");list.add("सादा पुलाव ");list.add("मशरूम पुलाव ");list.add("कॉर्न पुलाव ");
                list.add("फ्रूट पुलाव ");list.add("वेजिटेबल बिरयानी ");list.add("दाल सब्जी बिरयानी ");list.add("पालक राइस ");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Children Food Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.ch7);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Children Food Receipes");
                        intent.putExtra("my_txt","बादाम कूकीज");
                        startActivity(intent);
                    }
                });

                int[] images = {R.drawable.ch1,R.drawable.ch2,R.drawable.ch3,R.drawable.ch4,R.drawable.ch5,R.drawable.ch6,
                        R.drawable.ch7,R.drawable.ch8,R.drawable.ch9,R.drawable.ch10,R.drawable.ch11,R.drawable.ch12,
                        R.drawable.ch13,R.drawable.ch14,R.drawable.ch15};
                list.add("मैगी  रेसिपी ");list.add("दलीया ");list.add("कैप्सिकम बेबी कॉर्न फ्राई ");list.add("दाल खिचड़ी");
                list.add("मोल्डेड चॉक्लेट ");list.add("दलीया लापसी ");list.add("बादाम कूकीज ");list.add("ओट्स इडली ");
                list.add("लेमन बनाना केक ");list.add("स्वीट राइस पैनकेक");list.add("चॉक्लेट चिप्स कूकीज ");list.add("कोकोनट कूकीज ");
                list.add("वनीला केक");list.add("चटपटा फ्रूट सैंडविच ");list.add("मसाला पॉपकॉर्न ");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
                   }

            case "Sharbat Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.t7);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Sharbat Receipes");
                        intent.putExtra("my_txt","निम्बू पोदीना शरबत");
                        startActivity(intent);
                    }
                });

                int[] images =  {R.drawable.t1,R.drawable.t2,R.drawable.t3,R.drawable.t4,R.drawable.t5,R.drawable.t6,
                        R.drawable.t7,R.drawable.t8,R.drawable.t9,R.drawable.t10,R.drawable.t11,R.drawable.t12,
                        R.drawable.t13,R.drawable.t14,R.drawable.t15};

                list.add("ठंडाई ");list.add( "तरबूज का सरबत ");list.add( "बेल का सरबत ");list.add( "गुलाब का शरबत");
                list.add( "फालसे का शरबत");list.add("स्ट्रॉबेरी जूस ");list.add( "निम्बू पोदीना शरबत");list.add( "आम का शरबत ");
                list.add( "इमली का शरबत");list.add( " ठंडी चाय");list.add( "वर्जिन मोगितो");list.add( "पपीता मिल्क शेक");
                list.add( " मिक्स फलो का जूस");list.add( " दही की लस्सी");list.add( "खरबूजे का शेक");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

            case "Fast Food Receipes": {
                txt.setText(text);//imag.setImageResource(a);
                imag.setImageResource(R.drawable.v6);
                imag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent =new Intent(home.this,subhome.class);
                        intent.putExtra("home","Fast Food Receipes");
                        intent.putExtra("my_txt","राजगिरा के लड्डू");
                        startActivity(intent);
                    }
                });

                int[] images =  {R.drawable.v1,R.drawable.v2,R.drawable.v3,R.drawable.v4,R.drawable.v5,R.drawable.v6,
                        R.drawable.v7,R.drawable.v8,R.drawable.v9,R.drawable.v10,R.drawable.v11,R.drawable.v12,
                        R.drawable.v13,R.drawable.v14,R.drawable.v15};

                list.add(" साबुदाणा खिचडी  ");list.add( "साबूदाना बड़ा");list.add( "साबूदाना पापड ");list.add( " साबूदाना खीर ");
                list.add( "  साबूदाना नमकीन");list.add(" राजगिरा के लड्डू ");list.add( "न साबूदाना लड्डू");list.add( " राजगिरा खीर");
                list.add( " फराली दोसा");list.add( "  मीठा फराली पॅनकेक");list.add( " काजू चिक्की ");list.add( " आलू का हलवा ");
                list.add( " साबूदाना थालीपीठ ");list.add( "आलू की दही वाली सब्जी");list.add( " फलों का रायता ");
                GlobalAdapter recyclerAdapter = new GlobalAdapter(getApplicationContext(), list, images,text);
                rec.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
                rec.setAdapter(recyclerAdapter);
                break;
            }

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

        if(id==android.R.id.home);
        finish();


        if (id == R.id.fav) {
            Intent intent=new Intent(home.this,Main2Activity.class);
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

}
