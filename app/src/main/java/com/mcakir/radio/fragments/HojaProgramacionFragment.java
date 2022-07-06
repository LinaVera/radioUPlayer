package com.mcakir.radio.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mcakir.radio.R;

public class HojaProgramacionFragment extends Fragment {
    View vista;
    TabLayout tabs_dias;
//    dias fragment

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_hoja_programacion, container, false);

        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.dias, new LunesFragment());
        transaction.addToBackStack(null);
        transaction.commit();

        tabs_dias = vista.findViewById(R.id.tabs_dias);
         tabs_dias.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment
                        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.dias, new LunesFragment());
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 1:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment
                        transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.dias, new MartesFragment());
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 2:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment
                        transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.dias, new DiasFragment());
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 3:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment

                        break;
                    case 4:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment

                        break;
                    case 5:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment

                        break;
                    case 6:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment

                        break;
                    case 7:
                        //necesito saber crear el horario con los cards y despues remplazar el Fragment

                        break;
                }
            }
           @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return  vista;
    }
}