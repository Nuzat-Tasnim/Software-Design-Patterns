public class offCommand implements Command {

    Reciever reciever;

    public offCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.offCommand();
    }

}
