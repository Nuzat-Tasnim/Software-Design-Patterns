public class Client {
    public static void main(String Args[]) {
        Computer c1,c2;
        AbstractFactory fact = new AbstractFactory();
        c1 = fact.getComputer(new PCfactory(),"SSD","8GB","Toshiba");
        c2 = fact.getComputer(new ServerFactory(),"SSD","8GB","Toshiba");

        c1.view();
        c2.view();
    }
}
