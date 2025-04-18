package problem1.item.communication;

public class CommunicationModuleFactory implements AbstractCommunicationFactory{
    public CommunicationModule getCommunicationModule(String connectivity){
        if(connectivity.equalsIgnoreCase("Wifi"))
            return new WifiModule();
        else if(connectivity.equalsIgnoreCase("Mobile"))
            return new SIMCard();
        else return null;
    }

    @Override
    public CommunicationService getCommunicationService(String communication) {
        return null;
    }
}
