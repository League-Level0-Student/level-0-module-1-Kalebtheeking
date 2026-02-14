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
if(riddle1.equalsIgnoreCase("clock") || riddle1.equalsIgnoreCase("watch")|| riddle1.equalsIgnoreCase("a watch")|| riddle1.equalsIgnoreCase("a clock") ) {
	score+=1;
	JOptionPane.showMessageDialog(null,"correct, your score is "+score);
}
else {
	score-=1;
	JOptionPane.showMessageDialog(null,"wrong,\n"
			+ "the correct answer was a watch or clock\n"
			+ "your score is "+score);
}

String riddle2= JOptionPane.showInputDialog("what has a head, but no brain?");
if(riddle2.equalsIgnoreCase("lettuce")){
	
	score+=1;
	JOptionPane.showMessageDialog(null,"correct, your score is "+score);
}
else {
	score-=1;
	JOptionPane.showMessageDialog(null,"wrong,\n"
			+ "the correct answer was lettuce\n"
			+ "your score is "+score);
}

String riddle3= JOptionPane.showInputDialog("David's father has three sons: Snap, Crackle and _____?");
if(riddle3.equalsIgnoreCase("david")){
	
	score+=1;
	JOptionPane.showMessageDialog(null,"correct, your score is "+score);
}
else {
	score-=1;
	JOptionPane.showMessageDialog(null,"wrong,\n"
			+ "the correct answer was david\n"
			+ "your score is "+score);
}

String riddle4= JOptionPane.showInputDialog("what is more usefull when it is broken?");
if(riddle4.equalsIgnoreCase("egg")|| riddle4.equalsIgnoreCase("an egg") ) {
	
	score+=1;
	JOptionPane.showMessageDialog(null,"correct, your score is "+score);
}
else {
	score-=1;
	JOptionPane.showMessageDialog(null,"wrong,\n"
			+ "the correct answer was an egg\n"
			+ "your score is "+score);
}


String riddle5= JOptionPane.showInputDialog("what word is spelled incorrectly in the dictionary?");
if(riddle5.equalsIgnoreCase("incorrectly")) {
	
	score+=1;
	JOptionPane.showMessageDialog(null,"correct, your score is "+score);
}
else {
	score-=1;
	JOptionPane.showMessageDialog(null,"wrong,\n"
			+ "the correct answer was dictionary \n"
			+ "your score is "+score);
}
JOptionPane.showMessageDialog(null,"your final score is"+score);






		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

