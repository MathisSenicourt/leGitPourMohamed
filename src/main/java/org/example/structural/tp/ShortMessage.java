package org.example.structural.tp;

public class ShortMessage extends Message {
    public ShortMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String content) {
        System.out.print("Message court : ");
        messageSender.sendMessage(content);
    }
}
