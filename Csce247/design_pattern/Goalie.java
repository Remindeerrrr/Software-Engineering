package Csce247.design_pattern;
import java.util.Random;
/*Written by Fang */

public class Goalie extends Player {
	private Random rand = new Random();;

	public Goalie(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void setOffenceBehavior() {
		this.offenceBehavior = new BlockGoalBehavior();
	}

	public void setDefenceBehavior() {
		this.defenceBehavior = new BlockGoalBehavior();
	}

	public String toString() {
		return super.toString() + " plays the position: Goalie";
	}
}