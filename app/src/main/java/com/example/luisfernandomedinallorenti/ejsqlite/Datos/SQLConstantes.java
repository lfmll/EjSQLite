package com.example.luisfernandomedinallorenti.ejsqlite.Datos;

public class SQLConstantes {
    public static final String DB_NAME="bdusuario.db";

    public static final String TABLE_USUARIO="usuarios";

    public static final String COLUMN_ID="id";
    public static final String COLUMN_CORREO="correo";
    public static final String COLUMN_PASS="pass";
    public static final String SQL_CREATE_TABLE_USUARIOS=
            "CREATE TABLE "+ TABLE_USUARIO + "("+
            COLUMN_ID+" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "+
            COLUMN_CORREO+ " TEXT NOT NULL," +
            COLUMN_PASS+ " TEXT NOT NULL );";
    public static final String SQL_DELETE="DROP TABLE "+TABLE_USUARIO;
}
