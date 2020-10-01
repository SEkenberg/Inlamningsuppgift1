package Inlämningsuppgift1;
import javax.swing.*;

/**
 * Created by Simon Ekenberg
 * Date: 2020-09-29
 * Time: 14:14
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

public class Mainprogram {
    //Skapar ENUM
    public enum AnimalName {SIXTEN, DOGGE, VENUS, OVE, HYPNO}

    public static void main(String[] args) {
        Dog Sixten = new Dog("Sixten","Hunden", 5000);
        Dog Dogge = new Dog("Dogge","Hunden", 10000);
        Cat Venus = new Cat("Venus","Katten", 5000);
        Cat Ove = new Cat("Ove","Katten", 3000);
        Snake Hypno = new Snake("Hypno","Ormen", 1000);

        while (true) {

            String s = JOptionPane.showInputDialog("Vad heter djuret du vill mata?");

            try {
                AnimalName an = Enum.valueOf(AnimalName.class, s.toUpperCase());

                switch (an) {

                    //Användning av ENUM
                    //Användning av polymorfism
                    case SIXTEN -> Sixten.printMe();
                    case DOGGE -> Dogge.printMe();
                    case VENUS -> Venus.printMe();
                    case OVE -> Ove.printMe();
                    case HYPNO -> Hypno.printMe();
                }
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Det finns inget djur på hotellet som heter så.\n" +
                        "Testa igen");
            }
        }
    }
}
