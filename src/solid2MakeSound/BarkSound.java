/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid2MakeSound;

/**
 *
 * @author hoangvantiendat
 */
public class BarkSound implements makeSound {

    @Override
    public void makeSound(String name) {
        System.out.println(name + " is barking !");
    }
}
