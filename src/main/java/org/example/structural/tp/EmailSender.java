package org.example.structural.tp;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String messageContent) {
        System.out.println("Envoi de l'email avec le contenu : " + messageContent);
    }
}
