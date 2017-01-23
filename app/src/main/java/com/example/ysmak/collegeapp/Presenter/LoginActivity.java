package com.example.ysmak.collegeapp.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.example.ysmak.collegeapp.R;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = (EditText) findViewById(R.id.editText_username);
        final EditText password = (EditText) findViewById(R.id.editText_password);
        TextView cna = (TextView) findViewById(R.id.textView_cna);
        Button loginButton = (Button) findViewById(R.id.button_login);

        //TODO: remove secret key before Github
        Backendless.initApp(this, "2EE6BCB6-1C79-C7EA-FF53-D88FFEAA3A00",
                secretKey, "v1"); // where to get the argument values for this call

        cna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Backendless.UserService.login( username.getText().toString(),
                        password.getText().toString(), new AsyncCallback<BackendlessUser>()
                        {
                            public void handleResponse( BackendlessUser user )
                            {
                                // user has been logged in
                                launchMainActivity();
                            }

                            public void handleFault( BackendlessFault fault )
                            {
                                // login failed, to get the error code call fault.getCode()
                                Toast.makeText(LoginActivity.this, "Error: " + fault.getCode(), Toast.LENGTH_SHORT).show();
                                //TODO: what is an internal client exception????
                            }
                        });
            }
        });
    }

    private void launchMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
