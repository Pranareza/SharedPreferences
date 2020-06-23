package com.apps.andhikaapps.Menu.ui.gallery;

import com.apps.andhikaapps.Model.ModelGallery;

import java.util.ArrayList;

public class GalleryData {

    /*private static final String nama_image[] = {
            "Merkurius",
            "Venus"
    };*/

    private static final String url_image[] = {
            "https://i.pinimg.com/564x/df/9e/19/df9e197a5e4cf9dd67111d87253f29f2.jpg",
            "https://i.pinimg.com/564x/cd/2c/4e/cd2c4e9aadcf1924d5d219f25a8b371c.jpg",
            "https://i.pinimg.com/564x/9d/44/d3/9d44d3950a253bd31a1bec6bf1499ee5.jpg",
            "https://i.pinimg.com/564x/8b/5a/8e/8b5a8e277742718eb028fdb359da9460.jpg",
            "https://i.pinimg.com/564x/20/ce/c4/20cec4826b1ce71fb14bf7cdc5d6b6e3.jpg",
            "https://i.pinimg.com/564x/c3/31/20/c33120d12fee573f0447283b9ff29088.jpg",
            "https://i.pinimg.com/564x/9f/ee/e5/9feee5a53f4422723dfc2f82f44d04ed.jpg",
            "https://i.pinimg.com/564x/16/44/91/164491e8bd8fd08fe6fe1497cd35e54d.jpg"
    };

    public static ArrayList<ModelGallery> prepareData(){
        ArrayList<ModelGallery> ArrayData = new ArrayList<>();
        for (int i=0; i<url_image.length; i++){
            ModelGallery modelGallery = new ModelGallery();
            //gallery.setNama_image(nama_image[i]);
            modelGallery.setUrl_image(url_image[i]);
            ArrayData.add(modelGallery);
        }
        return ArrayData;
    }
}
