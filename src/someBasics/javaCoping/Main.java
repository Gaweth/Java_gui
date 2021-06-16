package someBasics.javaCoping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("chev", "mustang", 2222));
        arrayList.add(new Car("csdfghev", "fghd", 0000));

        Car car1 = new Car("audi", "a4", 2000);
       // Car car2 = new Car("merc", "b200", 2020);

     //  car2.copy(car1);
        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);



        System.out.println(car1.getModel() + " to jest model\n" + car1.getName() + " to jest nazwa \n" + car1.getYear());

      //  System.out.println(arrayList);



    }
}
