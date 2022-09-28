package com.backend.vendor;

public class Vendor {
    private String name;
    private String serverAddress;
    private String emailPostfix;
    public boolean loggedIn;

    public Vendor(String name, String serverAddress, String emailPostfix) {
        this.emailPostfix=emailPostfix;
        this.name=name;
        this.serverAddress=serverAddress;
        this.loggedIn=false;
    }

    public String getName() {
        return name;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public String getEmailPostfix() {
        return emailPostfix;
    }
    public void setLoggedIn() {
        loggedIn=!loggedIn;
        System.out.println("Account Logged In");
    }
}
