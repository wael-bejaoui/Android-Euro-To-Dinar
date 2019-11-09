package com.example.myapplication;
import android.app.Activity;
import android.icu.text.DecimalFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private Button bConvert;
    private RadioButton r1;
    private RadioButton r2;
    private EditText txtSrc;
    private TextView txtOut;

    private double res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bConvert = (Button) this.findViewById(R.id.btnC);
        this.r1 = (RadioButton) this.findViewById(R.id.radioDinarEuro);
        this.r2 = (RadioButton) this.findViewById(R.id.radioEuroDinar);
        this.txtSrc = (EditText) this.findViewById(R.id.montant);
        this.txtOut = (TextView) this.findViewById(R.id.Result);





    }

    public void fctConvert(View v)
    {
        if(r1.isChecked())
        {
            res = Float.parseFloat(txtSrc.getText().toString()) / 3.4;
            txtOut.setText(res + " Euros");

        }
        else
        {
            res = Float.parseFloat(txtSrc.getText().toString()) * 3.4;
            txtOut.setText(res + " TND");
        }
        //Toast.makeText(getApplicationContext(), "Je viens du bouton", Toast.LENGTH_LONG).show();



    }
}
