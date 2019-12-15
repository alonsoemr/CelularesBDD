package com.example.celulares;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.celulares.modelo.Celular;

public class CategoriasActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Recuperamos el ListView
        ListView listaSamsungs= getListView();

        //Creamos un ArrayAdapter para asociarlo con el arreglo
        ArrayAdapter<Celular> listaAdapter= new ArrayAdapter<Celular>(
                this,
                android.R.layout.simple_list_item_1,
                Celular.celulares);
        //Asociamos el ArrayAdapter al ListView
        listaSamsungs.setAdapter(listaAdapter);
    }




    @Override
    public void onListItemClick(ListView listView, View view,
                                int posicion, long id)
    {
        Intent intent=new Intent(CategoriasActivity.this,
                CelularesActivity.class);
        intent.putExtra("celularNro",(int)id);
        startActivity(intent);
    }



}


