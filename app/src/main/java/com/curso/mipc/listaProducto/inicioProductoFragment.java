package com.curso.mipc.listaProducto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.mipc.Modelos.Producto;
import com.curso.mipc.R;

import java.util.ArrayList;
import java.util.List;


public class inicioProductoFragment extends Fragment {

  RecyclerView recyclerView;
  productoRecyclerViewAdapter adapter;
  List<Producto> lista_itemsProducto =new ArrayList<>();

    public inicioProductoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //COMO SE INFLA LA VISTA
        View view = inflater.inflate(R.layout.fragment_inicio_producto, container, false);

        recyclerView = view.findViewById(R.id.listaDisco); //varia segun el id de la lista
        //se debe dar el linear

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//PARA DAR LA VISTA AL RECYCLEview
        //aqui dandole la lista llenada
        llenadoLista();
        //________________________
        adapter = new productoRecyclerViewAdapter(lista_itemsProducto);

//antes de dar la lista al recyclearView y el adaptador es recomendable llenar la lista.-> llamando una funcion PARA EL LLENADO
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void llenadoLista(){
        lista_itemsProducto.add(new Producto("AMZ Ryzen 5",R.drawable.oferta1,4));//poner la f
        lista_itemsProducto.add(new Producto("Seagate 1 TB",R.drawable.oferta2,3));
        lista_itemsProducto.add(new Producto("Asus 500GB",R.drawable.oferta3,3));
        lista_itemsProducto.add(new Producto("Gabinete",R.drawable.oferta4,4));
        lista_itemsProducto.add(new Producto("Asus TUF Gaming F15",R.drawable.oferta5,5));
        lista_itemsProducto.add(new Producto("AMZ Ryzen 7",R.drawable.oferta6,5));
        lista_itemsProducto.add(new Producto("Kingston A2000, 250 GB",R.drawable.oferta7,2));


    }


}