import java.util.ArrayList;

public class Channel implements Subject{
    ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void Subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void Unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    @Override
    public void Notify(String video){
        for (Subscriber subscriber : subscribers){
            subscriber.update(video);
        }
    }

    public void upload(String video){
        Notify(video);
    }

}
