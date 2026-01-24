package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1= JOptionPane.showInputDialog("what has a face, but no eyes,\n"
		+ "and hands but no arms?");
if(riddle1.equalsIgnoreCase("clock") || riddle1.equalsIgnoreCase("watch") ) {
	
	score+=1;
	JOptionPane.showMessageDialog(null,"correct your score is "+score);
}
else {
	score-=1;
	JOptionPane.showMessageDialog(null,"wrong,\n"
			+ "the correct answer was a watch or clock\n"
			+ "your score is "+score);
}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

