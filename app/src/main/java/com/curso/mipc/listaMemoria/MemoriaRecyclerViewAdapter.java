package com.curso.mipc.listaMemoria;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.curso.mipc.Modelos.Memoria;
import com.curso.mipc.databinding.FragmentMemoriaBinding;
import com.curso.mipc.listaMemoria.placeholder.PlaceholderContent.PlaceholderItem;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MemoriaRecyclerViewAdapter extends RecyclerView.Adapter<MemoriaRecyclerViewAdapter.ViewHolder> {

    private final List<Memoria> mValues;

    public MemoriaRecyclerViewAdapter(List<Memoria> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentMemoriaBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.nombreM.setText(holder.mItem.nombreMemo);
        holder.ImagenM.setImageResource(holder.mItem.imagenMemo);
        holder.descripcionM.setText(holder.mItem.inforMemo);
        holder.precioM.setText(holder.mItem.precioMemo);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //public final TextView mContentView;
        public Memoria mItem;

        public final TextView nombreM;
        public final ImageView ImagenM;
        public final TextView descripcionM;
        public final TextView precioM;

        public ViewHolder(FragmentMemoriaBinding binding) {
            super(binding.getRoot());
            nombreM= binding.nombreMemoria;
            ImagenM=binding.imagenMemoria;
            descripcionM= binding.inforMemoria;
            precioM= binding.inforPrecioMemoria;
        }

}
}