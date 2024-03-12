public class ServerFactory implements ComputerAbstractFactory{

    private String hdd;
    private String ram;
    private String cpu;

    @Override
    public Computer createComputer(String hdd,String ram,String cpu) {
        return new Server(hdd,ram,cpu);
    }
}
