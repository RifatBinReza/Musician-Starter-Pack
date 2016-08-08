import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Rifat Bin Reza
 * ID : 1511720042
 *
 */

//The Poser Test class!! Don't see the answers! :|

public class Quiz {
	
	
	public Quiz(){
		JFrame f=new JFrame();
		int result=0;
		JOptionPane.showMessageDialog(f, "Let's see how well you know about MUSIC!");
		String[] q1={"2004","2006","2008","2002"};
	    String quiz1=(String)JOptionPane.showInputDialog(f,"When did Artcell release their Second album 'Aniket Prantor'? ","Poser Test Q#1",JOptionPane.QUESTION_MESSAGE, null,q1,null);
	    
	    if(quiz1=="2006"){
	    	result+=1;
	    }
	    String[] q2={"Oshamajik","Patar Gaan","Shotto","Bijli"};
	    String quiz2=(String)JOptionPane.showInputDialog(f,"Which is the last Album of Warfaze?","Poser Test Q#2",JOptionPane.QUESTION_MESSAGE, null,q2,null);
	    if(quiz2=="Shotto"){
	    	result+=1;
	    }
	    String[] q3={"Shine bright like a diamond","You came in like a wreking ball","If i was your boyfriend","There's a lady"};
	    String quiz3=(String)JOptionPane.showInputDialog(f,"What is the first line of the song, 'Stairways to heaven'?","Poser Test Q#3",JOptionPane.QUESTION_MESSAGE, null,q3,null);
	    if(quiz3=="There's a lady"){
	    	result+=1;
	    }
	    String[] q4={"Metalica-Megadeth-Anthrax-Slayer","Maroon5-One Direction-Pink Floyd-coldplay","Sum41-Shunno-Studio58-Honey Singh","Rammstein-Metallica-Iron Maiden-Scorpion"};
	    String quiz4=(String)JOptionPane.showInputDialog(f,"What are the Big 4 metal bands?","Poser Test Q#4",JOptionPane.QUESTION_MESSAGE, null,q4,null);
	    if(quiz4=="Metalica-Megadeth-Anthrax-Slayer"){
	    	result+=1;
	    }
	    String[] q5={"Kanye West","Drake","Adam Levine","Dave Mustaine"};
	    String quiz5=(String)JOptionPane.showInputDialog(f,"Who is the vocal of a Heavy Metal Band?","Poser Test Q#5",JOptionPane.QUESTION_MESSAGE, null,q5,null);
	    if(quiz5=="Dave Mustaine"){
	    	result+=1;
	    }
	    String[] q6={"Joe Satriani","Slash","Kirk Hammett","Jimmy Page"};
	    String quiz6=(String)JOptionPane.showInputDialog(f,"Who is the guitarist of the band Guns N'Roses?","Poser Test Q#6",JOptionPane.QUESTION_MESSAGE, null,q6,null);
	    if(quiz6=="Slash"){
	    	result+=1;
	    }
	    String[] q7={"Mizanur Rahman Mizan","Robi Chowdhury","Sumon Patwary","Saidus Salehin Khaled"};
	    String quiz7=(String)JOptionPane.showInputDialog(f,"What is the real name of Bassbaba?","Poser Test Q#7",JOptionPane.QUESTION_MESSAGE, null,q7,null);
	    if(quiz7=="Saidus Salehin Khaled"){
	    	result+=1;
	    }
	    String[] q8={"AC/DC","Scorpions","Iron Maiden","Deep Purple"};
	    String quiz8=(String)JOptionPane.showInputDialog(f,"Which one is NOT an European band?","Poser Test Q#8",JOptionPane.QUESTION_MESSAGE, null,q8,null);
	    if(quiz8=="AC/DC"){
	    	result+=1;
	    }
	    String[] q9={"Seek and Destroy","Through the fire and flame","Hotline Bling","Chop suey!"};
	    String quiz9=(String)JOptionPane.showInputDialog(f,"Which one is a System Of A Down song?","Poser Test Q#9",JOptionPane.QUESTION_MESSAGE, null,q9,null);
	    if(quiz9=="Chop suey!"){
	    	result+=1;
	    }
	    String[] q10={"Beshi Joss Concert!","HeadBangers","RockNation","Concert for Bangladesh"};
	    String quiz10=(String)JOptionPane.showInputDialog(f,"Which one is a Bangladeshi Concert event?","Poser Test Q#10",JOptionPane.QUESTION_MESSAGE, null,q10,null);
	    if(quiz10=="RockNation"){
	    	result+=1;
	    }
	    
	    if(result>=10){
	    	JOptionPane.showMessageDialog(f, "Holy Shit! You can't EVER pass the METAL DETECTOR!! Music in your blood! \\m/","Result", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if(result>=7&&result<=9){
	    	JOptionPane.showMessageDialog(f, "You are anything but a POSER! You ROCK! :D","Result", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if(result>=5&&result<=6){
	    	JOptionPane.showMessageDialog(f, "Long way to go son! You're still a Poser! -_-","Result", JOptionPane.INFORMATION_MESSAGE);
	    }
	    if(result<=4){
	    	JOptionPane.showMessageDialog(f, "POSERRRR!! Don't pretend to be COOL when you're just another POSER!!","Result", JOptionPane.INFORMATION_MESSAGE);
	    }
	    f.dispose();
	    Main.f.setVisible(true);
	    
	}
}
