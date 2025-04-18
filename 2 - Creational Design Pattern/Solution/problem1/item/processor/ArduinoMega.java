package problem1.item.processor;

public class ArduinoMega implements Processor{
    @Override
    public String getName() {
        return "Arduino Mega";
    }

    @Override
    public double getPrice() {
        return 75.00;
    }
}
