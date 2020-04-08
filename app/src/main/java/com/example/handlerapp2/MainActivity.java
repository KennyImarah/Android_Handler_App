package com.example.handlerapp2;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    static Handler mHandler;
    Boolean gameOn;
    long startTime;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startTime = System.currentTimeMillis();
        mHandler = new Handler(Objects.requireNonNull(Looper.myLooper())) {

            public void handleMessage(Message msg) {
                super.handleMessage(msg);

                if (gameOn) {
                    long seconds = ((System.currentTimeMillis() - startTime)) / 1000;
                    Log.i("info", "seconds = " + seconds);
                }

                mHandler.sendEmptyMessageDelayed(0, 1000);
            }
        };

            gameOn = true;
            mHandler.sendEmptyMessage(0);

            }

    public void onButtonClick(View view) {

    }

    public void Redirect(View view) {

    }

}
