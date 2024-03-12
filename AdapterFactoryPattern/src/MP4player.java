public class MP4player implements AdvancedMediaPlayer{
    @Override
    public void run(String name, String type) {
        System.out.println("Playing "+name+"."+type);
    }
}
