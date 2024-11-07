package org.example.creation.tp.builder;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
import java.util.ArrayList;
import java.util.List;

public class Car {
<<<<<<< Updated upstream
    private String model;
    private String engine;
    private String color;
    private int seats;
    private List<String> extras;

    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = builder.color;
        this.seats = builder.seats;
        this.extras = builder.extras;
    }


    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void displayCar() {
        System.out.println("Car Details:");
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Color: " + color);
        System.out.println("Seats: " + seats);
        System.out.println("Extras: " + (extras.isEmpty() ? "None" : String.join(", ", extras)));
    }


    public static class CarBuilder {
        private String model;
        private String engine;
        private String color = "undefined"; // Default value
        private int seats;
        private List<String> extras = new ArrayList<>();


        public CarBuilder setModel(String model) {
            if (!model.equals("SUV") && !model.equals("Berline") && !model.equals("Sport")) {
                throw new IllegalArgumentException("Invalid model type.");
=======
    private final String model;
    private final String engine;
    private final int seats;
    private final String color;
    private final List<String> extras;

    // Constructeur privé, uniquement accessible par le Builder
    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.color = builder.color;
        this.extras = builder.extras;
    }

    // Méthode pour afficher les détails de la voiture
    public void displayCar() {
        System.out.println("Modèle: " + model);
        System.out.println("Moteur: " + engine);
        System.out.println("Sièges: " + seats);
        System.out.println("Couleur: " + color);
        System.out.println("Extras: " + (extras.isEmpty() ? "Aucun" : String.join(", ", extras)));
    }

    // Builder imbriqué pour la construction de Car
    public static class CarBuilder {
        private String model;
        private String engine;
        private int seats;
        private String color = "undefined"; // Valeur par défaut
        private List<String> extras = new ArrayList<>();

        public CarBuilder setModel(String model) {
            if (!model.equals("SUV") && !model.equals("Berline") && !model.equals("Sport")) {
                throw new IllegalArgumentException("Modèle invalide. Choisissez entre SUV, Berline, ou Sport.");
>>>>>>> Stashed changes
            }
            this.model = model;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            if (!engine.equals("Électrique") && !engine.equals("Hybride") && !engine.equals("Essence")) {
<<<<<<< Updated upstream
                throw new IllegalArgumentException("Invalid engine type.");
            }

            if (model != null && model.equals("Sport") && engine.equals("Électrique")) {
                throw new IllegalArgumentException("A Sport model cannot have an electric engine.");
            }

=======
                throw new IllegalArgumentException("Type de moteur invalide. Choisissez entre Électrique, Hybride, ou Essence.");
            }
>>>>>>> Stashed changes
            this.engine = engine;
            return this;
        }

<<<<<<< Updated upstream
=======
        public CarBuilder setSeats(int seats) {
            if (seats <= 0) {
                throw new IllegalArgumentException("Le nombre de sièges doit être supérieur à zéro.");
            }
            this.seats = seats;
            return this;
        }

>>>>>>> Stashed changes
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

<<<<<<< Updated upstream
        public CarBuilder setSeats(int seats) {
            if (model != null && model.equals("SUV") && seats < 5) {
                throw new IllegalArgumentException("SUVs must have at least 5 seats.");
            }
            this.seats = seats;
            return this;
        }

=======
>>>>>>> Stashed changes
        public CarBuilder addExtra(String extra) {
            extras.add(extra);
            return this;
        }

<<<<<<< Updated upstream

        public Car build() {
            if (model == null || engine == null || seats == 0) {
                throw new IllegalStateException("Model, engine, and seats must be specified.");
            }
=======
        // Méthode de validation et de création de l'objet Car
        public Car build() {
            // Validation des attributs obligatoires
            if (model == null || engine == null || seats == 0) {
                throw new IllegalStateException("Modèle, moteur, et nombre de sièges sont obligatoires.");
            }

            // Validation des contraintes spécifiques
            if (model.equals("Sport") && engine.equals("Électrique")) {
                throw new IllegalStateException("Un modèle Sport ne peut pas avoir de moteur électrique.");
            }
            if (model.equals("SUV") && seats < 5) {
                throw new IllegalStateException("Un SUV doit avoir au moins 5 sièges.");
            }

>>>>>>> Stashed changes
            return new Car(this);
        }
    }
}
