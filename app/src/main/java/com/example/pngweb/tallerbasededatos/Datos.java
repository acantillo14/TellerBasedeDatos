package com.example.pngweb.tallerbasededatos;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by PNGWEB on 19/05/2017.
 */

public class Datos {
    private static Apartamento a;

    public static ArrayList<Apartamento> listarApartamentos(Context contexto) {
        ArrayList<Apartamento> apartamentos = new ArrayList<>();
        SQLiteDatabase db;
        String sql, piso, precio, balcon, sombra, mts, nome;


        ApartamentosSQLiteOpenHelper aux = new ApartamentosSQLiteOpenHelper(contexto, "DBApartamentos", null, 2);
        db = aux.getReadableDatabase();
        //cursor

        sql = "SELECT * FROM Apartamentos";
        Cursor c = db.rawQuery(sql, null);


        //recorremos el cursor
        if (c.moveToFirst()) {
            do {
                piso = c.getString(0);
                precio = c.getString(1);
                balcon = c.getString(2);
                sombra = c.getString(3);
                mts = c.getString(4);
                nome = c.getString(5);
                a = new Apartamento(piso, precio, balcon, sombra, mts, nome);
                apartamentos.add(a);
            } while (c.moveToNext());
        }
        db.close();

        return apartamentos;
    }

    public static int listarConBalconySombra(Context contexto) {
        SQLiteDatabase db;
        String sql, piso, precio, balcon, sombra, mts, nome;
        int cant =0;

        ApartamentosSQLiteOpenHelper aux = new ApartamentosSQLiteOpenHelper(contexto, "DBApartamentos", null, 2);
        db = aux.getReadableDatabase();
        //cursor

        sql = "SELECT * FROM Apartamentos WHERE balcon = 'Si' AND sombra ='Si'";
        Cursor c = db.rawQuery(sql, null);
        cant= c.getCount();
        db.close();
        return cant;
    }

    public static ArrayList<Apartamento> listarMasCaro(Context contexto) {
        ArrayList<Apartamento> apartamentos = new ArrayList<>();
    SQLiteDatabase db;
    String sql, piso, precio, balcon, sombra, mts, nome;


    ApartamentosSQLiteOpenHelper aux = new ApartamentosSQLiteOpenHelper(contexto, "DBApartamentos", null, 2);
    db = aux.getReadableDatabase();
    //cursor

    sql = "SELECT * FROM Apartamentos  ORDER BY precio DESC  LIMIT 1 ";
    Cursor c = db.rawQuery(sql, null);


    //recorremos el cursor
        if (c.moveToFirst()) {
        do {
            piso = c.getString(0);
            precio = c.getString(1);
            balcon = c.getString(2);
            sombra = c.getString(3);
            mts = c.getString(4);
            nome = c.getString(5);
            a = new Apartamento(piso, precio, balcon, sombra, mts, nome);
            apartamentos.add(a);
        } while (c.moveToNext());
    }
        db.close();

        return apartamentos;
}

    public static ArrayList<Apartamento> Mayortamanio(Context contexto) {
        ArrayList<Apartamento> apartamentos = new ArrayList<>();
        SQLiteDatabase db;
        String sql, piso, precio, balcon, sombra, mtss, nome;


        ApartamentosSQLiteOpenHelper aux = new ApartamentosSQLiteOpenHelper(contexto, "DBApartamentos", null, 2);
        db = aux.getReadableDatabase();
        //cursor

        sql = "SELECT * FROM Apartamentos  ORDER BY mts DESC LIMIT 1";
        Cursor c = db.rawQuery(sql, null);


        //recorremos el cursor
        if (c.moveToFirst()) {
            do {
                piso = c.getString(0);
                precio = c.getString(1);
                balcon = c.getString(2);
                sombra = c.getString(3);
                mtss = c.getString(4);
                nome = c.getString(5);
                a = new Apartamento(piso, precio, balcon, sombra, mtss, nome);
                apartamentos.add(a);
            } while (c.moveToNext());
        }
        db.close();

        return apartamentos;
    }


}