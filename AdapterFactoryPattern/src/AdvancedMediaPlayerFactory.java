public class AdvancedMediaPlayerFactory {
    public static AdvancedMediaPlayer createPlayer(String type){
        if(type.equalsIgnoreCase("vlc")) return new VLCplayer();
        else if(type.equalsIgnoreCase("mp4")) return new MP4player();
        else return null;
    }
}
