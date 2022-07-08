package com.curso.mipc.listaPlaca;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.mipc.Modelos.Memoria;
import com.curso.mipc.Modelos.Placa;
import com.curso.mipc.R;
import com.curso.mipc.listaMemoria.MemoriaRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class InicioPlacaFragment extends Fragment {
    RecyclerView recyclerView;
    placaRecyclerViewAdapter adapter;
    List<Placa> lista_itemsPlaca =new ArrayList<Placa>();

    public InicioPlacaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //COMO SE INFLA LA VISTA
        View view = inflater.inflate(R.layout.fragment_inicio_placa, container, false);

        recyclerView = view.findViewById(R.id.listaPlaca); //varia segun el id de la lista
        //se debe dar el linear

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//PARA DAR LA VISTA AL RECYCLEview
        //aqui dandole la lista llenada
        llenadoLista();
        //________________________
        adapter = new placaRecyclerViewAdapter(lista_itemsPlaca);

//antes de dar la lista al recyclearView y el adaptador es recomendable llenar la lista.-> llamando una funcion PARA EL LLENADO
        recyclerView.setAdapter(adapter);

        return view;
    }


    public void llenadoLista(){

        lista_itemsPlaca.add(new Placa("PLACA 1",R.drawable.oferta4,"PL01","180$"));
        lista_itemsPlaca.add(new Placa("PLACA 2",R.drawable.oferta5,"PL2","300$"));
        lista_itemsPlaca.add(new Placa("PLACA 3",R.drawable.oferta4,"hola3","200$"));


    }
}