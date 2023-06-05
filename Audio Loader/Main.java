public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Jedco\\Desktop\\Audio\\" +
                "japanesekoto.wav";
        AudioLoader audioObject = new AudioLoader();
        audioObject.playAudio(filePath);
    }
}