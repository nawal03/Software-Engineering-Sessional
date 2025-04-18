package problem1.item.display;

public class LEDMatrix implements Display{
    @Override
    public String getName() {
        return "LED Matrix";
    }

    @Override
    public double getPrice() {
        return 500.00;
    }
}
