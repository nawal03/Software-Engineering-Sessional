package problem1.item.communication;

public interface AbstractCommunicationFactory {
    public CommunicationModule getCommunicationModule(String communication);
    public CommunicationService getCommunicationService(String communication);
}
