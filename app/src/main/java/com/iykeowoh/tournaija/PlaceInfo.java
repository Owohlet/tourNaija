package com.iykeowoh.tournaija;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iykeowoh on 5/2/15.
 */
public class PlaceInfo extends Activity{
    TextView header, infotext;
    ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placeinfo);
        initialize();


       Bundle placeBundle = getIntent().getExtras();

        String gottenHeader = placeBundle.getString("header");
        String gottenInfo = placeBundle.getString("text");
        int gotImg1 = placeBundle.getInt("Img1");
        int gotImg2 = placeBundle.getInt("Img2");
        int gotImg3 = placeBundle.getInt("Img3");

        img1.setImageResource(gotImg1);
        img2.setBackgroundResource(gotImg2);
        img3.setBackgroundResource(gotImg3);
        header.setText(gottenHeader);
        infotext.setText(gottenInfo);
    }

    private void initialize() {
        header = (TextView) findViewById(R.id.placeheader);
        infotext = (TextView) findViewById(R.id.tvPlaceText);
        img1 = (ImageView) findViewById(R.id.iv1);
        img2 = (ImageView) findViewById(R.id.iv2);
        img3 = (ImageView) findViewById(R.id.iv3);
    }
}
