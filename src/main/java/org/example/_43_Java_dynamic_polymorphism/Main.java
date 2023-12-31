package org.example._43_Java_dynamic_polymorphism;
//ALSO KNOWN AS RUNTIME POLYMORPHISM
/*
* polymorphism = many shapes /forms
* dynamic polymorphism = after compilation (during runtime)
* eg : a corvette is a car,vehicle,and and object
* its used in like game options where we have to chose gender/shooting style or something and proceed common path of game
*
*
*
*
* */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Dynamic Polymorphism

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if(choice==1) {
            animal = new Dog(); //this is good stuff
            animal.speak();
        }
        else if(choice==2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}

//***********************************************
