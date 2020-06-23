package com.apps.andhikaapps.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.andhikaapps.Model.ModelGallery;
import com.apps.andhikaapps.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {
    private ArrayList<ModelGallery> listModelGallery;
    private Context context;

    public GalleryAdapter(Context context, ArrayList<ModelGallery> listModelGallery){
        this.context = context;
        this.listModelGallery = listModelGallery;
    }

    @NonNull
    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_grid_gallery, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.nama_image.setText(listGallery.get(position).getNama_image());
        Picasso.with(context).load(listModelGallery.get(position).getUrl_image()).resize(250, 270).into(holder.url_image);
    }

    @Override
    public int getItemCount() {
        return listModelGallery.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView url_image;
        public TextView nama_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //nama_image = itemView.findViewById(R.id.nm_image);
            url_image = itemView.findViewById(R.id.img_gallery);
        }
    }
}
