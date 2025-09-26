package com.mac190.secondorder;

import java.util.Scanner;

public class SecondOrderTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer = 'y';
        do {
            //create acSecondOrder object
            cSecondOrder sec = new cSecondOrder();
            //read three coefficients from the user
            System.out.println("Enter the coefficients a,b and c in order: ");
            sec.a = sc.nextDouble();
            sec.b = sc.nextDouble();
            sec.c = sc.nextDouble();
            //Invoke the method solve on sec object
            sec.solve();

            System.out.println("Do you want to run again [y/n]?");
            answer = sc.next().charAt(0);
        }while(Character.toLowerCase(answer) == 'y');
    }
}
