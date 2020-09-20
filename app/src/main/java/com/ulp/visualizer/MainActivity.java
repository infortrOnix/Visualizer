package com.ulp.visualizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Agencia> lista=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();
        generarLista();
    }

    public void  generarLista(){
        ArrayAdapter<Agencia> adapter=new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv=findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }


    public void cargarDatos(){
        lista.add(new Agencia(R.drawable.sero,"Sero","Seroelectric",14600));
        lista.add(new Agencia(R.drawable.tito,"Tito","San Luis",10000));
        lista.add(new Agencia(R.drawable.volt,"Volt","Volt Motors",20000));

    }
}