package com.example.luisfernandomedinallorenti.ejsqlite.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.luisfernandomedinallorenti.ejsqlite.Datos.Data;
import com.example.luisfernandomedinallorenti.ejsqlite.POJOs.Usuario;
import com.example.luisfernandomedinallorenti.ejsqlite.R;

public class InsertarActivity extends AppCompatActivity {
    EditText correo,pass;
    Button btnRegistrar;
    Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar);

        correo=(EditText) findViewById(R.id.editCorreo);
        pass=(EditText) findViewById(R.id.editPass);
        btnRegistrar=(Button) findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario usuario=new Usuario(
                        correo.getText().toString(),
                        pass.getText().toString());
                data =new Data(getApplicationContext());
                data.open();
                data.insertUsuario(usuario);
                Toast.makeText(getApplicationContext(),"Usuario Agregado",Toast.LENGTH_LONG).show();
                data.close();
            }
        });
    }
}
