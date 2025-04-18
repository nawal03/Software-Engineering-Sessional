package problem1.system;

import problem1.item.communication.*;
import problem1.item.controller.Controller;
import problem1.item.display.LEDMatrix;
import problem1.item.processor.ATMega32;

public class PoorSystem implements SystemBuilder{
    private QMSystem qmSystem = new QMSystem();
    @Override
    public void addDisplayUnit(int count) {
        for(int i=0;i<count;i++){
            qmSystem.addItem(new ATMega32());
            qmSystem.addItem(new LEDMatrix());
        }
    }

    @Override
    public void addController() {
        qmSystem.addItem(new Controller());
    }

    @Override
    public void addCommunication(String communication) {
        AbstractCommunicationFactory communicationFactory = CommunicationFactoryProducer.getAbstractCommunicationFactory("module");
        CommunicationModule communicationModule = communicationFactory.getCommunicationModule(communication);
        qmSystem.addItem(communicationModule);
        communicationFactory = CommunicationFactoryProducer.getAbstractCommunicationFactory("service");
        CommunicationService communicationService = communicationFactory.getCommunicationService(communication);
        qmSystem.addItem(communicationService);
    }

    @Override
    public QMSystem getQMSystem() {
        return qmSystem;
    }
}
