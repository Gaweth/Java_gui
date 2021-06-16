package someBasics.interfaces;

import java.util.Random;

public class HuntResult {




    void huntResult(){
        Random random = new Random();
        int rand = random.nextInt(2);

        if (rand == 0){
            System.out.println("hunt succesed");
        }
        else System.out.println("prey escaped");

    }
}
