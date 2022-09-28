package com.backend.vendor;

public class Gmail extends Vendor{
    private static Gmail gmail = null;
    public Gmail(){
        super("gmail","smtp.gmail.com","@gmail.com");
    }

    public static Gmail getGmailInstance(){
        if(gmail == null) {
            gmail = new Gmail();
        }
        return gmail;
    }
}
