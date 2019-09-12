package examples;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args){
        double gallons;
        int length;
        int width;
        int height;
        Scanner keyboard = new Scanner(System.in);
       System.out.println(" what is the height");
        height = keyboard.nextInt();
        System.out.println(" what is the width");
        width = keyboard.nextInt();
        System.out.println(" what is the length");
        length = keyboard.nextInt();
        calculateArea(height, width, length);

    }

    public static void calculateArea(double height, double width, double length){
         double gallons;
         double totalSq;
        totalSq = (length * height * 2 + width * height * 2);
        gallons = Math.ceil(totalSq/350);
        System.out.println(" totalSq " + totalSq);
        System.out.println(" number of gallons " + gallons);
        setPrice(gallons);
    }
    public static void setPrice(double gallons){
        int pricePerGallon = 32;
        int total = (int) (pricePerGallon * gallons);
        System.out.println("  Total price is " + total);
    }

}
