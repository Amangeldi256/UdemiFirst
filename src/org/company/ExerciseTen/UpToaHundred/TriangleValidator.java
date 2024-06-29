package org.company.ExerciseTen.UpToaHundred;

public class TriangleValidator {
    /*public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("Only positive numbers must be!");
            return false;
        } else if (angle1 + angle2+ angle3 == 180) {
            return true;
        } else {
            return false;
        }
    }*/


    public boolean rightangled(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Only positive numbers must be!");
            return false;
        } else if ((side1 * side1) + (side2 * side2) == (side3 * side3)) {
            return true;
        } else {
            return false;
        }
    }
}
