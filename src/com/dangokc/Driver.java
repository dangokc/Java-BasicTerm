package com.dangokc;


public class Driver {
    public static void main(String[] args){
        Animal[] myPets = new Animal[5];
        Dog d = new Dog("Fido", "Black Lab", false);
        Cat c = new Cat("Fluffy", "Persian", true);
        myPets[0] = d;
        myPets[1] = new Dog("Woofy", "German Shepherd", true);
        myPets[2] = c;
        myPets[3] = new Cat("Spot", "Siamese", false);
        myPets[4] = new Animal("Tank", "Turtle");
        
        //They are all animals, and For Each loop know which one is what
        /*
        for(Animal a : myPets) {
            System.out.println(a);
        }
        */
        
        //we can set the Breed, since Breed property is in Animal Class
        myPets[0].setBreed("Vizsla");
        
        /*
        but we can't set a deeper property in Dog or Cat class
        myPets[0].setIsServiceAnimal(true);
        myPets[2].setIsDeclawed(true);
        
        we can use downcast thought as long as we know what type they are
        or we will get ClassCastException!
        ((Dog)myPets[0]).setIsServiceAnimal(true);
        ((Cat)myPets[2]).setIsDeclawed(true);
        */
        
        //solution for dynamic cast
        for (Animal a : myPets) {
            if (a instanceof Dog) {
                System.out.println("Catched an instance of Dog");
                ((Dog)a).setIsServiceAnimal(true);
            }
            else if (a instanceof Cat) {
                System.out.println("Catched an instance of Cat");
                ((Cat)a).setIsDeclawed(false);
            }
            else if (a instanceof Animal) {
                System.out.println("Catched an instance of Animal");
            }
            System.out.println(a);
        }
       
        
    }
}
