public class Fan implements Reciever{
    @Override
    public void onCommand() {
        System.out.println("Fan is on");
    }

    @Override
    public void offCommand() {
        System.out.println("Fan is off");
    }
}
