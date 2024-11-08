package units;

import interferses.Attackable;
import starcraft.GroundUnit;

public class Tank extends GroundUnit implements Attackable {

	public Tank() {
		super("TANK", 80, 45);
	}
}
