package units;

import interferses.Repairable;
import starcraft.GroundUnit;

public class Scv extends GroundUnit implements Repairable {
	public Scv() {
		super("Scv", 55, 5);
	}

}
