public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    Channel channel;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void update(String video) {
        System.out.println("hi "+ name + ", " + video + " has been uploaded");
    }
}
