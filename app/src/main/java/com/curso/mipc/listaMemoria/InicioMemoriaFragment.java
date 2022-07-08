package com.curso.mipc.listaMemoria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.mipc.Modelos.Laptop;
import com.curso.mipc.Modelos.Memoria;
import com.curso.mipc.R;
import com.curso.mipc.listaLap.LapRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class InicioMemoriaFragment extends Fragment {
    RecyclerView recyclerView;
    MemoriaRecyclerViewAdapter adapter;
    List<Memoria> lista_itemsMemo =new ArrayList<Memoria>();

    public InicioMemoriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //COMO SE INFLA LA VISTA
        View view = inflater.inflate(R.layout.fragment_memoria_list, container, false);

        recyclerView = view.findViewById(R.id.listaMemoria); //varia segun el id de la lista
        //se debe dar el linear

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//PARA DAR LA VISTA AL RECYCLEview
        //aqui dandole la lista llenada
        llenadoLista();
        //________________________
        adapter = new MemoriaRecyclerViewAdapter(lista_itemsMemo);

//antes de dar la lista al recyclearView y el adaptador es recomendable llenar la lista.-> llamando una funcion PARA EL LLENADO
        recyclerView.setAdapter(adapter);

        return view;
    }


    public void llenadoLista(){

        lista_itemsMemo.add(new Memoria("Memoria 1",R.drawable.oferta4,"memo01","150$"));
        lista_itemsMemo.add(new Memoria("Memoria 2",R.drawable.oferta5,"hola2","300$"));
        lista_itemsMemo.add(new Memoria("Memoria 3",R.drawable.oferta4,"hola3","200$"));


    }
}