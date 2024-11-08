package starcraft;

import interferses.Attackable;
import interferses.Repairable;
import units.Dropship;
import units.Marine;
import units.Scv;
import units.Tank;

public class Starcraft {
	public static void main(String[] args) {

		Tank tank = new Tank();
		Marine marine = new Marine();
		Scv scv = new Scv();
		Dropship ship = new Dropship();

		Attackable.attack(marine, scv);
		Attackable.attack(tank, ship);
		Attackable.attack(scv, tank);

		Repairable.repair(tank);
		Repairable.repair(scv);

	}

}
