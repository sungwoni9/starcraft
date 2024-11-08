package units;

import starcraft.AirUnit;

public class Dropship extends AirUnit {
	Dropship() {
		super("Dropship", 55);
	}

	@Override
	protected void flying() {
		System.out.println("I can fly~");

	}

}
