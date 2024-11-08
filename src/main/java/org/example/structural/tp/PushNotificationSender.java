package org.example.structural.tp;

public class PushNotificationSender implements MessageSender {
    @Override
    public void sendMessage(String messageContent) {
        System.out.println("Envoi de notification push avec le contenu : " + messageContent);
    }
}
