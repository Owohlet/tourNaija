package com.iykeowoh.tournaija;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iykeowoh on 5/3/15.
 */
public class Test extends Activity {

    ImageView imgv, imgv2;
    TextView header, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        header = (TextView) findViewById(R.id.placeheader);
        info = (TextView) findViewById(R.id.tvPlaceText);
        imgv = (ImageView) findViewById(R.id.test);
        imgv2 = (ImageView) findViewById(R.id.test2);

        Bundle bundle = getIntent().getExtras();
        int pic = bundle.getInt("img1");
        int pic2 = bundle.getInt("img2");
        String gotText = bundle.getString("text");
        String gotHeader = bundle.getString("header");

        header.setText(gotHeader);
        info.setText(gotText);
        imgv.setBackgroundResource(pic);
        imgv2.setBackgroundResource(pic2);
    }
}
