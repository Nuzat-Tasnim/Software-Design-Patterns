public class Client {
    public static void main(String[] args) {
        FcatoryProducer fp;
        fp = new FcatoryProducer(new MacFactory());
        fp.view();
    }
}
