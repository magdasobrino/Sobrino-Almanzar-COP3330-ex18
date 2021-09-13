/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args){

        String choice, temperatureString = "";
        int temperature, convertedTemperature = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        choice = scnr.next();

        if(choice.equalsIgnoreCase("C")){
            System.out.println("Please enter the temperature in Fahrenheit:");
            temperature = scnr.nextInt();

            convertedTemperature = (temperature - 32) * 5 / 9;
            temperatureString = "Celsius";
        }

        if(choice.equalsIgnoreCase("F")){
            System.out.println("Please enter the temperature in Celsius:");
            temperature = scnr.nextInt();

            convertedTemperature = (temperature * 9 / 5) + 32;
            temperatureString = "Fahrenheit";
        }

        System.out.println("The temperature in " + temperatureString + " is " + convertedTemperature);

        System.exit(0);
    }//end of main

}//end of program