package unibratec.edu.br.exerc1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaDetalhesLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_detalhes_lista);

        Intent it = getIntent();
        String nome = it.getStringExtra("nome");
        int idade = it.getIntExtra("idade", -1);

        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText(String.format("Nome: %s / Idade: %d", nome , idade));

    }
}
