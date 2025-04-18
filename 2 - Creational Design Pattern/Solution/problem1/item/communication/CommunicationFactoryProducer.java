package problem1.item.communication;

public class CommunicationFactoryProducer {
    public static AbstractCommunicationFactory getAbstractCommunicationFactory(String type){
        if(type.equalsIgnoreCase("Service")) return new CommunicationServiceFactory();
        else if(type.equalsIgnoreCase("Module")) return new CommunicationModuleFactory();
        else return null;
    }
}
