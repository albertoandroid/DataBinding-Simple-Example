package com.androiddesdecero.databindingandroid;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androiddesdecero.databindingandroid.databinding.ActivityDbBinding;

public class DBActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);

        ActivityDbBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_db);
        user = new User("Marta", "30", "marta@marta.com", "180", "70");
        binding.setUserPrueba(user);

        user.setNombre("Barry Allen");
    }

    public void cambiarActivity(View view){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
