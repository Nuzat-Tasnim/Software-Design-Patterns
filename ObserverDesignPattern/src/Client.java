public class Client {
    public static void main(String[] args) {

        Channel channel = new Channel();

        Subscriber tisa = new Subscriber("tisa");
        Subscriber tapti = new Subscriber("tapti");
        Subscriber turna = new Subscriber("turna");

        channel.Subscribe(tisa);
        channel.Subscribe(tapti);
        channel.Subscribe(turna);

        channel.upload("Kai Mmh");

    }

}
