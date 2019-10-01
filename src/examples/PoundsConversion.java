package examples;

import java.util.Scanner;

public class PoundsConversion {

        public static void main(String[] args){
            double lbs;


            Scanner keyboard = new Scanner(System.in);
            System.out.println(" Enter num of lbs");
            lbs = keyboard.nextInt();
            calculatekilograms(lbs);
            poundsToOunces(lbs);
            poundsToMilligrams(lbs);
         }
         public static void calculatekilograms(double lbs){
             double numKilogramsToLBS = 0.45;
             double conversion = numKilogramsToLBS * lbs;
             System.out.println(" The number of Lbs is " + lbs + " equals " +
                     conversion + " number of Kilograms ");
         }
         public static void poundsToOunces(double lbs){
            double numOuncesToLbs = 16;
            double conversion = numOuncesToLbs * lbs;
             System.out.println(" The number of Lbs is " + lbs + " equals " +
                     conversion + " number of ounces ");
         }
         public static void poundsToMilligrams(double lbs){
             double numMilligramsToLbs = 453592;
             double conversion = numMilligramsToLbs * lbs;
             System.out.println(" The number of Lbs is " + lbs + " equals " +
                     conversion + " number of milligrams ");
         }
}
