import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Your temperature: ");
        String temp = in.nextLine();

        System.out.print("C or F? ");
        String letter = in.nextLine().toLowerCase();

        // C = (a - 32) x 5 / 9
        // F = ( C x 9 / 5 ) + 32


        int a = Integer.parseInt(temp);

        if(letter.equals("c")){
            int b = (a - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + b);
        }
        if(letter.equals("f")){
            int c = (a * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is " + c);
        }
    }

}
