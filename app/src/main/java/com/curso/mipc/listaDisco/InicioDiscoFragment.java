package com.curso.mipc.listaDisco;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.mipc.Modelos.Disco;
import com.curso.mipc.R;

import java.util.ArrayList;
import java.util.List;


public class InicioDiscoFragment extends Fragment {

    RecyclerView recyclerView;
    DiscoRecyclerViewAdapter adapter;
    List<Disco> lista_itemsDisco =new ArrayList<Disco>();

    public InicioDiscoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //COMO SE INFLA LA VISTA
        View view = inflater.inflate(R.layout.fragment_inicio_disco, container, false);

        recyclerView = view.findViewById(R.id.listaDisco); //varia segun el id de la lista
        //se debe dar el linear

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//PARA DAR LA VISTA AL RECYCLEview
        //aqui dandole la lista llenada
        llenadoLista();
        //________________________
        adapter = new DiscoRecyclerViewAdapter(lista_itemsDisco);

//antes de dar la lista al recyclearView y el adaptador es recomendable llenar la lista.-> llamando una funcion PARA EL LLENADO
        recyclerView.setAdapter(adapter);

        return view;

    }

    public void llenadoLista(){

        lista_itemsDisco.add(new Disco("Seagate 1 TB",R.drawable.oferta2,"hola","100$"));
        lista_itemsDisco.add(new Disco("Disco Duro",R.drawable.oferta1,"hola disco 2","200$"));
        lista_itemsDisco.add(new Disco("Disco Duro2",R.drawable.oferta3,"hola disco 3","250$"));


    }

}