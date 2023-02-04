package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Food{
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
	}

	@Override
	public JLabel getFood() {
		price = 3.99;
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
