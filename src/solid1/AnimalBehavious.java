/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid1;

/**
 *
 * @author hoangvantiendat
 */
public class AnimalBehavious {
    public void eat(Animal animal, Food food)
    {
        System.out.println(animal.getName() +  " is eating " + food.getNameFood());
    }
    
    public void sleep(Animal animal)
    {
        System.out.println(animal.getName() + " is sleeping");
    }
    
    public void makeSound(Animal animal)
    {
        System.out.println(animal.getName() + " is making a sound");
    }
    
}
