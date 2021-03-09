package com.praticas.testunitario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.praticas.testunitario.mockitomvp.Login;
import com.praticas.testunitario.mockitomvp.LoginPresenter;
import com.praticas.testunitario.mockitomvp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements Login.View{

    private EditText etUser;
    private EditText etPassword;
    private Button btLogin;
    private Login.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        btLogin = findViewById(R.id.btnlogin);
        presenter = new LoginPresenter(this);

    }

    @Override
    public void usarioValido() {
       //startActivity(new Intent(LoginActivity.this, finalActivity.class));
    }

    @Override
    public void error() {
        Log.d("TAG1","Usuario no es valido");
    }

    @Override
    public String getUserName() {
        return etUser.getText().toString();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }
}