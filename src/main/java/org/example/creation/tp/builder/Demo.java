package org.example.creation.tp.builder;

public class Demo {
<<<<<<< Updated upstream

    public static void main(String[] args) {
        // Test 1 : Voiture valide (SUV avec toutes les options)
        try {
            Car car1 = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Hybride")
                    .setColor("Blue")
                    .setSeats(7)
                    .addExtra("GPS")
                    .addExtra("Toit ouvrant")
                    .build();

            car1.displayCar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Test 2 : Erreur - Modèle Sport avec moteur électrique
        try {
            Car car2 = new Car.CarBuilder()
                    .setModel("Sport")
                    .setEngine("Électrique") // Devrait déclencher une exception
                    .setColor("Red")
                    .setSeats(2)
                    .build();

            car2.displayCar();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Affiche : A Sport model cannot have an electric engine.
        }

        System.out.println();

        // Test 3 : Erreur - SUV avec moins de 5 sièges
        try {
            Car car3 = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Essence")
                    .setSeats(4)  // Devrait déclencher une exception
                    .build();

            car3.displayCar();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Affiche : SUVs must have at least 5 seats.
        }

        System.out.println();

        // Test 4 : Voiture valide (Berline sans options)
        try {
            Car car4 = new Car.CarBuilder()
                    .setModel("Berline")
                    .setEngine("Essence")
                    .setSeats(4)
                    .build();

            car4.displayCar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

=======
    public static void main(String[] args) {
        try {
            // Construction réussie d'un SUV avec des extras
            Car suv = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Hybride")
                    .setSeats(7)
                    .setColor("Bleu")
                    .addExtra("GPS")
                    .addExtra("Toit ouvrant")
                    .build();
            suv.displayCar();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            // Essayer de créer une voiture Sport avec un moteur électrique (devrait échouer)
            Car sportiveElectrique = new Car.CarBuilder()
                    .setModel("Sport")
                    .setEngine("Électrique")
                    .setSeats(2)
                    .setColor("Rouge")
                    .build();
            sportiveElectrique.displayCar();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            // Essayer de créer un SUV avec moins de 5 sièges (devrait échouer)
            Car suvInvalide = new Car.CarBuilder()
                    .setModel("SUV")
                    .setEngine("Essence")
                    .setSeats(4) // Invalide, moins de 5 sièges
                    .setColor("Gris")
                    .build();
            suvInvalide.displayCar();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
>>>>>>> Stashed changes
