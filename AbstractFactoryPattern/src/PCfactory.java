public class PCfactory implements ComputerAbstractFactory{

    @Override
    public Computer createComputer(String hdd,String ram,String cpu) {
        return new PC(hdd,ram,cpu);
    }
}
