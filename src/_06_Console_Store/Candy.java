package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Candy extends Food{
	public Candy() {
		if(new Random().nextBoolean()) {
			this.item = "candy1.jpeg";
		}
		else {
			this.item = "candy2.jpeg";
		}
	}

	@Override
	public JLabel getFood() {
		price = 0.49;
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
