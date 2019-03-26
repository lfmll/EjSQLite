package com.example.luisfernandomedinallorenti.ejsqlite.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.luisfernandomedinallorenti.ejsqlite.Datos.Data;
import com.example.luisfernandomedinallorenti.ejsqlite.R;

public class EliminarActivity extends AppCompatActivity {
    EditText idDelete;
    Button btnBorrar;
    Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);

        idDelete=(EditText)findViewById(R.id.editIDDelete);
        btnBorrar=(Button)findViewById(R.id.btnEliminar);

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=idDelete.getText().toString();
                data=new Data(getApplicationContext());
                data.deleteUser(id);
                Toast.makeText(getApplicationContext(),"El elemento ha sido eliminado",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
