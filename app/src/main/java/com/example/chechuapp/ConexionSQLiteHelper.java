package com.example.chechuapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    final String CREAR_TABLA_USUARIO="CREATE TABLE usuarios (id INTEGER, nombre TEXT, telefono TEXT)";

    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version); //Contexto app, nombre BD, null y version de BD
    }

    @Override
    public void onCreate(SQLiteDatabase db) {   //Crea BD
        db.execSQL(CREAR_TABLA_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {   //Actualiza BD
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        onCreate(db);
    }
}
