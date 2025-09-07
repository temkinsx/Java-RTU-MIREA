package practice7.Adapter;

public class MP3Player implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("MP3 Player: проигрывается " + filename);
    }
}
