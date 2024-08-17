/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid1;

/**
 *
 * @author hoangvantiendat
 */
public class AnimalNot1 {

    private String name;
    private String species;
    private String foodName;
    private int foodCalories;

    public AnimalNot1(String name, String species, String foodName, int foodCalories) {
        this.name = name;
        this.species = species;
        this.foodName = foodName;
        this.foodCalories = foodCalories;
    }

    public void eat() {
        System.out.println(name + " is eating " + foodName);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound");
    }
    
    public static void main(String[] args) {
        AnimalNot1 animal = new AnimalNot1("dog", "husky", "rice", 250);
        animal.eat();
        animal.makeSound();
        animal.sleep();
        
        //output
        /*
        run:
        dog is eating rice
        dog is making a sound
        dog is sleeping
        */
        
    }
}
