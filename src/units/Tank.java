package units;

import interferses.Attackable;
import interferses.Repairable;
import starcraft.GroundUnit;

public class Tank extends GroundUnit implements Repairable, Attackable {

	public Tank() {
		super("TANK", 80, 45);
	}
}
