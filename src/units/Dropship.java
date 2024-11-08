package units;

import interferses.Repairable;
import starcraft.AirUnit;

public class Dropship extends AirUnit implements Repairable {
	public Dropship() {
		super("Dropship", 55);
	}

	@Override
	protected void flying() {
		System.out.println("I can fly~");

	}

}
