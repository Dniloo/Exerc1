package unibratec.edu.br.exerc1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edTT;
    Button bt, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTT = (EditText) findViewById(R.id.edTT);
        bt = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);

        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
            String tt = edTT.getText().toString();
            Toast.makeText(this, tt, Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Intent it = new Intent(this, TelaDetalhesLista.class);
                it.putExtra("nome", "Danilo");
                it.putExtra("endereco", "Rua SANTA CRUZ" );
                startActivity(it);
                break;
        }
        }
}