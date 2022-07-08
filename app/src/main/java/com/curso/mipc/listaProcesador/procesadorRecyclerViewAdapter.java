package com.curso.mipc.listaProcesador;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.curso.mipc.Modelos.Procesador;
import com.curso.mipc.databinding.FragmentProcesadorBinding;
import com.curso.mipc.listaProcesador.placeholder.PlaceholderContent.PlaceholderItem;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class procesadorRecyclerViewAdapter extends RecyclerView.Adapter<procesadorRecyclerViewAdapter.ViewHolder> {

    private final List<Procesador> mValues;

    public procesadorRecyclerViewAdapter(List<Procesador> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentProcesadorBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.nombrePr.setText(holder.mItem.nombreProcesador);
        holder.ImagenPr.setImageResource(holder.mItem.imagenProcesador);
        holder.descripcionPr.setText(holder.mItem.inforProcesador);
        holder.precioPr.setText(holder.mItem.precioProcesador);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //public final TextView mContentView;
        public Procesador mItem;

        public final TextView nombrePr;
        public final ImageView ImagenPr;
        public final TextView descripcionPr;
        public final TextView precioPr;

        public ViewHolder(FragmentProcesadorBinding binding) {
            super(binding.getRoot());
            nombrePr= binding.nombreProcesador;
            ImagenPr=binding.imagenProcesador;
            descripcionPr= binding.inforProcesador;
            precioPr= binding.inforPrecioProcesador;
        }
}
}