/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid2MakeSound;

/**
 *
 * @author hoangvantiendat
 */
public class main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", new BarkSound());
        Animal linh = new Animal("Linh", new linhSound());
        dog.makeSound();
        linh.makeSound();
    }
}


/*
run:
dog is barking !
Linh is DAT oi em tuyet lam, em da Pass <3
*/





