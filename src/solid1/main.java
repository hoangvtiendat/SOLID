/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid1;

/**
 *
 * @author hoangvantiendat
 */
public class main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", "husky");
        Food meat = new Food("rice", 250);
        AnimalBehavious animalBehavious = new AnimalBehavious ();
        
        animalBehavious.eat(dog, meat);
        animalBehavious.makeSound(dog);
        animalBehavious.sleep(dog);
        
    }
    
     //output
        /*
        run:
        dog is eating rice
        dog is making a sound
        dog is sleeping
        */
}
