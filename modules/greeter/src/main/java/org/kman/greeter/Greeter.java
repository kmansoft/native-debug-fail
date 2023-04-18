package org.kman.greeter;

public class Greeter {

    static {
        System.loadLibrary("greeter");
    }

    public Greeter() {
        init();
    }

    public native String getMessage();

    private native void  init();
}
