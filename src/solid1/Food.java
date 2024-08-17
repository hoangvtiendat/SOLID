/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid1;

/**
 *
 * @author hoangvantiendat
 */
class Food {
    private String nameFood;
    private double calories;
    
    public Food(String nameFood, double calories)
    {
        this.nameFood = nameFood;
        this.calories = calories;
    }
    
    public String getNameFood()
    {
        return nameFood;
    }
    
    public double getCalories()
    {
        return calories;
    }
}
