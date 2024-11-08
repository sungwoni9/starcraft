package starcraft;

public class Scv extends Unit implements Repairable {
	private Scv() {
		super("Scv", 55);
	}

	void repair(Repairable unit) {
		if (unit instanceof Repairable) {
			Unit target = (Unit) unit;

			while (target.hp < target.MAX_HP) {
				target.hp++;
				String messege = String.format("%s 수리중[%d/%d]", target.name, target.hp, target.MAX_HP);
				System.out.println(messege);

				try {
					Thread.sleep(50);
				} catch (Exception e) {
				}
			}
			System.out.println("수리완료 >>>");
		}
	}

}
