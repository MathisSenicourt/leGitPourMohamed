package org.example.structural.tp;

public class AlertMessage extends Message {
    public AlertMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String content) {
        System.out.print("Message d'alerte : ");
        messageSender.sendMessage(content);
    }
}
