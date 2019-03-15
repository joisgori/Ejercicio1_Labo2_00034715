package com.example.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private LinearLayout mLinearLayout;

    private Button b1;

    private EditText n, password;

    private TextView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = findViewById(R.id.l1);

        b1 = findViewById(R.id.btn_clk);

        n = findViewById(R.id.nom);
        password = findViewById(R.id.Contraseña);

        s = findViewById(R.id.nuevo);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String algo = n.getText().toString();
                s.setText(algo);
            }
        });

        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                String algo = password.getText().toString();
                s.setText(algo);


                return false;
            }
        });

    }



}
