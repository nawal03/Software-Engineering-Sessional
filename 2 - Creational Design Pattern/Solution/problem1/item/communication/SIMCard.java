package problem1.item.communication;

public class SIMCard implements CommunicationModule {
    @Override
    public String getName() {
        return "SIM Card";
    }

    @Override
    public double getPrice() {
        return 12.00;
    }
}
