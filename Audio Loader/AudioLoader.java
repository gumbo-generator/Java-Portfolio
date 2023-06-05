import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import java.io.File;

public class AudioLoader {
    void playAudio (String fileLocation) {
        try
        {
            File audioPath = new File(fileLocation);
            if (audioPath.exists()) {
                AudioInputStream buffer = AudioSystem.getAudioInputStream(audioPath);
                Clip c = AudioSystem.getClip();
                c.open(buffer);
                c.start();


                JOptionPane.showMessageDialog(null, "hello? can anyone hear me? :");

            } else {
               System.out.println("File not found.");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
