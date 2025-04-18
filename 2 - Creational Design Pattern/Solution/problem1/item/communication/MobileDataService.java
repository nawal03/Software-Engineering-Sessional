package problem1.item.communication;

public class MobileDataService implements CommunicationService{
    @Override
    public String getName() {
        return "Yearly Mobile Data Service";
    }

    @Override
    public double getPrice() {
        return 200.00;
    }
}
