package starcraft;

interface Repairable {

}

public class Unit {

	private final int MAX_HP;
	private String name;
	private int hp;

	protected Unit(String name, int hp) {
		MAX_HP = hp;

		this.hp = hp;
		this.name = name;
	}

}
