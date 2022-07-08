package com.curso.mipc.listaProcesador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.mipc.Modelos.Placa;
import com.curso.mipc.Modelos.Procesador;
import com.curso.mipc.R;
import com.curso.mipc.listaPlaca.placaRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class InicioProcesadorFragment extends Fragment {
    RecyclerView recyclerView;
    procesadorRecyclerViewAdapter adapter;
    List<Procesador> lista_itemsProcesador =new ArrayList<Procesador>();

    public InicioProcesadorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //COMO SE INFLA LA VISTA
        View view = inflater.inflate(R.layout.fragment_inicio_procesador, container, false);

        recyclerView = view.findViewById(R.id.listaProcesador); //varia segun el id de la lista
        //se debe dar el linear

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//PARA DAR LA VISTA AL RECYCLEview
        //aqui dandole la lista llenada
        llenadoLista();
        //________________________
        adapter = new procesadorRecyclerViewAdapter(lista_itemsProcesador);

//antes de dar la lista al recyclearView y el adaptador es recomendable llenar la lista.-> llamando una funcion PARA EL LLENADO
        recyclerView.setAdapter(adapter);

        return view;
    }


    public void llenadoLista(){

        lista_itemsProcesador.add(new Procesador("Procesador 1",R.drawable.oferta4,"PL01","380$"));
        lista_itemsProcesador.add(new Procesador("Procesador 2",R.drawable.oferta5,"PL2","370$"));
        lista_itemsProcesador.add(new Procesador("Procesador 3",R.drawable.oferta4,"hola3","290$"));


    }
}