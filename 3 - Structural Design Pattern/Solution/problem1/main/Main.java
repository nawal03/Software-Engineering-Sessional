package problem1.main;

import problem1.adapter.CustomSumCalculator;
import problem1.adapter.SumCalculatorAdapter;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter filename: ");
            String filename = scanner.next();
            try{
                File file = new File(filename);
                CustomSumCalculator customSumCalculator = new SumCalculatorAdapter();
                System.out.println("Sum is "+ customSumCalculator.calculate(file));
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Something went wrong... Try again");
            }
        }
    }
}
