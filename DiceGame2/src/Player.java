// pt 7: create Player class w/ name & die
public class Player {
	private String name;
	private int totalDice;

// pt 8: default constructor w/ name "none" & die -1
	public Player () {
		this.name = "none";
		this.totalDice = -1;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getTotalDice() {
		return totalDice;
	}
	public void setTotalDice(int totalDice) {
		this.totalDice = totalDice;
	}

}
