public class Addition implements Operator{

    Operator nextOperation;

    @Override
    public void operation(Double x, Double y, String s) {
        if(s.contains("add"))
            System.out.printf("ans :"+ (x+y));
        else
            nextOperation.operation(x, y, s);
    }

    @Override
    public void next(Operator op) {
        this.nextOperation = op;
    }
}
