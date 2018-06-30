package com.example.luisfernandomedinallorenti.ejsqlite.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.luisfernandomedinallorenti.ejsqlite.Datos.Data;
import com.example.luisfernandomedinallorenti.ejsqlite.POJOs.Usuario;
import com.example.luisfernandomedinallorenti.ejsqlite.R;

public class BuscarActivity extends AppCompatActivity {
    EditText editCorreo;
    Button btnBuscar;
    Data data;
    Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        usuario=new Usuario();
        editCorreo=(EditText)findViewById(R.id.editCorreo);
        btnBuscar=(Button) findViewById(R.id.btnBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correoBuscar=editCorreo.getText().toString();
                data=new Data(getApplicationContext());
                data.open();
                usuario=data.getUsuario(correoBuscar);

            }
        });

    }
}
