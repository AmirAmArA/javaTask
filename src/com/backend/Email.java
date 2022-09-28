package com.backend;

public class Email {
    private final String from;
    private final String to;
    private final String body;
    private boolean replayed;


    public Email(String from, String to, String body) {
        this.from = from;
        this.to = to;
        this.body = body;
    }
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }
    public void setReplayed(boolean replayed) {
        this.replayed = replayed;
    }
}
