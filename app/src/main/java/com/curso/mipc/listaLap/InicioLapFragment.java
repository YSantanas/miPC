package com.curso.mipc.listaLap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.mipc.Modelos.Gabinete;
import com.curso.mipc.Modelos.Laptop;
import com.curso.mipc.R;
import com.curso.mipc.listaGabinete.GabineteRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class InicioLapFragment extends Fragment {


    RecyclerView recyclerView;
    LapRecyclerViewAdapter adapter;
    List<Laptop> lista_itemsLap =new ArrayList<Laptop>();

    public InicioLapFragment() {
        // Required empty public constructor
    }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

            //COMO SE INFLA LA VISTA
            View view = inflater.inflate(R.layout.fragment_inicio_lap, container, false);

            recyclerView = view.findViewById(R.id.listaLap); //varia segun el id de la lista
            //se debe dar el linear

            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//PARA DAR LA VISTA AL RECYCLEview
            //aqui dandole la lista llenada
            llenadoLista();
            //________________________
            adapter = new LapRecyclerViewAdapter(lista_itemsLap);

//antes de dar la lista al recyclearView y el adaptador es recomendable llenar la lista.-> llamando una funcion PARA EL LLENADO
            recyclerView.setAdapter(adapter);

            return view;
        }


        public void llenadoLista(){

            lista_itemsLap.add(new Laptop("Laptop 1",R.drawable.oferta2,"hola01","100$"));
            lista_itemsLap.add(new Laptop("Laptop 2",R.drawable.oferta1,"hola2","300$"));
            lista_itemsLap.add(new Laptop("Laptop 3",R.drawable.oferta4,"hola3","200$"));


        }
}