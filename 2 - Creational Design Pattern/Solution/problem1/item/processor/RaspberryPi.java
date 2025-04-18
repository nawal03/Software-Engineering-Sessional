package problem1.item.processor;

public class RaspberryPi implements Processor{
    @Override
    public String getName() {
        return "Raspberry Pi";
    }

    @Override
    public double getPrice() {
        return 100.00;
    }
}
