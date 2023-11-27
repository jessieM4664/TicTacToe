import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class playSounds {
    
    public playSounds() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("src/sounds/click.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();
    }

    public void clickSound() {
        
    }

    public void winSound() {

    }
}
