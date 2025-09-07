package practice7.Adapter;

public class WAVtoMP3Adapter implements MediaPlayer {
    private final WAVPlayer wavPlayer = new WAVPlayer();

    @Override
    public void play(String filename) {
        if(!filename.endsWith(".wav")) {
            System.out.println("Адаптер WavToMP3: неподдерживаемый формат " + filename);
            return;
        }
        wavPlayer.playWAV(filename);
    }
}
