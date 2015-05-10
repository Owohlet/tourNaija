package com.iykeowoh.tournaija;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iykeowoh on 5/4/15.
 */
public class Beachinfo extends Activity {

    ImageView imgv;
    TextView header, info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beachinfo);

        imgv = (ImageView) findViewById(R.id.beachImage);
        header = (TextView) findViewById(R.id.beachName);
        info = (TextView) findViewById(R.id.beachtext);

        Bundle bundle = getIntent().getExtras();
        int pic = bundle.getInt("img");

        String gotText = bundle.getString("beachinfo");
        String gotHeader = bundle.getString("beachname");

        header.setText(gotHeader);
        info.setText(gotText);
        imgv.setBackgroundResource(pic);

    }
}
