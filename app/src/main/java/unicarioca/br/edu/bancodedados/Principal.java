package unicarioca.br.edu.bancodedados;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Controler.AlunoControler;

public class Principal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button botao = (Button)findViewById(R.id.salvarInserir);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void cliquebotao(View view){
        AlunoControler crud = new AlunoControler(getBaseContext());

        EditText nomeB = (EditText)findViewById(R.id.editNome);
        EditText emailB = (EditText)findViewById((R.id.editEmail));
        String nome = nomeB.getText().toString();
        String email = emailB.getText().toString();
        String resultado;

        resultado = crud.insereDado(nome,email);
        Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
    }


}
