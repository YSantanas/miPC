package com.curso.mipc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;


public class PrincipalFragment extends Fragment {

    ImageButton btnDisco1,btnGabinetes1,btnPlaca1,btnProce1,btnLap1,btnRam1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_principal, container, false);
        btnDisco1 = view.findViewById(R.id.btnDisco1);
        btnGabinetes1 = view.findViewById(R.id.btnGabinetes1);
        btnPlaca1 = view.findViewById(R.id.btnPlaca1);
        btnProce1 = view.findViewById(R.id.btnProce1);
        btnLap1 = view.findViewById(R.id.btnLap1);
        btnRam1 = view.findViewById(R.id.btnRam1);

        //------------------- Boton 1 -----------------------------

        btnDisco1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//variableCreada= id.getText().toString();

                //de un fragmento a una actividad
                Herramientas.nextActivity(DiscoActivity.class, getContext());
                //
                //de un fragmento a otro fragmento
                //Intent intent = new Intent(getActivity(), DiscoActivity.class);
                //startActivity(intent);

                //FragmentManager manager = getChildFragmentManager();
                //manager.beginTransaction().replace(R.id.listaProducto, new inicioProductoFragment()).commit();

                /*
                FirstFragment manager = new FirstFragment();

                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();


                transaction.replace(R.id.primeros, manager);

                transaction.commit();
*/
            }
        });

        //------------------- Boton 2 -----------------------------

        btnGabinetes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Herramientas.nextActivity(GabineteActivity.class, getContext());

            }
        });

        //------------------- Boton 3 -----------------------------

        btnLap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Herramientas.nextActivity(LaptopActivity.class, getContext());

            }
        });

        //------------------- Boton 4 -----------------------------

        btnRam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Herramientas.nextActivity(MemoriaActivity.class, getContext());

            }
        });

        //------------------- Boton 5 -----------------------------

        btnPlaca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Herramientas.nextActivity(PlacaActivity.class, getContext());

            }
        });

        //------------------- Boton 6 -----------------------------

        btnProce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Herramientas.nextActivity(ProcesadorActivity.class, getContext());

            }
        });



        return view;
    }
}