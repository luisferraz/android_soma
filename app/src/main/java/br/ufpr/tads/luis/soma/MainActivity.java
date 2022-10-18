package br.ufpr.tads.luis.soma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soma (View view) {
        EditText fld1 = findViewById(R.id.editTextNumber);
        EditText fld2 = findViewById(R.id.editTextNumber2);
        TextView result = findViewById(R.id.textViewOutput);

        if (fld1.length() == 0 || fld2.length() == 0) {
            Toast.makeText(this, "Forneça um número para a entrada de dados!", Toast.LENGTH_SHORT).show();
        }
        else {
            int val1 = Integer.parseInt(fld1.getText().toString());
            int val2 = Integer.parseInt(fld2.getText().toString());
            result.setText(String.valueOf(val1 + val2));
        }
    }

}