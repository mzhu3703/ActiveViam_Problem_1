package com.company;
import java.util.*;


public class Main {

    public static double var_calculator(double confidence, double[] test){
        List<Double> returnPercentage = new ArrayList();
        //gets the return percentage off of historical values
        for(int i = 0; i < test.length-1; i++){
            returnPercentage.add(Math.log(test[i]/test[i+1]) * 100);
        }
        double check = percentile(returnPercentage, confidence);
        return check;
    }

    //calculates percentile using nearest rank method
    public static double percentile(List<Double> values, double percentile) {
        Collections.sort(values);
        if(percentile == 0){
            return values.get(values.size()-1);
        }
        int index = (int) Math.ceil((percentile / 100) * values.size());
        return values.get(index - 1);
    }

    public static void main(String[] args) {
        double[] test = {151, 150, 149.99, 147.87, 147.92, 150.81, 150.44, 151.28, 150.96, 151.49, 150.02,
                148.96, 149.80, 152.57, 148.85, 149.32, 148.64, 148.69, 149.48, 149.26, 148.76};
        try {
            System.out.println("Welcome");
            System.out.println("To quit at anytime please type \"Q\". Enter a confidence level:");
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    double confidence = scan.nextDouble();
                    System.out.println("The VaR is " + var_calculator(100 - confidence, test));
                    System.out.println("Please enter another confidence level");
                } else {
                    String input = scan.next();
                    if (input.equalsIgnoreCase("Q")){
                        System.out.println("Exiting");
                        break;
                    }else {
                        System.out.println("You did not enter a valid value. Please enter a number or \"Q\" to quit.");
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Exiting Program.");

        }
    }

}


