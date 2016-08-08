import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


 
/**
 * @author Rifat Bin Reza
 * ID : 1511720042
 *
 */
public class Drums extends Instruments {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton Back;
	private JButton snareButton;
    private JButton hiHatButton;
    private JButton kickButton;
    private JButton rideCymbalButton;
    private JButton crashCymbalButton;
    private JButton highTomButton;
    private JButton lowTomButton;
    private JButton hiHatOButton;
    private String snare="src/snare.wav";
    private String hiHat="src/hiHat.wav";
    private String kick="src/kick.wav";
    private String rideCymbal="src/rideCymbal.wav";
    private String crashCymbal="src/crashCymbal.wav";
    private String highTom="src/highTom.wav";
    private String lowTom="src/lowTom.wav";
    private String hiHatO="src/hiHatO.wav";
    private JFrame f=new JFrame();
    

    
    
    
    public Drums(){
    	
    
    //JLabel label2 = new JLabel();
    JLabel label = new JLabel();
    ImageIcon img = new ImageIcon("drumfinal.png");		//setting up the drum image
	label.setIcon(img);
	label.setVisible(true);
	f.add(label);
	
    snareButton=new JButton("Snare(C)");		//button er naam
    hiHatButton=new JButton("HiHat(F)");
    kickButton=new JButton("Kick(B)");
    rideCymbalButton=new JButton("Ride Cymbal(K)");
    crashCymbalButton=new JButton("Crash Cymbal(D)");
    highTomButton=new JButton("High Tom(J)");
    lowTomButton=new JButton("Low Tom(H)");
    hiHatOButton=new JButton("HiHat Open(G)");
    Back=new JButton("Back");
    
    //setting the jaygas
    snareButton.setBounds(10, 600, 120, 40);
    hiHatButton.setBounds(130, 600, 120, 40);
    kickButton.setBounds(250, 600, 120, 40);
    rideCymbalButton.setBounds(370, 600, 120, 40);
    crashCymbalButton.setBounds(490,600,130,40);
    highTomButton.setBounds(610,600,120,40);
    lowTomButton.setBounds(730,600,120,40);
    hiHatOButton.setBounds(850,600,120,40);
    Back.setBounds(0, 0, 80, 40);
    
    //code to set things exactly where i want
  	Insets insets = f.getInsets();
  	Dimension size = label.getPreferredSize();
  	//Dimension size2 = label2.getPreferredSize();
  	label.setBounds(insets.left,insets.top,size.width, size.height);
    //label2.setBounds(insets.left,680+insets.top,size2.width, size2.height);
    
  	
  	//adding everything on the frame
    f.add(snareButton);
    f.add(hiHatButton);
    f.add(kickButton);
    f.add(rideCymbalButton);
    f.add(crashCymbalButton);
    f.add(highTomButton);
    f.add(lowTomButton);
    f.add(hiHatOButton);
    f.add(Back);
	//f.add(label2);
	
    
    
    
	/*label2.setText("C : Snare    F : HiHat   B : kick    "
			+ "K : Ride Cymbal    D : Crash Cymbal    "
			+ "J : High Tom    H : Low Tom    "
			+ "G : HiHat Open");
	label2.setVisible(true); */
    
    //frame er properties
	f.setLayout(null);
    f.setVisible(true);
    f.setSize(1040,750);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setResizable(false);
    // f.setCursor(getCursor());
    
    //creating button handler and puting the handler in every button
    ButtonHandler handler = new ButtonHandler();
    
    snareButton.addActionListener(handler);
    hiHatButton.addActionListener(handler);
    kickButton.addActionListener(handler);
    rideCymbalButton.addActionListener(handler);
    hiHatOButton.addActionListener(handler);
    lowTomButton.addActionListener(handler);
    highTomButton.addActionListener(handler);
    crashCymbalButton.addActionListener(handler);
    Back.addActionListener(handler);
    
    
    //for keyboard input
    JPanel jp = new JPanel();
    f.add(jp);
    InputMap im = jp.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
    ActionMap am = jp.getActionMap();
    
    
	im.put(KeyStroke.getKeyStroke(KeyEvent.VK_C,0), "snare");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_F,0), "hiHat");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "kick");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_K, 0), "rideCymbal");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_D,0), "crashCymbal");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_H,0), "lowTom");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_J,0), "highTom");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_G,0), "hiHatO");

    am.put("snare", new key("snare"));
    am.put("hiHat", new key("hiHat"));
    am.put("kick", new key("kick"));
    am.put("rideCymbal", new key("rideCymbal"));
    am.put("crashCymbal", new key("crashCymbal"));
    am.put("lowTom", new key("lowTom"));
    am.put("highTom", new key("highTom"));
    am.put("hiHatO", new key("hiHatO"));
    
    
    }
    
    private class ButtonHandler implements ActionListener{
 	   
        // process play button events
  	   
        public void actionPerformed( ActionEvent actionEvent )
        {
           if ( actionEvent.getSource() == snareButton ) 
              play(snare); // play AudioClip once
           else if ( actionEvent.getSource() == hiHatButton ) 
              play(hiHat);
           else if ( actionEvent.getSource() == kickButton ) 
              play(kick);
           else if ( actionEvent.getSource() == rideCymbalButton)
          	play(rideCymbal);
           else if ( actionEvent.getSource() == crashCymbalButton)
             	play(crashCymbal);
           else if ( actionEvent.getSource() == lowTomButton)
             	play(lowTom);
           else if ( actionEvent.getSource() == highTomButton)
             	play(highTom);
           else if ( actionEvent.getSource() == hiHatOButton)
             	play(hiHatO);
           else if ( actionEvent.getSource() == Back){
        	   f.dispose();
        	   if (audioClip != null && audioClip.isRunning()) {
		           audioClip.stop();
		           stop();
        	   }
        	   Main.f.setVisible(true);
           }
        	   
        }
     } 
     
     private class key extends AbstractAction{
  	   /**
  	 * 
  	 */
  	private static final long serialVersionUID = 1L;
  	private String s;
  	   public key(String s){
  		   this.s=s;
  		   
  	   }
  	   //For playing with keyboard
  	   public void actionPerformed(ActionEvent keyevt){
  		   
  		   if ( s.equalsIgnoreCase("snare")) 
  	            play(snare);
  	         else if ( s.equalsIgnoreCase("hiHat")) 
  	            play(hiHat);
  	         else if ( s.equalsIgnoreCase("kick") ) 
  	            play(kick);
  	         else if ( s.equalsIgnoreCase("rideCymbal"))
  	        	play(rideCymbal);
  	         else if ( s.equalsIgnoreCase("crashCymbal"))
 	        	play(crashCymbal);
  	         else if ( s.equalsIgnoreCase("lowTom"))
	        	play(lowTom);
  	         else if ( s.equalsIgnoreCase("highTom"))
	        	play(highTom);
  	         else if ( s.equalsIgnoreCase("hiHatO"))
  	        	play(hiHatO);
  		   
  	   }
  	   
  	   
     }
  
}