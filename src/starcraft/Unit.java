package starcraft;

import java.util.Random;

interface Attacable{
	
}

interface Repairable{
	
}

public class Unit {

	Random random = new Random();

	public final int MAX_HP;
	public String name;
	public int hp;
	private int power;

	protected Unit(String name, int hp) {
		MAX_HP = hp;

		this.hp = hp;
		this.name = name;
	}

	protected Unit(String name, int hp, int power) {
		MAX_HP = hp;

		this.hp = hp;
		this.power = power;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int hp() {
		return hp;
	}

	public int getPower() {
		return power;
	}

}
