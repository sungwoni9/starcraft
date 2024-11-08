package units;

import interferses.Repairable;
import starcraft.GroundUnit;

public class Scv extends GroundUnit implements Repairable {
	Scv() {
		super("Scv", 55, 5);
	}

}
