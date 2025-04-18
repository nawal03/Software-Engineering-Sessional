package problem1.calculator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SumCalculator{
    public double calculate(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        double result=0;
        while(scanner.hasNextDouble()){
            result+=scanner.nextDouble();
        }
        return result;
    }
}
