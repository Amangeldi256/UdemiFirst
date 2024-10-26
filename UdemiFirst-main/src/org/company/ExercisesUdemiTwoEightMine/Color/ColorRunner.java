package org.company.ExercisesUdemiTwoEightMine.Color;

public class ColorRunner {
    public static void main(String[] args) {
        Color color = new Color(255, 0, 0);
        System.out.println(color.getRed());   // Prints: 255
        System.out.println(color.getGreen()); // Prints: 0
        System.out.println(color.getBlue());  // Prints: 0
        color.invert();
        System.out.println(color.getRed());   // Prints: 0
        System.out.println(color.getGreen()); // Prints: 255
        System.out.println(color.getBlue());  // Prints: 255


        Color color1 = new Color(0, 255, 0);
        color1.invert();
        System.out.println(color1.getGreen()); // Prints: 0

        Color color3 = new Color(128, 128, 128);
        color.invert();
        System.out.println(color3.getRed());   // Prints: 127
        System.out.println(color3.getGreen()); // Prints: 127
        System.out.println(color3.getBlue());  // Prints: 127
    }
}
