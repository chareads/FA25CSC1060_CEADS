import java.util.Scanner; // will need later

public class DiceGameDriver {

	public static void main(String[] args) {

// pt 9: ask user for number of sides on dice & number of players, set sides
		int sideSet;
		System.out.println("Enter number of sides on dice: ");
		Scanner in1 = new Scanner(System.in);
		sideSet = in1.nextInt();
		Die die = new Die(sideSet); // works bc of the one-arg constructor
		// we now have a die object
		
		int playerCount;
		System.out.println("Enter number of players: ");
		Scanner in2 = new Scanner(System.in);
		playerCount = in2.nextInt();
		Player[] players = new Player[playerCount];
		// we now have an empty array of player objects of the right size
	
// pt 10: create Player object for each player, store in players array,
// then get player names (& their dice totals, a bit later)
		for (int i = 0; i < playerCount; i++) {
			Player player = new Player();
			players[i] = player; // fills player slot w/ default
			String inputName;
			System.out.println("Enter name of Player " + (i+1) + ": ");
			Scanner in3 = new Scanner(System.in);
			inputName = in3.nextLine();
			players[i].setName(inputName); // players have been named now
		}

// pt 6: ask user for number of dice, roll them, output total
// pt 11: roll dice for each player by traversing array, output results
		int diceNum;
		System.out.println("Enter number of dice to be rolled: ");
		Scanner in = new Scanner(System.in);
		diceNum = in.nextInt();
		
		for (Player player : players) {
			int total = 0;
			for (int i = 0; i < diceNum; i++) {
				int rollResult = die.roll();
				total = total + rollResult;
			}
			player.setTotalDice(total);
			System.out.println(player.getName() + " rolled a total of " + player.getTotalDice()
					+ " on " + diceNum + "d" + die.getNumSides());
		}
		
		decideWinner(players);
		System.out.println("The winner is " + players[decideWinner(players)].getName());
	}

// pt 12-13: take players array as input, compare dice values, return location or array of winners;
// then call from main and print
	private static int decideWinner(Player[] players) {
		int windex = 0; // "winner index"
		for (int i = 0; i < players.length-2; i++) {
			int incumbent = players[i].getTotalDice();
			int challenger = players[i+1].getTotalDice();
			if (incumbent >= challenger) { // on ties first highest wins
				windex = i;
			}
		}
		return windex;
		
	}
	
}
