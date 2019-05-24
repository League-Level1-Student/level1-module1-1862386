import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter {
public static void main(String[] args) {
	JTextField answer = new JTextField(20);
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JButton b = new JButton();
	p.add(answer);
	f.add(p);
	p.add(b);
	f.setVisible(true);
	
	
}
}
