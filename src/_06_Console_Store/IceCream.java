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
		price = 2.99;
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}