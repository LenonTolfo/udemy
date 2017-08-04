package frasesdodia.cursoandroid.com.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "A persistência é o caminho do êxito.",
            "teste2",
            "teste3",
            "teste4",
            "teste5",
            "teste6",
            "teste7",
            "teste8",
            "teste9",
            "teste2",
            "teste2",
            "teste2",
            "teste2",
            "teste2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numeroAleatorio = random.nextInt(10);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });

    }
}
