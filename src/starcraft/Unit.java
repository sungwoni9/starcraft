package starcraft;

interface Repairable {

}

interface Attackable {
	
	
}

public class Unit {

	final int MAX_HP;
	String name;
	int hp;

	protected Unit(String name, int hp) {
		MAX_HP = hp;

		this.hp = hp;
		this.name = name;
	}
	
	void attackable(Unit unit) {
		if(unit instanceof Attackable) {
			Unit attacker = (Unit) unit;
			
		}
		
	}

}
