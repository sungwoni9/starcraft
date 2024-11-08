package interferses;

import starcraft.Unit;
import java.util.Random;

public interface Attackable {
	public static void attack(Unit attacker, Unit target) {
		Random random = new Random();
		if (attacker instanceof Attackable) {
			int attackCnt = random.nextInt(3) + 1;

			System.out.printf("%s가 %s를 공격합니다!\n", attacker.name, target.name);

			while (attackCnt > 0 && target.hp > 0) {
				target.hp -= attacker.getPower();

				if (target.hp > 0) {
					System.out.printf("%s의 남은 체력: %d\n", target.name, target.hp);
				} else {
					target.hp = 0;
					System.out.printf("%s 펑~~\n", target.name);
				}
				attackCnt--; 
			}
		} else {
			System.out.printf("%s는 공격할 수 없는 대상입니다.\n", attacker.name);
		}
	}
}
