package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private EditText textField;
    private TextView dogAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textField = (EditText) findViewById(R.id.textFieldId);
        botao = (Button) findViewById(R.id.botaoIdadeId);
        dogAge = (TextView) findViewById(R.id.resultadoIdadeId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = textField.getText().toString();

                if (textoDigitado.isEmpty()){
                    dogAge.setText("Nenhum numero digitado!");
                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoIdade = valorDigitado * 7;
                    dogAge.setText("A idade do cachorro em anos humanos é "+ resultadoIdade +" anos");
                }

            }
        });
    }
}
