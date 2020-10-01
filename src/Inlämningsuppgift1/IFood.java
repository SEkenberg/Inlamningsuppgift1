package Inlämningsuppgift1;

/**
 * Created by Simon Ekenberg
 * Date: 2020-09-29
 * Time: 15:11
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

public interface IFood {
    void printMe();


    //Skapar ENUM FoodKind som man hittar i Snake, Dog och Cat-klassen
    enum FoodKind{
        DOGFOOD(100, "hundfoder"),
        CATFOOD(150, "kattfoder"),
        SNAKEFOOD(20, "ormpellets");

        public int foodIndex;
        public String foodType;

        FoodKind(int fIndex, String fType){
            foodIndex = fIndex;
            foodType = fType;
        }
    }
}
