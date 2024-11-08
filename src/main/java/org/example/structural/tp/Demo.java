package org.example.structural.tp;

public class Demo {
    public static void main(String[] args) {
        // Utiliser Email pour envoyer un message court
        Message shortMessageEmail = new ShortMessage(new EmailSender());
        shortMessageEmail.send("Voici un court message via Email.");

        // Utiliser SMS pour envoyer un message d'alerte
        Message alertMessageSms = new AlertMessage(new SmsSender());
        alertMessageSms.send("Alerte importante via SMS!");

        // Utiliser Notification push pour envoyer un message court
        Message shortMessagePush = new ShortMessage(new PushNotificationSender());
        shortMessagePush.send("Voici un court message via Notification push.");
    }
}
