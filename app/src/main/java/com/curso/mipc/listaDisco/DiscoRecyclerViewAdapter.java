package com.curso.mipc.listaDisco;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import com.curso.mipc.Modelos.Disco;
import com.curso.mipc.databinding.FragmentDiscoBinding;
import com.curso.mipc.listaDisco.placeholder.PlaceholderContent.PlaceholderItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class DiscoRecyclerViewAdapter extends RecyclerView.Adapter<DiscoRecyclerViewAdapter.ViewHolder> {

    private final List<Disco> mValues;

    public DiscoRecyclerViewAdapter(List<Disco> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentDiscoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.nombreD.setText(holder.mItem.nombreDisco);
        holder.ImagenD.setImageResource(holder.mItem.imagenDisco);
        holder.descripcionD.setText(holder.mItem.inforDisco);
        holder.inforPrecioD.setText(holder.mItem.inforPrecioDisco);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //public final TextView mContentView;
        public Disco mItem;

        public final TextView nombreD;
        public final ImageView ImagenD;
        public final TextView descripcionD;
        public final  TextView inforPrecioD;


        public ViewHolder(FragmentDiscoBinding binding) {
            super(binding.getRoot());

            //mContentView = binding.content;
            nombreD= binding.nombreDisco;
            ImagenD=binding.imagenDisco;
            descripcionD= binding.inforDisco;
            inforPrecioD=binding.inforPrecioDisco;
        }


}
}