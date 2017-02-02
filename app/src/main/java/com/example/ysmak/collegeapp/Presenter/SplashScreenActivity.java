package com.example.ysmak.collegeapp.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ysmak.collegeapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView splashText = (TextView) (findViewById(R.id.textView_splash));
        final TextView loadingText = (TextView) (findViewById(R.id.textView_loading));

        CountDownTimer countdown = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long l) { /*stuff that happens while ticker runs */ }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };

        countdown.start();
    }
}
