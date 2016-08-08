import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;


/**
 * @author Rifat Bin Reza
 * ID : 1511720042
 *
 */


public class Piano extends Instruments{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton aB;
	private JButton asB;
	private JButton bB;
	private JButton cB;
	private JButton csB;
	private JButton dB;
	private JButton dsB;
	private JButton eB;
	private JButton fB;
	private JButton fsB;
	private JButton gB;
	private JButton gsB;
	private JButton Back;
	
	private String a="A.wav";
	private String as="A#.wav";
	private String b="B.wav";
	private String c="C.wav";
	private String cs="C#.wav";
	private String d="D.wav";
	private String ds="D#.wav";
	private String e="E.wav";
	private String f="F.wav";
	private String fs="F#.wav";
	private String g="G.wav";
	private String gs="G#.wav";
	
	private JFrame frame;
	
	public Piano(){
		
		frame= new JFrame();
		aB= new JButton("A");
		asB=new JButton("A#");
		bB=new JButton("B");
		cB=new JButton("C");
		csB=new JButton("C#");
		dB=new JButton("D");
		dsB=new JButton("D#");
		eB=new JButton("E");
		fB=new JButton("F");
		fsB=new JButton("F#");
		gB=new JButton("G");
		gsB=new JButton("G#");
		Back=new JButton("Back");
		
		frame.add(gsB);
		frame.add(asB);
		frame.add(csB);
		frame.add(dsB);
		frame.add(fsB);
		frame.add(aB);
		frame.add(bB);
		frame.add(cB);
		frame.add(cB);
		frame.add(dB);
		frame.add(eB);
		frame.add(fB);
		frame.add(gB);
		frame.add(Back);
		
		//shundor kore pianor setting e button shajano
		cB.setBounds(50, 30, 60, 300);
		csB.setBounds(80, 30, 60, 160);
		dB.setBounds(110, 30, 60, 300);
		dsB.setBounds(140, 30, 60, 160);
		eB.setBounds(170, 30, 60, 300);
		fB.setBounds(230, 30, 60, 300);
		fsB.setBounds(260, 30, 60, 160);
		gB.setBounds(290, 30, 60, 300);
		gsB.setBounds(320, 30, 60, 160);
		aB.setBounds(350, 30, 60, 300);
		asB.setBounds(380, 30, 60, 160);
		bB.setBounds(410, 30, 60, 300);
		Back.setBounds(0, 0, 100, 25);
		
		//frame er kabjab
		frame.setLayout(null);
	    frame.setVisible(true);
	    frame.setSize(530,400);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(false);
	    frame.setBackground(Color.BLACK);
	    
	    ButtonHandler handler = new ButtonHandler();
	    aB.addActionListener(handler);
	    asB.addActionListener(handler); //adding the handlers to the buttons
	    bB.addActionListener(handler);
	    cB.addActionListener(handler);
	    csB.addActionListener(handler);
	    dB.addActionListener(handler);
	    dsB.addActionListener(handler);
	    eB.addActionListener(handler);
	    fB.addActionListener(handler);
	    fsB.addActionListener(handler);
	    gB.addActionListener(handler);
	    gsB.addActionListener(handler);
	    Back.addActionListener(handler);
	    
	    JPanel jp = new JPanel();
	    frame.add(jp);
	    InputMap im = jp.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
	    ActionMap am = jp.getActionMap();
	    
	    
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "c"); //keyevents for keys(can be changed)
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "d");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "e");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_F, 0), "f");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_G, 0), "g");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_H, 0), "a");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_J, 0), "b");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "cs");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_E, 0), "ds");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_T, 0), "fs");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, 0), "gs");
	    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_U, 0), "as");

	    am.put("a", new key("a")); //put all key
	    am.put("as", new key("as"));
	    am.put("b", new key("b"));
	    am.put("c", new key("c"));
	    am.put("cs", new key("cs"));
	    am.put("d", new key("d"));
	    am.put("ds", new key("ds"));
	    am.put("e", new key("e"));
	    am.put("f", new key("f"));
	    am.put("fs", new key("fs"));
	    am.put("g", new key("g"));
	    am.put("gs", new key("gs"));
	    
	    
	    
	    
	    
		
		
	}
	
	
	private class ButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			if(event.getSource()==aB)
				play(a);
			else if(event.getSource()==asB)
				play(as);
			else if(event.getSource()==bB)
				play(b);
			else if(event.getSource()==cB)
				play(c);
			else if(event.getSource()==csB)
				play(cs);
			else if(event.getSource()==dB)
				play(d);
			else if(event.getSource()==dsB)
				play(ds);
			else if(event.getSource()==eB)
				play(e);
			else if(event.getSource()==fB)
				play(f);
			else if(event.getSource()==fsB)
				play(fs);
			else if(event.getSource()==gB)
				play(g);
			else if(event.getSource()==gsB)
				play(gs);
			else if(event.getSource()==Back){
				frame.dispose();
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
		
		public void actionPerformed(ActionEvent keyevent){
			
			if(s.equalsIgnoreCase("a"))
				play(a);
			else if(s.equals("as"))
				play(as);
			else if(s.equals("b"))
				play(b);
			else if(s.equals("c"))
				play(c);
			else if(s.equals("cs"))
				play(cs);
			else if(s.equals("d"))
				play(d);
			else if(s.equals("ds"))
				play(ds);
			else if(s.equals("e"))
				play(e);
			else if(s.equals("f"))
				play(f);
			else if(s.equals("fs"))
				play(fs);
			else if(s.equals("g"))
				play(g);
			else if(s.equals("gs"))
				play(gs);
		}
		
	}
	
	
	
	

}
