package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText alcoolPice;
    private EditText gasPrice;
    private Button buttonVerify;
    private TextView textVerified;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alcoolPice = (EditText) findViewById(R.id.alcoolPriceId);
        gasPrice = (EditText) findViewById(R.id.gasPriceId);
        buttonVerify = (Button) findViewById(R.id.buttonVerifyId);
        textVerified = (TextView) findViewById(R.id.textVerifiedId);

        buttonVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textAlcool = alcoolPice.getText().toString();
                String textGas = gasPrice.getText().toString();

                Double alcoolValue = Double.parseDouble(textAlcool);
                Double gasValue = Double.parseDouble(textGas);

                Double result = alcoolValue / gasValue;

                if(result >= 0.7){
                    textVerified.setText("É melhor utilizar Gasolina");
                }else{
                    textVerified.setText("É melhor utilizar Álcool");
                }
            }
        });
    }
}
