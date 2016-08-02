package com.example.mylib;

public class MyDSP {

    public  void CallJniCppMethod() {

        this.onPlayPause(true);
    }

    private native void onPlayPause(boolean play);

    static {
        System.loadLibrary("SuperpoweredExample");
    }

}

