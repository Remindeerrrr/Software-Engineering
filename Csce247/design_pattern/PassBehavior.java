package Csce247.design_pattern;

import java.util.Random;

public class PassBehavior implements OffenceBehavior {
	Random rand = new Random();

	public String play() {
		return "Passes to a forward";
	}
}
