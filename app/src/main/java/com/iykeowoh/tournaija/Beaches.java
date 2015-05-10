package com.iykeowoh.tournaija;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by iykeowoh on 5/3/15.
 */
public class Beaches extends Activity implements View.OnClickListener{
    ImageView coconut, whispering, latropicana, oniru, elegushi, takwabay;

    int beachimg[] = {R.drawable.coconut, R.drawable.whisperingpalms, R.drawable.coconut};
    String beachinfo = " The coconut Beach is one of the several beaches on the Atlantic Ocean along the shorelines of Lagos and situated at Victoria Island in Lagos, Nigeria. It is the most luxurious beach in Nigeria.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beaches);
        initialize();

        coconut.setOnClickListener(this);
        whispering.setOnClickListener(this);
        latropicana.setOnClickListener(this);
        oniru.setOnClickListener(this);
        elegushi.setOnClickListener(this);
        takwabay.setOnClickListener(this);
    }

    private void initialize() {
        coconut = (ImageView) findViewById(R.id.ivCoconut);
        whispering = (ImageView) findViewById(R.id.ivWhisper);
        latropicana = (ImageView) findViewById(R.id.ivLacampaigne);
        oniru = (ImageView) findViewById(R.id.ivOniru);
        elegushi = (ImageView) findViewById(R.id.ivElegushi);
        takwabay = (ImageView) findViewById(R.id.ivTakwabay);
    }

//    @Override
    public void onClick(View v) {
        Intent inte = new Intent(Beaches.this, Beachinfo.class);
        Bundle bask = new Bundle();
        String s1, s2;
        int img;

        switch (v.getId()){
            case R.id.ivCoconut:
                s1 = "Coconut Beach";
                s2 = beachinfo;
                img = beachimg[0];
                bask.putString("beachname", s1);
                bask.putString("beachinfo", s2);
                bask.putInt("img", img);
                inte.putExtras(bask);
                startActivity(inte);



                break;
            case R.id.ivWhisper:
                s1 = "Whispering Palms Beach";
                s2 = beachinfo;
                img = beachimg[1];
                bask.putString("beachname", s1);
                bask.putString("beachinfo", s2);
                bask.putInt("img", img);
                inte.putExtras(bask);
                startActivity(inte);

                break;
            case R.id.ivLacampaigne:
                s1 = "La Capaigne Tropicana Beach";
                s2 = beachinfo;
                img = beachimg[0];
                bask.putString("beachname", s1);
                bask.putString("beachinfo", s2);
                bask.putInt("img", img);
                inte.putExtras(bask);
                startActivity(inte);

                break;
            case R.id.ivOniru:

                break;
            case R.id.ivElegushi:

                break;
            case R.id.ivTakwabay:

                break;
//
        }

    }
}
