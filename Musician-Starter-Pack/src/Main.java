import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 * @author Rifat Bin Reza
 * ID : 1511720042
 *
 */

public class Main {
	
	
	private static JButton drumButton;
	private static JButton pianoButton;
	private static JButton tunerButton;
	private static JButton quizButton;
	static JFrame f = new JFrame("Music Starter Pack v1.2");
	
	 public static void main(String[] args) {
		 
		 String Lines = "Are you ready to for the Ultimate challenge?\nCan you take the humiliation at the end?\nEnter The Arena of Poser Test!->>";
		 drumButton = new JButton("BE The Drummer!");
		 pianoButton = new JButton("Play The Piano!");
		 tunerButton = new JButton("Tune Your Guitar! Yes, it's EASY!");
		 quizButton = new JButton("<html>" + Lines.replaceAll("\\n", "<br>") + "</html>");	//button label ek line e na atle ei bebostha nea lagbe
		 
		 
		 f.add(drumButton);
		 f.add(pianoButton);
		 f.add(tunerButton);
		 f.add(quizButton);
		 f.setVisible(true);
		 f.setSize(516, 530);
		 f.setLayout(null);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ButtonHandler handler = new ButtonHandler();
		 
		 drumButton.setBounds(0,0,250,250);
		 pianoButton.setBounds(250,0,250,250);
		 tunerButton.setBounds(0,250,250,250);
		 quizButton.setBounds(250,250,250,250);
		 
		 drumButton.addActionListener(handler);
		 pianoButton.addActionListener(handler);
		 tunerButton.addActionListener(handler);
		 quizButton.addActionListener(handler);
	 }
	 
	
		private static class ButtonHandler implements ActionListener{
		 	   
	        
	  	   
	        public void actionPerformed( ActionEvent actionEvent )
	        {
	           if ( actionEvent.getSource() == drumButton ) {
	        	  f.dispose();
	              new Drums();
	              
	           }
	           else if ( actionEvent.getSource() == pianoButton ){
	              f.dispose();
	              new Piano();
	           }
	           else if ( actionEvent.getSource() == tunerButton ){
	        	   f.dispose();
	              new GuitarTuner();
	           }
	           else if(actionEvent.getSource()==quizButton){
	        	   f.setVisible(false);
	        	   new Quiz();
	        	   
	           }
	           
	          
	        } 
	     } 

}

