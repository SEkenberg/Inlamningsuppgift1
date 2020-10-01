package Inlämningsuppgift1;

/**
 * Created by Simon Ekenberg
 * Date: 2020-09-29
 * Time: 14:14
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

abstract class Animal implements IFood {

    // Inkapsling
    private String name;
    private String type;
    private double weight;

    Animal (String name, String type,double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName () {
        return name;
    }
    public String getType (){
        return type;
    }

    public double getWeight (){
        return weight;
    }

}