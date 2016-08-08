import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 * @author Rifat Bin Reza
 * ID : 1511720042
 *
 */



public class GuitarTuner extends Instruments{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String E="GT_E.wav";
	private String B="GT_B.wav";
	private String G="GT_G.wav";
	private String D="GT_D.wav";
	private String A="GT_A.wav";
	private String e="GT_ee.wav";
	private JButton Ebutton,Bbutton,Gbutton,Dbutton,Abutton,ebutton,infoButton,Back;
	private JFrame f;
	private JLabel label;
	private String infoText="Look for the button that says E (low) and click it. Now pluck the low E string (sixth string, thickest see figure 1.b below) on your guitar. If your low E is in tune with the guitar tuners E it will sound in unison or perfect, if it is out of tune it will sound dissonant or imperfect and you will need to tune up or down until you hear unison. Now continue this process for the fifth string which is A, then onto the D string etc etc right up to the high E string. Now go back to the low E string and pluck it, make sure it is accurately tuned to the online tuner. If your low E string is still in tune then your guitar is fully tuned, if when you go back and find the low E string is out of tune, you will have to go through each string again right up to the high E string (this is caused by flexing of the neck).";
	
	
	public GuitarTuner(){
		
		
		f = new JFrame();
		label = new JLabel();
		
		ImageIcon img = new ImageIcon("Tuner.jpg");
		label.setIcon(img);
		label.setVisible(true);
		f.add(label);
		
		
		Ebutton= new JButton("E");
		Bbutton= new JButton("B");
		Gbutton= new JButton("G");
		Dbutton= new JButton("D");
		Abutton= new JButton("A");
		ebutton= new JButton("e");
		infoButton= new JButton("Menual");
		Back=new JButton("Back");
		
		f.add(Ebutton);
		f.add(Bbutton);
		f.add(Gbutton);
		f.add(Dbutton);
		f.add(Abutton);
		f.add(ebutton);
		f.add(infoButton);
		f.add(Back);
		
		Ebutton.setBounds(120, 520, 100, 100);
		Bbutton.setBounds(780, 350, 100, 100);
		Gbutton.setBounds(780, 180, 100, 100);
		Dbutton.setBounds(120, 180, 100, 100);
		Abutton.setBounds(120, 350, 100, 100);
		ebutton.setBounds(780, 520, 100, 100);
		infoButton.setBounds(1,100,100,100);
		Back.setBounds(1, 1, 100, 100);
		
		//code to set things exactly where i want
		Insets insets = f.getInsets();
		Dimension size = label.getPreferredSize();
		label.setBounds(230 + insets.left, 50 + insets.top,
		             size.width, size.height);
		
		
		
		
		f.setLayout(null);
	    f.setVisible(true);
	    f.setSize(1000,1000);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setResizable(false);
	    f.setBackground(Color.WHITE);
	    
	    ButtonHandler handler = new ButtonHandler();
	    Ebutton.addActionListener(handler);
	    Bbutton.addActionListener(handler); //add all the buttonhandlers
	    Gbutton.addActionListener(handler);
	    Dbutton.addActionListener(handler);
	    Abutton.addActionListener(handler);
	    ebutton.addActionListener(handler);
	    infoButton.addActionListener(handler);
	    Back.addActionListener(handler);
	    
	    
	    
	    
	    
	}
	    private class ButtonHandler implements ActionListener{
	    
			public void actionPerformed(ActionEvent event){
				
				if(event.getSource()==Ebutton)
					play(E);
				else if(event.getSource()==Bbutton)
					play(B);
				else if(event.getSource()==Gbutton)
					play(G);
				else if(event.getSource()==Dbutton)
					play(D);
				else if(event.getSource()==Abutton)
					play(A);
				else if(event.getSource()==ebutton)
					play(e);
				else if(event.getSource()==infoButton){
					JOptionPane.showMessageDialog(null, wrapText(infoText), "Menual", JOptionPane.PLAIN_MESSAGE);		
					}
				else if(event.getSource()==Back){
					f.dispose();
					if (audioClip != null && audioClip.isRunning()) {
				           audioClip.stop();
				           stop();
					}
					Main.f.setVisible(true);
				}
			}
		
	}
	    
	   
	    //this code is for wraping the text in info message box
	    public String wrapText(String passedStr)
	    {
	        
	          final short LINE_LENGTH = 80;
	          int nextCR = LINE_LENGTH;
	          StringBuffer newStr = new StringBuffer(passedStr);
	          
	          // read the whole string
	          for (int i = 0; i < newStr.length(); i++)
	          {
	               if (newStr.charAt(i) == '\n' || newStr.charAt(i) == '\r')
	                    nextCR = i + LINE_LENGTH;
	               if (newStr.charAt(i) == ' ' && i >= nextCR)
	               {
	                    newStr.insert((i + 1), "\n");
	                    nextCR += LINE_LENGTH;
	               }
	          }

	          return newStr.toString();
	     }

}
