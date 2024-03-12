public class onCommand implements Command {

    Reciever reciever;

    public onCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.onCommand();
    }
}
