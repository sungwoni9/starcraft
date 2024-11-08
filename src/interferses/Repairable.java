package interferses;

import starcraft.Unit;

public interface Repairable {
	static void repair(Repairable unit) {
		if (unit instanceof Repairable) {
			Unit target = (Unit) unit;

			while (target.hp < target.MAX_HP) {
				String messege = String.format("%s 수리중[%d/%d]", target.name, target.hp, target.MAX_HP);
				System.out.println(messege);

				if (target.hp + 5 < target.MAX_HP)
					target.hp += 5;
				else
					target.hp = target.MAX_HP;

				try {
					Thread.sleep(50);
				} catch (Exception e) {
				}
			}
			System.out.println("수리완료 >>>");
		}
	}

}
