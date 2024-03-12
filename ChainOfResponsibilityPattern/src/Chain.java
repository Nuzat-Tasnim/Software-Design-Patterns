public class Chain {

    Operator op1 = new Addition();
    Operator op2 = new Subtraction();
    Operator op3 = new Multiply();
    Operator op4 = new Division();

    public Operator create(){

        op1.next(op2);
        op2.next(op3);
        op3.next(op4);

        return op1;
    }
}
