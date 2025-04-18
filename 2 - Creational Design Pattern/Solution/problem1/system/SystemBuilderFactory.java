package problem1.system;

public class SystemBuilderFactory {
    public SystemBuilder getSystemBuilder(String pack){
        if(pack.equalsIgnoreCase("deluxe")) return new DeluxeSystem();
        else if(pack.equalsIgnoreCase("optimal")) return new OptimalSystem();
        else if(pack.equalsIgnoreCase("poor")) return new PoorSystem();
        else return null;
    }
}
