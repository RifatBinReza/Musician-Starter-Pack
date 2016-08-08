import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;


/**
 * @author Rifat Bin Reza
 * ID : 1511720042
 *
 */

abstract class Instruments extends JFrame{ 
	
	//This Class will be used for playing the instruments sounds
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AudioInputStream audioStream;
    Clip audioClip;
    
	void play(String audioFilePath) {
       File audioFile= new File(audioFilePath);
        
       if (audioClip != null && audioClip.isRunning()) {
           audioClip.stop();
       }
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            
            audioClip = AudioSystem.getClip();
 
            audioClip.open(audioStream);
             
            audioClip.start();
            
            
            
            
             
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
         
    }
	
	void stop(){
		audioClip.stop();
		
	}
	}

