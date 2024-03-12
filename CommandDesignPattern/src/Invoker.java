import java.util.ArrayList;
import java.util.List;

public class Invoker {
    ArrayList<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command c) {
        commandList.add(c);
    }
    public void pressButton(){
        for (Command c : commandList){
            c.execute();
        }
    }
}
