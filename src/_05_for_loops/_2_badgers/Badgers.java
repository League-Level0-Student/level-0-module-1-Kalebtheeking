package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		int currentBadger = 12;
		int badger = 0;
		int i = 0;
		int j = 0;

		
		for (j= 0; j <= 1; j +=1) {
		for (badger = 0; badger <= currentBadger; badger += 1) {
			// Print the age variable
			System.out.print("badger ");
		}
//  End the for loop here
		System.out.println();
		for (i =0; i <= 1; i += 1) {
			// Print the age variable
			System.out.print("mushroom ");
//  End the for loop here
			System.out.println();
		}
		
		}
		System.out.println("SNAKE!!!!!!!!!!!!!!!!!!!!!!");
		
	}
}