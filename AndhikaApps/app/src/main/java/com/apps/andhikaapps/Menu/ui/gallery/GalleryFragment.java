package com.apps.andhikaapps.Menu.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.andhikaapps.Adapter.GalleryAdapter;
import com.apps.andhikaapps.Model.ModelGallery;
import com.apps.andhikaapps.R;

import java.util.ArrayList;

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    09 may 2020
 */
public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_menu_gallery, container, false);

        final RecyclerView recyclerView = root.findViewById(R.id.recycler_view_gallery);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ModelGallery> arrayImage = GalleryData.prepareData();
        GalleryAdapter adapter = new GalleryAdapter(getActivity().getApplicationContext(),arrayImage);
        recyclerView.setAdapter(adapter);
        return root;
    }
}
