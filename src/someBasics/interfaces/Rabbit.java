package someBasics.interfaces;

public class Rabbit implements Prey {
    String rabbit = "rabbit";

    @Override
    public void flee() {
        System.out.println(rabbit + " is fleeing");
    }
}
