package problem1.item.communication;

public class CommunicationServiceFactory implements AbstractCommunicationFactory{
    @Override
    public CommunicationModule getCommunicationModule(String communication) {
        return null;
    }

    public CommunicationService getCommunicationService(String connectivity){
        if(connectivity.equalsIgnoreCase("Wifi"))
            return new WifiService();
        else if(connectivity.equalsIgnoreCase("Mobile"))
            return new MobileDataService();
        else return null;
    }
}
