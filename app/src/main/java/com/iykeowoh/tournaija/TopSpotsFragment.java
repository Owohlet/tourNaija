package com.iykeowoh.tournaija;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

/**
 * Created by iykeowoh on 4/29/15.
 */
public class TopSpotsFragment extends Fragment implements View.OnClickListener{

    TextView obudu, tinapa, cross, yankari, ogbunike, olumo;

    ImageView obuduIm, tinapaIm, crossIm, yankariIm, OgbunikeIm, OlumoIm;


    int obuduImgs[] = {R.drawable.obudu_two,R.drawable.obudu_three,R.drawable.obudu_four};
    int tinapaImgs[] = {R.drawable.tinapa,R.drawable.tinapa_two,R.drawable.obudu_four};
    int crossImgss[] = {R.drawable.crp,R.drawable.crp_two,R.drawable.crp_three};
    int yankariImgs[] = {R.drawable.yankari_two,R.drawable.yankari_three,R.drawable.yankari_four};
    int OgbunikeImgs[] = {R.drawable.ogbunike,R.drawable.ogbunike_two,R.drawable.ogbunike_four};
    int olumoImgs[] = {R.drawable.olumo_two,R.drawable.olumo_three,R.drawable.olumo_four};


    String details[] = {"Obudu Mountain Resort (formerly known as the Obudu Cattle Ranch) is " +
            "a ranch and resort on the Obudu Plateau in Nigeria. It was developed in 1951 by " +
            "Mr. McCaughley, a Scot who first explored the mountain ranges in 1949. He camped " +
            "on the mountaintop of the Oshie Ridge on the Sankwala Mountains for a month before" +
            " returning with Mr. Hugh Jones a fellow rancher who, in 1951, together with" +
            " Dr Crawfeild developed the Obudu Cattle Ranch. Although the ranch has been through " +
            "troubles since, it has very recently been rehabilitated to its former glory. A recently " +
            "added cable car from the base to the top of the plateau gives visitors a scenic view while " +
            "bypassing the extremely winding road to the top.",

            "Tinapa is a business and leisure resort just north of Calabar, south eastern Nigeria associated " +
            "with the Calabar Free Trade Zone. It is being developed in four phases under a Private Public " +
            "Partnership (PPP) promoted by the Government of Cross River State. The resort is located by the" +
            " Calabar River, contiguous with the Calabar Free Trade Zone",

            "The Cross River National Park is a national park of Nigeria, located in Cross River State, Nigeria." +
            " There are two separate sections, Okwangwo (established 1991) and Oban (established 1988). The park has" +
            " a total area of about 4,000 km2, most of which consists of primary moist tropical rainforests in the North " +
            "and Central parts, with mangrove swamps on the coastal zones. Parts of the park belong to the Guinea-Congolian " +
            "region, with a closed canopy and scattered emergent trees reaching 40 or 50 meters in height.",

            "Yankari National Park is a large wildlife park located in the south-central part of Bauchi State, in northeastern " +
            "Nigeria. It covers an area of about 2,244 square kilometres (866 sq mi) and is home to several natural warm water springs, " +
            "as well as a wide variety of flora and fauna. Its location in the heartland of the West African savanna makes it a unique way " +
            "for tourists and holidaymakers to watch wildlife in its natural habitat. Yankari was originally created as a game reserve in 1956, " +
            "but later designated Nigeria’s biggest national park in 1991. It is the most popular destination for tourists in Nigeria and, as such, " +
            "plays a crucial role in the development and promotion of tourism and ecotourism in Nigeria. It is also one of the most popular " +
            "eco-destinations in West Africa",

            "Located in a valley blanketed by tropical rain forest, the collection of caves has been in use over centuries by local people for whom it " +
            "has particular spiritual significance. This spiritual significance is still apparent, as the \"Ime Ogbe\" celebration is undertaken every year" +
            " to commemorate the discovery of the caves.\n" +
            "\n" +
            "Descending into the valley where the caves are located is a lengthy walkway made up of about 317 steps said to have been constructed by the Anambra " +
            "State Government in the mid 90s. Visitors must remove their shoes before entering the caves, as per tradition.",

            "Olumo Rock is a popular tourist attraction in the city of Abeokuta, Nigeria. It was used as a fortress by the Egba " +
            "people in the early 19th century. A lot has been said about the historic, famous Olumo rock, situated at Abeokuta, Ogun " +
            "State, Nigeria. Sitting on a large expanse of land with massive rock formation, it is perhaps the most popular and one of the " +
            "most prestigious tourist sites in Ogun state and Nigeria, at large. Abeokuta is the largest city and capital of Ogun State in southwest " +
            "Nigeria and is situated on the Ogun River; 64 miles north of Lagos by railway, or 81 miles by water. As of 2005, Abeokuta and the surrounding " +
            "area had a population of 593,140."};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.top_spots, container, false);

