package com.example.luisfernandomedinallorenti.ejsqlite.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luisfernandomedinallorenti.ejsqlite.R;

public class MainActivity extends AppCompatActivity {
    Button btnInsert,btnSearch,btnDelete,btnUdapte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsert=(Button)findViewById(R.id.btnInsertar);
        btnSearch=(Button)findViewById(R.id.btnBuscar);
        btnDelete=(Button)findViewById(R.id.btnEliminar);
        btnUdapte=(Button)findViewById(R.id.btnActualizar);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,InsertarActivity.class);
                startActivity(intent);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BuscarActivity.class);
                startActivity(intent);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EliminarActivity.class);
                startActivity(intent);
            }
        });
        btnUdapte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ActualizarActivity.class);
                startActivity(intent);
            }
        });
    }
}
