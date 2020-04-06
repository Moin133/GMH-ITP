package com.company;

public class Animal {
    String name;
    int numberOfLegs;
    String animalSound;
    String animalFood;
    String habitat;
    String color;

    public Animal(String name, int numberOfLegs, String animalSound, String animalFood, String habitat, String color){
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.animalSound = animalSound;
        this.animalFood = animalFood;
        this.habitat = habitat;
        this.color = color;
    }

    public Animal(String name, int numberOfLegs, String animalSound, String animalFood, String habitat){
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.animalSound = animalSound;
        this.animalFood = animalFood;
        this.habitat = habitat;
    }

    void makeSound(int x){
        for (int i = 0; i < x; i++){
            System.out.println(this.name+" makes sound like "+this.animalSound);
        }
    }
    void eat(){
        System.out.println(this.name+" eats " +this.animalFood);
    }
}
