package com.backend.vendor;

public class Walla extends Vendor{
    private static Walla walla = null;
    public Walla(){
        super("walla","smtp.walla.co.il","@walla.co.il");
    }

    public static Walla getWallaInstance(){
        if(walla == null) {
            walla = new Walla();
        }
        return walla;
    }
}
