package com.backend;

import com.backend.vendor.Gmail;
import com.backend.vendor.Vendor;
import com.backend.vendor.Walla;
import com.backend.vendor.Yahoo;

import java.util.ArrayList;


public class Account {

    public String username;
    public String password;
    public ArrayList<Vendor> emails = new ArrayList<>() ;

    public Account(String username, String password) {
        this.password=password;

        this.username=username;
    }
    Vendor vendorGmail = Gmail.getGmailInstance();
    Vendor vendorYahoo = Yahoo.getYahooInstance();
    Vendor vendorWalla = Walla.getWallaInstance();
    public boolean logIn(String username, String password){
            if(username.equals(this.username) && password.equals(this.password) ) {
                emails.add(vendorGmail);
                vendorGmail.setLoggedIn();
                emails.add(vendorYahoo);
                vendorYahoo.setLoggedIn();
                emails.add(vendorWalla);
                vendorWalla.setLoggedIn();

                System.out.println("you were logged into your yahoo/gmail/walla");
                return true;
            }
            System.out.println("username or password wrong");
            return false;



    }

    public String sendMail(String account, String customer, String body){

        Email newMail = new Email(account,customer,body);
        newMail.setReplayed(true);
        return "new mail was sent to the customer: "+ customer;

    }
}
