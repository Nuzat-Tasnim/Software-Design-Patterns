public class Division implements Operator{

    Operator nextOperation;

    @Override
    public void operation(Double x, Double y, String s) {
        if(s.contains("div"))
            System.out.println("ans :"+(x/y));
        else
            nextOperation.operation(x, y, s);
        System.out.println("Invalid operation");
    }

    @Override
    public void next(Operator op) {
        this.nextOperation = op;
    }
}
