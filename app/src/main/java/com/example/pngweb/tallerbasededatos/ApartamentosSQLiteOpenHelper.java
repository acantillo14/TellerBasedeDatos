package com.example.pngweb.tallerbasededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PNGWEB on 19/05/2017.
 */

public class ApartamentosSQLiteOpenHelper extends SQLiteOpenHelper {

    private String sql ="CREATE TABLE Apartamentos(piso text, precio text, balcon text, sombra text, mts int , nomeclatura text not null unique)";

    public  ApartamentosSQLiteOpenHelper(Context contexto, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(contexto,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Apartamentos");
        db.execSQL(sql);
    }
}
