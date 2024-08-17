/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid2MakeSound;

/**
 *
 * @author hoangvantiendat
 */
public class Animal {
    private String name;
    private makeSound makeSound;

    public Animal(String name, makeSound makeSound) {
        this.name = name;
        this.makeSound = makeSound;
    }
    
    public void makeSound()
    {
        makeSound.makeSound(name);
    }
    
    
}
