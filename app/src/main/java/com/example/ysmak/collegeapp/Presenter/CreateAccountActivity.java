package com.example.ysmak.collegeapp.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.example.ysmak.collegeapp.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        //provide for up-navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText email = (EditText) findViewById(R.id.editText_email);
        final EditText username = (EditText) findViewById(R.id.editText_username);
        final EditText password = (EditText) findViewById(R.id.editText_password);
        //final EditText confirmPassword = (EditText) findViewById(R.id.editText_confirm_password);
        Button createAccountButton = (Button) findViewById(R.id.button_cna);

        //TODO: make password confirmation method that runs before create account button can be clicked

        Backendless.initApp(this, "2EE6BCB6-1C79-C7EA-FF53-D88FFEAA3A00",
                "C439AA6A-4011-5E2C-FF7D-3F9153D05200", "v1");

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                BackendlessUser user = new BackendlessUser();
                user.setEmail(email.getText().toString());
                user.setProperty("username", username.getText().toString());
                user.setPassword(password.getText().toString());

                /*if(password.getText().toString().equals(confirmPassword.getText().toString()))
                    user.setPassword(password.getText().toString());
                else {
                    //crashing because if no match, returns with null password
                    Toast.makeText(CreateAccountActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }*/

                Backendless.UserService.register( user, new AsyncCallback<BackendlessUser>()
                {
                    public void handleResponse( BackendlessUser registeredUser )
                    {
                        // user has been registered and now can login
                        //startActivityForResult
                        Toast.makeText(CreateAccountActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                        finish();
                    }

                    public void handleFault( BackendlessFault fault )
                    {
                        // an error has occurred
                        Toast.makeText(CreateAccountActivity.this, "Error: " + fault.getCode(), Toast.LENGTH_SHORT).show();
                    }
                } );
            }
        });
    }
}
