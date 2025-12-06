// pt 1: create Die class, include numSides and values
public class Die {
	private int numSides;
	private int value;

// pt 2: default constructor, numSides = 6, value = -1
	public Die() {
		this.numSides = 6;
		this.value = -1;
	}
	
// pt 3: getters & setters
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
// pt 4: constructor w/ numSides as arg, set value to 1
	public Die (int numSides) {
		this.numSides = numSides;
		value = 1;
	}

// pt 5: roll method to set value to a random number between 1 and numSides
	public int roll() {
		int num = (int) ((Math.random()*numSides)+1);
		value = num;
		return value;
	}
}
