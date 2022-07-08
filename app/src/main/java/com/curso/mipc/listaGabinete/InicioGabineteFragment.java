package com.curso.mipc.listaGabinete;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.mipc.Modelos.Disco;
import com.curso.mipc.R;

import com.curso.mipc.Modelos.Gabinete;
import com.curso.mipc.R;
import com.curso.mipc.listaDisco.DiscoRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class InicioGabineteFragment extends Fragment {


    RecyclerView recyclerView;
    GabineteRecyclerViewAdapter adapter;
    List<Gabinete> lista_itemsGabi =new ArrayList<Gabinete>();

    public InicioGabineteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //COMO SE INFLA LA VISTA
        View view = inflater.inflate(R.layout.fragment_inicio_gabinete, container, false);

        recyclerView = view.findViewById(R.id.listaGabinete); //varia segun el id de la lista
        //se debe dar el linear

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//PARA DAR LA VISTA AL RECYCLEview
        //aqui dandole la lista llenada
        llenadoLista();
        //________________________
        adapter = new GabineteRecyclerViewAdapter(lista_itemsGabi);

//antes de dar la lista al recyclearView y el adaptador es recomendable llenar la lista.-> llamando una funcion PARA EL LLENADO
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void llenadoLista(){

        lista_itemsGabi.add(new Gabinete("Seagate 1 TB",R.drawable.oferta2,"hola","100$"));
        lista_itemsGabi.add(new Gabinete("GABI GABI",R.drawable.oferta1,"hola2","300$"));
        lista_itemsGabi.add(new Gabinete("CARCASA",R.drawable.oferta4,"hola3","200$"));



    }

}