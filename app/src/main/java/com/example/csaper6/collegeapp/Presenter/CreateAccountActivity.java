package com.example.csaper6.collegeapp.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.csaper6.collegeapp.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        getIntent();

        EditText username = (EditText) findViewById(R.id.editText_username);
        EditText password = (EditText) findViewById(R.id.editText_password);
        EditText confirmPassword = (EditText) findViewById(R.id.editText_confirm_password);
        Button createAccountButton = (Button) findViewById(R.id.button_cna);
        ProgressBar loadingBar = (ProgressBar) findViewById(R.id.progressBar);

        //TODO: make password confirmation method that runs before create account button can be clicked

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //startActivityForResult
                startActivity(intent);
            }
        });
    }
}
