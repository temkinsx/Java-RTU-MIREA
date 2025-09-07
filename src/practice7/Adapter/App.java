package practice7.Adapter;


public class App {
    public static void main(String[] args) {
        MediaPlayer mp3 = new MP3Player();
        MediaPlayer wav = new WAVtoMP3Adapter();

        String mp3file = "track1.mp3";
        String wavfile = "track2.wav";

        mp3.play(mp3file);
        wav.play(wavfile);

        mp3.play(wavfile);
        wav.play(mp3file);


    }
}
