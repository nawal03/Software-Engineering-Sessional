package problem1.item.processor;

public class ATMega32 implements Processor{
    @Override
    public String getName() {
        return "ATMega32";
    }

    @Override
    public double getPrice() {
        return 50.00;
    }
}
