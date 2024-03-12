public class AbstractFactory {

    public Computer getComputer(ComputerAbstractFactory caf,String hdd,String ram,String cpu){
        return caf.createComputer(hdd,ram,cpu);
    }
}
