package com.androiddesdecero.databindingandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private User user;
    private TextView tvNombre, tvEdad, tvEmail, tvPeso, tvAltura;
    private Button btCambiarActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configView();
    }

    private void configView() {
        tvNombre = findViewById(R.id.tvNombre);
        tvEdad = findViewById(R.id.tvEdad);
        tvEmail = findViewById(R.id.tvEmail);
        tvPeso = findViewById(R.id.tvPeso);
        tvAltura = findViewById(R.id.tvAltura);
        btCambiarActivity = findViewById(R.id.btCambiarActivity);

        user = new User("Manuel", "30", "manu@manu.com", "180", "70");

        tvNombre.setText(user.getNombre());
        tvEdad.setText(user.getEdad());
        tvEmail.setText(user.getEmail());
        tvPeso.setText(user.getPeso());
        tvAltura.setText(user.getAltura());

        btCambiarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DBActivity.class));
            }
        });


        user.setNombre("Barry Allen");
    }
}
