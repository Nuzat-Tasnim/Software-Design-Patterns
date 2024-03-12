public class EnergyLight implements Reciever{
    @Override
    public void onCommand() {
        System.out.println("Light is on");
    }

    @Override
    public void offCommand() {
        System.out.println("Light is off");
    }
}
