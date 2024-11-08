package starcraft;

public class Starcraft {
	public static void main(String[] args) {

		Tank tank = new Tank();
		Marine marine = new Marine();
		Scv scv = new Scv();
		Dropship ship = new Dropship();

		scv.repair(tank);
		scv.repair(scv);
		scv.repair(ship);

	}

}
