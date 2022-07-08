package com.curso.mipc.listaGabinete;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.curso.mipc.Modelos.Disco;
import com.curso.mipc.Modelos.Gabinete;
import com.curso.mipc.databinding.FragmentGabineteBinding;
import com.curso.mipc.listaGabinete.placeholder.PlaceholderContent.PlaceholderItem;


import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class GabineteRecyclerViewAdapter extends RecyclerView.Adapter<GabineteRecyclerViewAdapter.ViewHolder> {

    private final List<Gabinete> mValues;

    public GabineteRecyclerViewAdapter(List<Gabinete> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentGabineteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.nombreG.setText(holder.mItem.nombreGabi);
        holder.ImagenG.setImageResource(holder.mItem.imagenGabi);
        holder.descripcionG.setText(holder.mItem.inforGabi);
        holder.precioG.setText(holder.mItem.precioGabi);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //public final TextView mContentView;
        public Gabinete mItem;

        public final TextView nombreG;
        public final ImageView ImagenG;
        public final TextView descripcionG;
        public final TextView precioG;

        public ViewHolder(FragmentGabineteBinding binding) {
            super(binding.getRoot());
            //mContentView = binding.content;
            nombreG= binding.nombreGabi;
            ImagenG=binding.imagenGabi;
            descripcionG= binding.inforGabi;
            precioG= binding.inforPrecioGabinete;
        }

          }
}