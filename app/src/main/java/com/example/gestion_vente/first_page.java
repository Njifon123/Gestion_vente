package com.example.gestion_vente;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class first_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    startActivity(new Intent(first_page.this, first_page.class));
                    finish();
            }
        },  1000);




    }
}