package com.example.luisfernandomedinallorenti.ejsqlite.Activities;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.luisfernandomedinallorenti.ejsqlite.Datos.Data;
import com.example.luisfernandomedinallorenti.ejsqlite.Datos.SQLConstantes;
import com.example.luisfernandomedinallorenti.ejsqlite.POJOs.Usuario;
import com.example.luisfernandomedinallorenti.ejsqlite.R;

public class ActualizarActivity extends AppCompatActivity {
    EditText idUpdate,correo;
    Button search,update;
    Data data;
    Usuario usuario=new Usuario();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar);
        idUpdate=(EditText)findViewById(R.id.editID);
        correo=(EditText)findViewById(R.id.editCorreo);


        search=(Button)findViewById(R.id.btnBuscar);
        update=(Button)findViewById(R.id.btnActualizar);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idSearch=idUpdate.getText().toString();
                ContentValues contentValues=new ContentValues(2);
                contentValues.put(SQLConstantes.COLUMN_CORREO,
                        correo.getText().toString());
                data.updateUser(idSearch,contentValues);

                Toast.makeText(getApplicationContext(),"Se actualizo correctamente",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
