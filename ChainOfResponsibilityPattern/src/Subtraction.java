public class Subtraction implements Operator{

    Operator nextOperation;

    @Override
    public void operation(Double x, Double y, String s) {
        if(s.contains("sub"))
            System.out.println("ans :"+(x-y));
        else
            nextOperation.operation(x, y, s);
    }

    @Override
    public void next(Operator op) {
        this.nextOperation = op;
    }
}
