public class VLCplayer implements AdvancedMediaPlayer{

    @Override
    public void run(String name, String type) {
        System.out.println("Playing "+name+"."+type);
    }
}
