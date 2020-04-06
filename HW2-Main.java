package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal lion = new Animal("Lion",4,"Roar","Meat","Africa","Deep Orange-Brown");
        Animal deer = new Animal("Deer",4,"Short Grunt","Grass","Grassland","Reddish-Brown");
        Animal wild_pigeon = new Animal("Wild Pigeon",2,"coo roo-c'too-coo","Grains","coastal area");
        Animal horse = new Animal("Horse",4, "Neigh", "Grass", "Grassland");

        lion.makeSound(2);
        lion.eat();

        deer.makeSound(2);
        deer.eat();

        wild_pigeon.makeSound(2);
        wild_pigeon.eat();

        horse.makeSound(2);
        horse.eat();
    }
}
