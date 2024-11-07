package org.example.creation.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuiCorrige1 {

    private Random random = new Random();

    List<String> dejaCorrige = new ArrayList<>();
    List<String> pasEncoreCorrige = new ArrayList<>(Arrays.asList("Oussama", "Mathieu","Mathis","Thomas","Antoine","Axel"));

    public String quiCorrige1(){
        if(pasEncoreCorrige.size() == 0){
            pasEncoreCorrige.addAll(dejaCorrige);
            dejaCorrige.clear();
        }
        String apprenant = pasEncoreCorrige.get(random.nextInt(pasEncoreCorrige.size()));
        dejaCorrige.add(apprenant);
        int index = pasEncoreCorrige.indexOf(apprenant);
        pasEncoreCorrige.remove(index);
        return apprenant;

    }

}
