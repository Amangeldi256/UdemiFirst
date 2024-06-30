package org.company.ExercisesUdemiTwoEightMine.Dimension;

public class RunDimension {
    public static void main(String[] args) {
        Dimension dim = new Dimension(25);
        System.out.println(dim.getFeet());    // Output: 2
        System.out.println(dim.getInches());  // Output: 1

        Dimension dim2 = new Dimension(-1);
        System.out.println(dim2.getFeet());    // Output: -1
        System.out.println(dim2.getInches());  // Output: -1
    }
}
