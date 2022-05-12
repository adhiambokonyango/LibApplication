package com.example.libtest;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
