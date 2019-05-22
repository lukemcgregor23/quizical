package com.example.quizical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void login(View v){
        String usernameValid = "lukemcgregs@gmail.com";
        String passwordValid = "lukemcgregor23";

        EditText username = (EditText)findViewById(R.id.editTextUN);
        EditText password = (EditText)findViewById(R.id.editTextPW);

        if(username.getText().toString().equals(usernameValid) && password.getText().toString().equals(passwordValid)) {
            startActivity(new Intent(this, PlayScreen.class));
        }
    }

}
