package com.backend.vendor;


public class Yahoo extends Vendor{
    private static Yahoo yahoo = null;
    public Yahoo(){
        super("yahoo","smtp.yahoo.com","@yahoo.com");
    }

    public static Yahoo getYahooInstance(){
        if(yahoo == null) {
            yahoo = new Yahoo();
        }
        return yahoo;
    }

}
