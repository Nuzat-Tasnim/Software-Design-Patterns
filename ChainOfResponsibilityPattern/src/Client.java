public class Client {
    public static void main(String[] args) {
        Chain c = new Chain();
        Operator op = c.create();
        op.operation(12.0,2.0,"div1");
    }
}
