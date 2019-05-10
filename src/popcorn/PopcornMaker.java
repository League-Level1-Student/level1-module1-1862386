package popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave jim = new Microwave();
	Popcorn bob = new Popcorn("butter");
	String pop = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	String corn = JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?");
int yee =	Integer.parseInt(corn);
Popcorn sam = new Popcorn(pop);
	jim.putInMicrowave(sam);
	jim.setTime(yee);
	jim.startMicrowave();
	
}
}
