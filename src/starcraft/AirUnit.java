package starcraft;

public abstract class AirUnit extends Unit {

	protected AirUnit(String name, int hp) {
		super(name, hp);
	}

	 protected abstract void flying();
}
