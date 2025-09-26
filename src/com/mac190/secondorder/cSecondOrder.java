package com.mac190.secondorder;

public class cSecondOrder {
    double a, b, c;

    public void solve(){
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite number of solutions");
                } else {
                    System.out.println("No solution");
                }
            } else {
                System.out.println("This is a first order equation, solution: " + (-c / b));
            }
        } else {
            double D = Math.pow(b, 2) - 4 * a * c;
            if (D > 0) {
                double X1 = (-b + Math.sqrt(D)) / (2 * a);
                double X2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("There are two solutions: X1 = " + X1 + " X2 = " + X2);
            } else if (D == 0) {
                double X = -b / (2 * a);
                System.out.println("There is one double solution: " + X);
            } else { //D < 0
                System.out.println("There are no real solutions");

            }
        }
    }
}
