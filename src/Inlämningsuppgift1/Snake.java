package Inlämningsuppgift1;
import javax.swing.*;
/**
 * Created by Simon Ekenberg
 * Date: 2020-09-29
 * Time: 14:15
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Snake extends Animal{

    public Snake (String name, String type, double weight){

        super (name,type, weight);
    }

    public double getFoodWeight() {

        return FoodKind.SNAKEFOOD.foodIndex;
    }

    @Override
    public void printMe() {
        JOptionPane.showMessageDialog(null, getType() + " " +
                getName() + " ska ha " + getFoodWeight() + "(g) " + FoodKind.SNAKEFOOD.foodType + " att äta.");
    }
}
