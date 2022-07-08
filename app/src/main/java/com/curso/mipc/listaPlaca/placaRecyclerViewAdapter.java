package com.curso.mipc.listaPlaca;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.curso.mipc.Modelos.Placa;

import com.curso.mipc.databinding.FragmentPlacaBinding;
import com.curso.mipc.listaPlaca.placeholder.PlaceholderContent.PlaceholderItem;


import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class placaRecyclerViewAdapter extends RecyclerView.Adapter<placaRecyclerViewAdapter.ViewHolder> {

    private final List<Placa> mValues;

    public placaRecyclerViewAdapter(List<Placa> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentPlacaBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.nombrePL.setText(holder.mItem.nombrePlaca);
        holder.ImagenPL.setImageResource(holder.mItem.imagenPlaca);
        holder.descripcionPL.setText(holder.mItem.inforPlaca);
        holder.precioPL.setText(holder.mItem.precioPlaca);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //public final TextView mContentView;
        public Placa mItem;

        public final TextView nombrePL;
        public final ImageView ImagenPL;
        public final TextView descripcionPL;
        public final TextView precioPL;

        public ViewHolder(FragmentPlacaBinding binding) {
            super(binding.getRoot());
            nombrePL= binding.nombrePlaca;
            ImagenPL=binding.imagenPlaca;
            descripcionPL= binding.inforPlaca;
            precioPL= binding.inforPrecioPlaca;
        }

}
}