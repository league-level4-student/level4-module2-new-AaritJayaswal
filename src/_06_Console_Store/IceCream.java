package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class IceCream extends Food{

	public IceCream() {
		if(new Random().nextBoolean()) {
			this.item = "icecream1.jpeg";
		}
		else {
			this.item = "icecream2.jpeg";
		}
	}

	@Override
	public JLabel getFood() {
	
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
public static double price() {
		
		return 2.99;
	}
}