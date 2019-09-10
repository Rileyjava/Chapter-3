package examples;

import java.util.Scanner;

public class NumbersDemo {

    public static void main(String[] args){

        int x;
        int y;



        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 2 numbers >>> ");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);
    }
    public static void displayTwiceTheNumber(int x, int y){

        int x2;
        int y2;

        x2 = x *2;
        y2 = y *2;
        System.out.println(x2 + " " + y2);
    }
    public static void displayNumberPlusFive(int x, int y){

     System.out.println(x + 5 + " " + y + 5);
    }
    public static void displayNumberSquared( int x, int y){

        int x2 = x * x;
        int y2 = y * y;

        System.out.println(x2 + " " + y2);
    }
}
