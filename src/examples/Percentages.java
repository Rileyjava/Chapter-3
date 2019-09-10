package examples;

import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {

        double x;
        double y;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 2 numbers >>> ");
        x = keyboard.nextDouble();
        y = keyboard.nextDouble();
        computePercent(x, y);
    }
    public static void computePercent(double x, double y){

       double x1 =  x / y;
       System.out.println(x1 + " " + y);
    }
}
