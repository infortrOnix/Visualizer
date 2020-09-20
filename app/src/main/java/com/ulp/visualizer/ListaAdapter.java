package com.ulp.visualizer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListaAdapter  extends ArrayAdapter<Agencia> {

    private Context context;
    private List<Agencia>lista;
    private LayoutInflater li;

    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Agencia> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context=context;
        this.lista=objects;
        this.li=li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView= convertView;
        if (itemView==null){
            itemView=li.inflate(R.layout.item,parent,false);

        }
        Agencia agencia=lista.get(position);
        ImageView foto=itemView.findViewById(R.id.ivFoto);
        foto.setImageResource(agencia.getFoto());

        TextView marca=itemView.findViewById(R.id.tvMarca);
        marca.setText(agencia.getMarca());

        TextView modelo=itemView.findViewById(R.id.tvModelo);
        modelo.setText(agencia.getModelo());

        TextView precio=itemView.findViewById(R.id.tvPrecio);
        precio.setText(agencia.getPrecio()+"");

        return itemView;

    }
}
