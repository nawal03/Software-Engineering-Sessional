package problem1.item.communication;

public class WifiModule implements CommunicationModule {
    @Override
    public String getName() {
        return "Wifi Module";
    }

    @Override
    public double getPrice() {
        return 25.00;
    }
}
