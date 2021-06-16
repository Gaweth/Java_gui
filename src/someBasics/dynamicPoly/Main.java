package someBasics.dynamicPoly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj zwierzaka , 1=cat, 2=dog");
        int choice = scanner.nextInt();


        if (choice == 1){
            animal = new Cat();
            animal.makesSound();
        }
        else if (choice == 2 ){
            animal = new Dog();
            animal.makesSound();
        }
        else
            System.out.println("nie ma takiego zwierzaka");
            animal = new Animal();
            animal.makesSound();


    }
}
