package com.example.arnaud.mymod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylib.MyDSP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDSP mydsp = new MyDSP();
        mydsp.CallJniCppMethod();
    }


}
