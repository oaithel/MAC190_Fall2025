package com.mac190.temperature;

import java.text.NumberFormat;
import java.util.Scanner;

public class TempTester {
    public static void main(String[] args) {
        char answer = 'y';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press F to convert from Fahrenheit to celcius and C for the opposite");
            char choice = sc.next().charAt(0);
            //Create Temperature object
            Temperature temp = new Temperature();
            //3 cases --> 2 if-else
            if (Character.toLowerCase(choice) == 'f') {
                System.out.println("Enter your fahrenheit temp: ");
                temp.setTemperature( sc.nextDouble());
                temp.fahrenheitToCelcius();
                System.out.println("The temperature was: " + temp.getTemperature());
            } else if (Character.toLowerCase(choice) == 'c') {
                System.out.println("Enter your celcius temp:");
                temp.setTemperature(sc.nextDouble());
                temp.celciusToFahrenheit();
                System.out.println("The temperature was: " + temp.getTemperature());
            } else {
                System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue [Y/N]? ");
            answer = sc.next().charAt(0);
        }while(Character.toLowerCase(answer) == 'y');
    }
}
