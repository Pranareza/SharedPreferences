package com.apps.andhikaapps.TabLayout.Interest;

import com.apps.andhikaapps.Model.ModelInterest;
import com.apps.andhikaapps.R;

import java.util.ArrayList;

public class InterestData {

    private static final String nama_hobby[] = {
            "Membaca Komik",
            "Menonton Film"
    };

    private static final int[] img_hobby = {
            R.drawable.ic_comic,
            R.drawable.ic_movie
    };

    public static ArrayList<ModelInterest> prepareData(){
        ArrayList<ModelInterest> ArrayData = new ArrayList<>();
        for (int i=0; i<nama_hobby.length; i++){
            ModelInterest modelInterest = new ModelInterest();
            modelInterest.setNama_hobby(nama_hobby[i]);
            modelInterest.setImage_hobby(img_hobby[i]);
            ArrayData.add(modelInterest);
        }
        return ArrayData;
    }
}
