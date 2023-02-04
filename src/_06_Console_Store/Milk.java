package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Milk extends Food{
	
		public Milk() {
			if(new Random().nextBoolean()) {
				this.item = "milk.jpeg";
			}
			else {
				this.item = "milk2.jpeg";
			}
		}

		@Override
		public JLabel getFood() {
			// TODO Auto-generated method stub
			price = 1.99;
			return new JLabel(loadImage(this.item));
		}
	}


