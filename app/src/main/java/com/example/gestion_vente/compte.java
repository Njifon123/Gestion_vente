package com.example.gestion_vente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class compte extends AppCompatActivity {
    EditText email, password, confirm;
    Button compte;
    ProgressBar pro;
    TextView login;
    String email1 ;
    String password1 ;
    String confirm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compte);

        email= findViewById(R.id.email);
        password= findViewById(R.id.password);
        confirm= findViewById(R.id.confirm);
        pro= findViewById(R.id.pro);
        login= findViewById(R.id.login);
        compte= findViewById(R.id.compte);

        compte.setOnClickListener(view -> compte());
        login.setOnClickListener(view -> finish());

    }

    void compte (){
        email1 = email.getText().toString();
        password1 = password.getText().toString();
        confirm1 = confirm.getText().toString();
        boolean isvalidated= validateDATA(email,password,confirm){
    }
    boolean validateDATA(String email2, String password2, String confirm2) {

        if (!Patterns.EMAIL_ADDRESS.matcher(email2).matches()) {
            email.setError("email is not valide");
            return false;
        }
        if (password.length()<6){
            password.setError("password length is invaide");
                return false;
        }

        if (!password.equals(confirm)){

        confirm.setError("password is not invalid");
            return false;

    }


}