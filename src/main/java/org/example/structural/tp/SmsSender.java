package org.example.structural.tp;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String messageContent) {
        System.out.println("Envoi de SMS avec le contenu : " + messageContent);
    }
}
