package com.mcakir.radio.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcakir.radio.R;
import com.mcakir.radio.entity.Equipo;

import java.util.ArrayList;

public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.ViewHolder> {

    private String[] localDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre;
        private TextView cargo;
        private ImageView imagen;
        private TextView id;


        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

           /* nombre = (TextView) view.findViewById(R.id.equipo_nombre);
            cargo = (TextView) view.findViewById(R.id.equipo_cargo);
            imagen = (ImageView) view.findViewById(R.id.equipo_imagen);
            id = (TextView) view.findViewById(R.id.equipo_id);*/
        }

        public TextView getNombre() {
            return nombre;
        }
        public TextView getCargo() {
            return cargo;
        }
        public ImageView getImagen() {
            return imagen;
        }
        public TextView getId() {
            return id;
        }
    }


  /*  public CustomAdapter(String[] dataSet) {
        localDataSet = dataSet;
    }*/

    // Create new views (invoked by the layout manager)
   /* @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
       *//* View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);
*//*
        return new ViewHolder(view);
    }*/


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
//        viewHolder.getTextView().setText(localDataSet[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}


