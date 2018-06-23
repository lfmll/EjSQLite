package com.example.luisfernandomedinallorenti.ejsqlite.Datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.luisfernandomedinallorenti.ejsqlite.POJOs.Usuario;

public class Data {
    private Context context;
    private SQLiteDatabase sqLiteDatabase;
    private SQLiteOpenHelper sqLiteOpenHelper;

    public Data(Context context){
        this.context=context;
        sqLiteOpenHelper= new SQLiteHelper(context);
        sqLiteDatabase=sqLiteOpenHelper.getWritableDatabase();
    }
    public void open(){
        sqLiteDatabase=sqLiteOpenHelper.getWritableDatabase();
    }
    public void close(){
        sqLiteOpenHelper.close();
    }
    public void insertUsuario(Usuario usuario){
        ContentValues values=usuario.toValues();
        sqLiteDatabase.insert(SQLConstantes.TABLE_USUARIO,null,values);
    }
}