//          bridge for textviews
        obudu = (TextView) rootView.findViewById(R.id.obudu);
        tinapa = (TextView) rootView.findViewById(R.id.tvTLR);
        cross = (TextView) rootView.findViewById(R.id.tvCRNP);
        yankari = (TextView) rootView.findViewById(R.id.tvYGR);
        ogbunike = (TextView) rootView.findViewById(R.id.tvOC);
        olumo = (TextView) rootView.findViewById(R.id.tvOR);

//        setting textviews to typefaces
        Typeface weblysleek = Typeface.createFromAsset(getActivity().getAssets(), "fonts/webly.ttf");
        Typeface augsans = Typeface.createFromAsset(getActivity().getAssets(), "fonts/augustsans.ttf");
        obudu.setTypeface(augsans);
        tinapa.setTypeface(augsans);
        cross.setTypeface(augsans);
        yankari.setTypeface(augsans);
        ogbunike.setTypeface(augsans);
        olumo.setTypeface(augsans);

        obuduIm = (ImageView) rootView.findViewById(R.id.ivobudu);
        tinapaIm = (ImageView) rootView.findViewById(R.id.ivTinapa);
        crossIm = (ImageView) rootView.findViewById(R.id.ivcross);
        yankariIm = (ImageView) rootView.findViewById(R.id.ivYankari);
        OgbunikeIm = (ImageView) rootView.findViewById(R.id.ivogbunike);
        OlumoIm = (ImageView) rootView.findViewById(R.id.ivOlumo);

        obuduIm.setOnClickListener(this);
        tinapaIm.setOnClickListener(this);
        crossIm.setOnClickListener(this);
        yankariIm.setOnClickListener(this);
        OgbunikeIm.setOnClickListener(this);
        OlumoIm.setOnClickListener(this);



        return rootView;
    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(v.getContext(), Test.class);
        Bundle basket = new Bundle();
        String place, info;
        int img1, img2, img3;


        switch (v.getId()){
            case R.id.ivobudu:
                img1 = obuduImgs[1];
                img2 = obuduImgs[0];
                basket.putInt("img1", img1);
                basket.putInt("img2", img2);
                place = obudu.getText().toString();
                basket.putString("header", place);
                info = details[1];
                basket.putString("text", info);
                i.putExtras(basket);
                startActivity(i);

                break;
            case R.id.ivTinapa:
                img1 = tinapaImgs[1];
                img2 = tinapaImgs[0];
                basket.putInt("img1", img1);
                basket.putInt("img2", img2);
                place = tinapa.getText().toString();
                basket.putString("header", place);
                info = details[1];
                basket.putString("text", info);
                i.putExtras(basket);
                startActivity(i);

                break;

            case R.id.ivYankari:
                img1 = yankariImgs[1];
                img2 = yankariImgs[0];
                basket.putInt("img1", img1);
                basket.putInt("img2", img2);
                place = yankari.getText().toString();
                basket.putString("header", place);
                info = details[3];
                basket.putString("text", info);
                i.putExtras(basket);
                startActivity(i);

                break;

            case R.id.ivcross:
                img1 = crossImgss[1];
                img2 = crossImgss[0];
                basket.putInt("img1", img1);
                basket.putInt("img2", img2);
                place = cross.getText().toString();
                basket.putString("header", place);
                info = details[2];
                basket.putString("text", info);
                i.putExtras(basket);
                startActivity(i);

                break;

            case R.id.ivogbunike:
                img1 = OgbunikeImgs[1];
                img2 = OgbunikeImgs[2];
                basket.putInt("img1", img1);
                basket.putInt("img2", img2);
                place = ogbunike.getText().toString();
                basket.putString("header", place);
                info = details[4];
                basket.putString("text", info);
                i.putExtras(basket);
                startActivity(i);

                break;

            case R.id.ivOlumo:
                img1 = olumoImgs[1];
                img2 = olumoImgs[0];
                basket.putInt("img1", img1);
                basket.putInt("img2", img2);
                place = olumo.getText().toString();
                basket.putString("header", place);
                info = details[5];
                basket.putString("text", info);
                i.putExtras(basket);
                startActivity(i);


                break;
        }



    }
}
