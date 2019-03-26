package com.example.luisfernandomedinallorenti.ejsqlite.Datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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
    public Usuario getUsuario(String correo){
        Usuario usuario=new Usuario();
        String[] whereArgs=new String[]{correo};
        Cursor cursor=sqLiteDatabase.query(
                SQLConstantes.TABLE_USUARIO,
                SQLConstantes.ALL_COLUMNS,
                SQLConstantes.SEARCH_BY_CORREO,
                whereArgs,
                null,null,null);
//        if(cursor.getCount()==1)
//            cursor.moveToFirst();
        while (cursor.moveToNext()){
            usuario.setId(cursor.getInt(cursor.getColumnIndex(SQLConstantes.COLUMN_ID)));
            usuario.setCorreo(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMN_CORREO)));
        }
        return usuario;
    }
    public Usuario getUsuarioID(String id){
        Usuario usuario=new Usuario();
        String[] whereArgs=new String[]{id};
        Cursor cursor=sqLiteDatabase.query(
                SQLConstantes.TABLE_USUARIO,
                SQLConstantes.ALL_COLUMNS,
                SQLConstantes.WHERE_ID_CLAUSE,
                whereArgs,
                null,null,null
        );
        while (cursor.moveToNext()){
            usuario.setId(cursor.getInt(cursor.getColumnIndex(SQLConstantes.COLUMN_ID)));
            usuario.setCorreo(cursor.getString(cursor.getColumnIndex(SQLConstantes.COLUMN_CORREO)));
        }
        return usuario;
    }
    public void deleteUser(String id){
        String[]whereArgs=new String[]{String.valueOf(id)};
        sqLiteDatabase.delete(SQLConstantes.TABLE_USUARIO,
                SQLConstantes.WHERE_ID_CLAUSE,
                whereArgs);
    }
    public void updateUser(String id,ContentValues contentValues){
        String[]whereArgs=new String[]{String.valueOf(id)};
        sqLiteDatabase.update(
                SQLConstantes.TABLE_USUARIO,
                contentValues,
                SQLConstantes.WHERE_ID_CLAUSE,
                whereArgs);
    }
}
