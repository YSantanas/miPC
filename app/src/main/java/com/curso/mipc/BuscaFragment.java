package com.curso.mipc;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BuscaFragment extends Fragment {

    Button btnBusca;


    public BuscaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_busca, container, false);


        btnBusca = view.findViewById(R.id.btnBusca);


        btnBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtnBusca = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=19.367389360117336, -99.03555375372491(NicNiuh)"));
                startActivity(intentbtnBusca);
            }
        });

        return view;
    }



}