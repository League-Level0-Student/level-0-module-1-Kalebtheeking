package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String guess = JOptionPane.showInputDialog("what is your birthday?");
		if (guess.equals("4/10/26")) {
		JOptionPane.showMessageDialog(null,"Happy birthday ");
		}
		else {
			JOptionPane.showMessageDialog(null,"happy unbirthday!");
	}
}}

