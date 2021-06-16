package someBasics.interfaces;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        HuntResult huntResult = new HuntResult();
        Fish fish = new Fish();
        hawk.hunt();
        rabbit.flee();
        huntResult.huntResult();
        fish.flee();
        fish.hunt();


    }
}
