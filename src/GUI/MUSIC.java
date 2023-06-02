package GUI;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MUSIC {
private static Clip clip; 

public static void Runmusic(String filepath){
	    try {
	            AudioInputStream InputStream = AudioSystem.getAudioInputStream(new File(filepath));
	            clip = AudioSystem.getClip( );
	            clip.open(InputStream);
	            clip.loop(Clip.LOOP_CONTINUOUSLY);
	            clip.start();    
	            }

	        catch(Exception e)  {
	            e.printStackTrace();
	        }
	}
	 public static  void stopmusic(){
	    clip.stop();
	 }
}






	
	
	

