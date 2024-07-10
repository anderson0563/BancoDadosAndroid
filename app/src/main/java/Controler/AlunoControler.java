package Controler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import Model.Banco;

/**
 * Created by anderson0563 on 29/10/15.
 */
public class AlunoControler {
    private SQLiteDatabase db;
    private Banco banco;

    public AlunoControler(Context context) {

        banco = new Banco(context);

    }

    public String insereDado(String nome, String email) {

        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(Banco.NOME, nome);
        valores.put(Banco.EMAIL, email);
        resultado = db.insert(Banco.TABELA, null, valores);
        db.close();

        if (resultado == -1)
            return "Erro ao inserir registro";

        return "Registro Inserido com sucesso";
    }

}
