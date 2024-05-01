package com.insideshine.structurals.patterns.adapters;

public class SendindBlueAdapter implements  EmailSender{
    @Override
    public void send(String from, String to, String subject, String body) {

        System.out.println("Mail desde  SendingBlue");
        System.out.println("From: "+from);
        System.out.println("To: "+to);
        System.out.println("Subject: "+subject);
        System.out.println("Body: "+body);



    }
}
