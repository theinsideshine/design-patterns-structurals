package com.insideshine.structurals.patterns.adapters;

public interface EmailSender {
    void send (String from, String to, String subject, String body);

}
