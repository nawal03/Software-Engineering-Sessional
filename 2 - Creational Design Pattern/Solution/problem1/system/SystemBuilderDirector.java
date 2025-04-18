package problem1.system;

public class SystemBuilderDirector {
    SystemBuilder systemBuilder;
    public void construct(SystemBuilder systemBuilder, int count, String communication){
        this.systemBuilder = systemBuilder;
        systemBuilder.addDisplayUnit(count);
        systemBuilder.addController();
        systemBuilder.addCommunication(communication);
    }
}
