package com.curso.mipc.listaLap;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.curso.mipc.Modelos.Laptop;
import com.curso.mipc.databinding.FragmentLapBinding;
import com.curso.mipc.listaLap.placeholder.PlaceholderContent.PlaceholderItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class LapRecyclerViewAdapter extends RecyclerView.Adapter<LapRecyclerViewAdapter.ViewHolder> {

    private final List<Laptop> mValues;

    public LapRecyclerViewAdapter(List<Laptop> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentLapBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.nombreL.setText(holder.mItem.nombreLap);
        holder.ImagenL.setImageResource(holder.mItem.imagenLap);
        holder.descripcionL.setText(holder.mItem.inforLap);
        holder.precioL.setText(holder.mItem.precioLap);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //public final TextView mContentView;
        public Laptop mItem;

        public final TextView nombreL;
        public final ImageView ImagenL;
        public final TextView descripcionL;
        public final TextView precioL;

        public ViewHolder(FragmentLapBinding binding) {
            super(binding.getRoot());
            nombreL= binding.nombreLap;
            ImagenL=binding.imagenLap;
            descripcionL= binding.inforLap;
            precioL= binding.inforPrecioLap;
        }

    }
}