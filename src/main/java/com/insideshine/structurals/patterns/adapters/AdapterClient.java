package com.insideshine.structurals.patterns.adapters;

import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

public class AdapterClient {

    private EmailSender sender;

    public AdapterClient(EmailSender sender) {
        this.sender = sender;
    }

    public  void execute (String from, String to, String subject, String body){


        sender.send(from,to,subject,body);

    }
}


