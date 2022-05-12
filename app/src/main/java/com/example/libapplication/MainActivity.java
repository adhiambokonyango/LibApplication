package com.example.libapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.libtest.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster toaster = new Toaster();
        toaster.s(getApplicationContext(), "mary");
    }
}