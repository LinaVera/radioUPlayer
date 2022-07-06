package com.mcakir.radio.controller;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mcakir.radio.R;
import com.mcakir.radio.entity.Equipo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class EquipoAdapter {

    public static String leerJson(Context  context, String filename) throws IOException{
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(context.getAssets().open(filename), "UTF-8"));
        String content = "";
        String line;
        while ((line = reader.readLine()) != null){
            content = content + line;
        }
        return content;
    }


   /* public EquipoAdapter(Context context, List objects) {
        super(context, 0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View v = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo
            v = inflater.inflate(
                    R.layout.fragment_equipo,
                    parent,
                    false);
        }
        //Obteniendo instancias de los elementos
        TextView nombreEquipo = (TextView)v.findViewById(R.id.nombre);
        TextView cargoEquipo = (TextView)v.findViewById(R.id.cargo);
        ImageView imagenEquipo = (ImageView)v.findViewById(R.id.image_prog1);


        //Obteniendo instancia de la Tarea en la posición actual
        Equipo item = (Equipo) getItem(position);

        nombreEquipo.setText(item.getNombre());
        cargoEquipo.setText(item.getCargo());
        imagenEquipo.setImageResource(convertirRutaEnId(item.getImagen()));

        //Devolver al ListView la fila creada
        return v;

    }

    private int convertirRutaEnId(String nombre){
        Context context = getContext();
        return context.getResources()
                .getIdentifier(nombre, "drawable", context.getPackageName());
    }*/
   /* private String[] localDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre;
        private TextView cargo;
        private ImageView imagen;
        private TextView id;


        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

           *//* nombre = (TextView) view.findViewById(R.id.equipo_nombre);
            cargo = (TextView) view.findViewById(R.id.equipo_cargo);
            imagen = (ImageView) view.findViewById(R.id.equipo_imagen);
            id = (TextView) view.findViewById(R.id.equipo_id);*//*
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


  *//*  public CustomAdapter(String[] dataSet) {
        localDataSet = dataSet;
    }*//*

    // Create new views (invoked by the layout manager)
   *//* @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
       *//**//* View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);
*//**//*
        return new ViewHolder(view);
    }*//*


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
    }*/
}


