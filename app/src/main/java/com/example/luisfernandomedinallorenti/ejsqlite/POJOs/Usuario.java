package com.example.luisfernandomedinallorenti.ejsqlite.POJOs;

import android.content.ContentValues;

import com.example.luisfernandomedinallorenti.ejsqlite.Datos.SQLConstantes;

public class Usuario {
    private Integer id;
    private String correo;
    private String pass;

    //Constructor
    public Usuario(){

    }

    public Usuario(String correo, String pass) {
        this.correo = correo;
        this.pass = pass;
    }

    //Getter y Select
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    //Contenedor
    public ContentValues toValues(){
        ContentValues contentValues=new ContentValues(2);
        contentValues.put(SQLConstantes.COLUMN_CORREO,correo);
        contentValues.put(SQLConstantes.COLUMN_PASS,pass);
        return contentValues;
    }
}
