package problem1.item.communication;

public class WifiService implements CommunicationService {
    @Override
    public String getName() {
        return "Yearly Wifi Service";
    }

    @Override
    public double getPrice() {
        return 100.00;
    }
}
