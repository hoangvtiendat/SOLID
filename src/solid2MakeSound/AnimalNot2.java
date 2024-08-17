/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid2MakeSound;

/**
 *
 * @author hoangvantiendat
 */
public class AnimalNot2 {

    private String name;

    public AnimalNot2(String name) {
        this.name = name;
    }

    public void makeSound() {
        if (name.equals("Dog")) {
            System.out.println(name + " barks.");
        } else if (name.equals("Cat")) {
            System.out.println(name + " meows.");
        } else if (name.equals("Linh")) {
            System.out.println("Dat oi EM TUYET LAM");
        } else {
            System.out.println(name + " makes an unknown sound.");
        }
    }

    public static void main(String[] args) {
        AnimalNot2 dog = new AnimalNot2("Dog");
        dog.makeSound();

        AnimalNot2 linh = new AnimalNot2("Linh");
        linh.makeSound();

    }
}

/*
run:
Dog barks.
Dat oi EM TUYET LAM
*/



