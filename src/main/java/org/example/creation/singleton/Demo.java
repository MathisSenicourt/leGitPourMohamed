package org.example.creation.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {

     //   OrderManagementService orderManagementService = OrderManagementService.getInstance();
        // orderManagementService2 = new OrderManagementService();
      //  OrderManagementService orderManagementService3 = OrderManagementService.getInstance();

       // System.out.println(orderManagementService == orderManagementService3);
       // System.out.println(orderManagementService == orderManagementService2);

        // Création d'un pool de threads
/*        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Lancer plusieurs threads qui essaient d'obtenir un stagiaire à corriger
        for (int i = 0; i < 6; i++) {
            executorService.execute(() -> {
                QuiCorrige quiCorrige = QuiCorrige.getInstance();
                String stagiaire = quiCorrige.quiCorrige();
                System.out.println("Stagiaire corrigé : " + stagiaire);
            });
        }

        // Arrêter le pool de threads
        executorService.shutdown();


 */

        for (int i = 0; i < 6; i++) {
            QuiCorrige1 quiCorrige1 = new QuiCorrige1();
            String apprenant = quiCorrige1.quiCorrige1();
            System.out.println("Appprenant " + apprenant);

        }


    }





}
