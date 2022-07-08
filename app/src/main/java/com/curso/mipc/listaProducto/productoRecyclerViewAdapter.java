package com.curso.mipc.listaProducto;

import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.curso.mipc.Modelos.Producto;
import com.curso.mipc.R;
import com.curso.mipc.databinding.FragmentProductoBinding;
import com.curso.mipc.listaProducto.placeholder.PlaceholderContent.PlaceholderItem;


import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class productoRecyclerViewAdapter extends RecyclerView.Adapter<productoRecyclerViewAdapter.ViewHolder> {

    private final List<Producto> mValues;

    public productoRecyclerViewAdapter(List<Producto> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentProductoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.Titulo.setText(holder.mItem.nombreProducto);
        holder.Imagen.setImageResource(holder.mItem.imagenProducto);
        holder.numeroEstrella.setRating(holder.mItem.numeroEstrella);

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView mContentView;
        public Producto mItem;

        public final TextView Titulo;
        public final ImageView Imagen;
        public final RatingBar numeroEstrella;


        public ViewHolder(FragmentProductoBinding binding) {
            super(binding.getRoot());

            mContentView = binding.content;
            Titulo= binding.Titulo;
            Imagen=binding.imagenPrincipal;
            numeroEstrella= binding.ratingOficial;

        }

  //      @Override
  //     public String toString() {
  //        return super.toString() + " '" + mContentView.getText() + "'";
  //    }
    }
}