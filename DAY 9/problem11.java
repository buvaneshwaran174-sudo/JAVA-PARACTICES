class MediaPlayer {

    void play() {
        System.out.println("Playing Media");
    }
}

class AudioPlayer extends MediaPlayer {

    @Override
    void play() {
        System.out.println("Playing Audio");
    }
}

class VideoPlayer extends MediaPlayer {

    @Override
    void play() {
        System.out.println("Playing Video");
    }
}

public class Main {

    public static void main(String[] args) {

        MediaPlayer player;

        player = new AudioPlayer();
        player.play();

        player = new VideoPlayer();
        player.play();
    }
}