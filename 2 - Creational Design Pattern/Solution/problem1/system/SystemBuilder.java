package problem1.system;

public interface SystemBuilder {
    public void addDisplayUnit(int count);
    public void addController();
    public void addCommunication(String communication);
    public QMSystem getQMSystem();
}
