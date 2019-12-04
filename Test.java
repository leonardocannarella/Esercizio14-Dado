import java.awt.*;
import javax.swing.*;

public class Test{
	public static void main(String[] argv){
		Partita p = new Partita();
		MyFrame f = new MyFrame("Simulazione di un Dado");
		Container c = f.getContentPane(); 
		MyPanel panel = new MyPanel(p);
		c.add(panel);
		f.setLocation(200,100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}


	
