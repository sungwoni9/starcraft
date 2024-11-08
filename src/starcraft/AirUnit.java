package starcraft;

public abstract class AirUnit extends Unit {

	AirUnit(String name, int hp) {
		super(name, hp);
	}

	 abstract void flying();
}
