package com.wordpress.httpsredefiningproductions.ohyeah;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class ohyeah extends Activity {

//set a default for the sound so app does not crash
    SoundPool sp;
    int sound1=0;
    int sound2=0;
    int sound3=0;
    int sound4=0;
    int sound5=0;
    int sound6=0;
    int sound7=0;
    int sound8=0;
    int sound9=0;
    int sound10=0;
    int sound11=0;
    int sound12=0;
    int sound13=0;
    int sound14=0;
    int sound15=0;
    int sound16=0;
    int sound17=0;
    int sound18=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
//link up the sounds to variables
        //import all of the sound
        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(this, R.raw.one, 1);
        sound2 = sp.load(this, R.raw.two, 1);
        sound3 = sp.load(this, R.raw.three, 1);
        sound4 = sp.load(this, R.raw.four, 1);
        sound5 = sp.load(this, R.raw.five, 1);
        //typo in six below
        sound6 = sp.load(this, R.raw.siz, 1);
        sound7 = sp.load(this, R.raw.seven, 1);
        sound8 = sp.load(this, R.raw.eight, 1);
        sound9 = sp.load(this, R.raw.nine, 1);
        sound10 = sp.load(this, R.raw.ten, 1);
        sound11 = sp.load(this, R.raw.eleven, 1);
        sound12 = sp.load(this, R.raw.twelve, 1);
        sound13 = sp.load(this, R.raw.thirteen, 1);
        sound14 = sp.load(this, R.raw.fourteen, 1);
        sound15 = sp.load(this, R.raw.fifteen, 1);
        sound16 = sp.load(this, R.raw.sixteen, 1);
        sound17 = sp.load(this, R.raw.seventeen, 1);
        sound18 = sp.load(this, R.raw.eightteen, 1);



//the "OH YEAH"
        TextView ohyeah = (TextView) findViewById(R.id.textView);


        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_ohyeah);
        //ads
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        //create all of the buttons

        Button one = (Button) findViewById(R.id.buttonone);
        Button two = (Button) findViewById(R.id.buttontwo);
        Button three = (Button) findViewById(R.id.buttonthree);
        Button four = (Button) findViewById(R.id.buttonfour);
        Button  five= (Button) findViewById(R.id.buttonfive);
        Button six = (Button) findViewById(R.id.buttonsix);
        Button seven = (Button) findViewById(R.id.buttonseven);
        Button eight  = (Button) findViewById(R.id.buttoneight);
        Button nine = (Button) findViewById(R.id.buttonnine);
        Button ten = (Button) findViewById(R.id.buttonten);
        Button eleven = (Button) findViewById(R.id.buttoneleven);
        Button twelve = (Button) findViewById(R.id.buttontwelve);
        Button thirteen = (Button) findViewById(R.id.buttonthirteen);
        Button fourteen = (Button) findViewById(R.id.buttonfourteen);
        Button fifteen = (Button) findViewById(R.id.buttonfifteen);
        Button sixteen = (Button) findViewById(R.id.buttonsixteen);
        Button seventeen = (Button) findViewById(R.id.buttonseventeen);
        Button eightteen = (Button) findViewById(R.id.buttoneightteen);
        //ON CLICK LISTERNER TIME

        one.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound1 != 0) {
                    sp.play(sound1, 1, 1, 0, 0, 1);
                }
            }
        });
        two.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound2 != 0) {
                    sp.play(sound2, 1, 1, 0, 0, 1);
                }
            }
        });
        three.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound3 != 0) {
                    sp.play(sound3, 1, 1, 0, 0, 1);
                }
            }
        });
        four.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound4 != 0) {
                    sp.play(sound4, 1, 1, 0, 0, 1);
                }
            }
        });
        five.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound5 != 0) {
                    sp.play(sound5, 1, 1, 0, 0, 1);
                }
            }
        });
        six.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound6 != 0) {
                    sp.play(sound6, 1, 1, 0, 0, 1);
                }
            }
        });
        seven.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound7 != 0) {
                    sp.play(sound7, 1, 1, 0, 0, 1);
                }
            }
        });
        eight.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound8 != 0) {
                    sp.play(sound8, 1, 1, 0, 0, 1);
                }
            }
        });
        nine.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound9 != 0) {
                    sp.play(sound9, 1, 1, 0, 0, 1);
                }
            }
        });
        ten.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound10 != 0) {
                    sp.play(sound10, 1, 1, 0, 0, 1);
                }
            }
        });
        eleven.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound11 != 0) {
                    sp.play(sound11, 1, 1, 0, 0, 1);
                }
            }
        });
        twelve.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound12 != 0) {
                    sp.play(sound12, 1, 1, 0, 0, 1);
                }
            }
        });
        thirteen.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound13 != 0) {
                    sp.play(sound13, 1, 1, 0, 0, 1);
                }
            }
        });
        fourteen.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound14 != 0) {
                    sp.play(sound14, 1, 1, 0, 0, 1);
                }
            }
        });
        fifteen.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound15 != 0) {
                    sp.play(sound15, 1, 1, 0, 0, 1);
                }
            }
        });
        sixteen.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound16 != 0) {
                    sp.play(sound16, 1, 1, 0, 0, 1);
                }
            }
        });
        seventeen.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound17 != 0) {
                    sp.play(sound17, 1, 1, 0, 0, 1);
                }
            }
        });
        eightteen.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //play sound
                if (sound18 != 0) {
                    sp.play(sound18, 1, 1, 0, 0, 1);
                }
            }
        });





    }

}