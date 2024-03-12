public class Client {
    public static void main(String[] args) {

        Command c1 = new onCommand(new EnergyLight());
        Command c2 = new offCommand(new EnergyLight());
        Command c3 = new onCommand(new Fan());
        Command c4 = new offCommand(new Fan());

        Invoker invoker = new Invoker();
        invoker.addCommand(c1);
        invoker.addCommand(c2);
        invoker.addCommand(c3);
        invoker.addCommand(c4);

        invoker.pressButton();
    }
}
