package com.mcakir.radio.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.JsonReader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mcakir.radio.R;
import com.mcakir.radio.controller.EquipoAdapter;
import com.mcakir.radio.entity.Equipo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EquipoFragment extends Fragment {
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_equipo, container, false);
/*//Crear la vista
        LinearLayout team_1 =(LinearLayout) vista.findViewById(R.id.lay_team_1);
        LinearLayout team_2 =(LinearLayout) vista.findViewById(R.id.lay_team_2);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );


//Parse JSON
        String jsonFileContent = null;
        try {
            jsonFileContent = EquipoAdapter.leerJson(container.getContext(), ".raw.equipo.json");
            JSONArray jsonArray = new JSONArray(jsonFileContent);

            for(int i = 0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String nombre = jsonObject.getString("nombre");
                String cargo = jsonObject.getString("cargo");
                String imagen = jsonObject.getString("imagen");

                //Creamos ImagenView y TextView
                ImageView img_team = new ImageView(container.getContext());
                TextView txt_nom_team = new TextView(container.getContext());
                txt_nom_team.setLayoutParams(lp);
                txt_nom_team.setText(nombre);

                TextView txt_cargo_team = new TextView(container.getContext());
                txt_cargo_team.setLayoutParams(lp);
                txt_cargo_team.setText(cargo);

                team_1.addView(txt_cargo_team);
                team_1.addView(txt_nom_team);
                Log.d("nom", nombre);


            }

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }*/

        return vista;
    }
    /*public List<Equipo> readJsonStream(InputStream in) throws IOException {
        // Nueva instancia JsonReader
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            // Leer Array
            return leerArrayEquipo(reader);
        } finally {
            reader.close();
        }

    }
    public List leerArrayEquipo(JsonReader reader) throws IOException {
        // Lista temporal
        ArrayList animales = new ArrayList();

        reader.beginArray();
        while (reader.hasNext()) {
            // Leer objeto
            animales.add(leerEquipo(reader));
        }
        reader.endArray();
        return animales;
    }

    public Equipo leerEquipo(JsonReader reader) throws IOException {
        String nombre = null;
        String cargo = null;
        String imagen = null;

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            switch (name) {
                case "nombre":
                    nombre = reader.nextString();
                    break;
                case "cargo":
                    cargo = reader.nextString();
                    break;
                case "imagen":
                    imagen = reader.nextString();
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }
        reader.endObject();
        return new Equipo(nombre, cargo, imagen);
    }*/
}