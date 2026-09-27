package com.example.nodus;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.NotaViewHolder> {

    private String[] titulos = {
            "Estudiar Álgebra",
            "Proyecto Nodus",
            "Comprar materiales",
            "Ideas para historias"
    };

    private String[] contenidos = {
            "Repasar matrices, Gauss y determinantes.",
            "Terminar RecyclerView y conectar las notas.",
            "Comprar cuaderno y lápices.",
            "Anotar nuevas ideas para las historias."
    };

    public static class NotaViewHolder extends RecyclerView.ViewHolder {

        TextView tvTituloNota;
        TextView tvContenidoNota;

        public NotaViewHolder(View itemView) {
            super(itemView);

            tvTituloNota = itemView.findViewById(R.id.tvTituloNota);
            tvContenidoNota = itemView.findViewById(R.id.tvContenidoNota);
        }
    }

    @Override
    public int getItemCount() {
        return titulos.length;
    }

    @Override
    public void onBindViewHolder(NotaViewHolder holder, int position) {
        holder.tvTituloNota.setText(titulos[position]);
        holder.tvContenidoNota.setText(contenidos[position]);
    }

    @Override
    public NotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_nota, parent, false);

        return new NotaViewHolder(view);
    }
}