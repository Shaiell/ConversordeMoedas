package br.ici.treinamento.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public void conversaoDeValor(View view){

        EditText real = (EditText) findViewById(R.id.editTextReal);

        Double valorDouble = Double.parseDouble(real.getText().toString());

        Double dollar = valorDouble/3.96;

        Toast.makeText(MainActivity.this,"US$: "+ String.format("%.2f",dollar), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
