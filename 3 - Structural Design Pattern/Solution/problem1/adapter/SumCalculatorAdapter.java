package problem1.adapter;

import problem1.calculator.SumCalculator;
import problem1.fileConverter.FileConverter;

import java.io.File;
import java.io.IOException;

public class SumCalculatorAdapter extends SumCalculator implements CustomSumCalculator {
    @Override
    public double calculate(File file) throws IOException{
        FileConverter fileConverter = new FileConverter();
        File newFile = fileConverter.convertFile(file);
        return super.calculate(newFile);
    }
}
