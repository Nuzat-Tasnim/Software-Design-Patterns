public class MediaPlayerAdapter implements MediaPlayer{

    AdvancedMediaPlayer amp;
    @Override
    public void play(String name, String type) {
        amp = AdvancedMediaPlayerFactory.createPlayer(type);
    }
}
