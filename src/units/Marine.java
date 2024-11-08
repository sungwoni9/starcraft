package units;

import interferses.Attackable;
import starcraft.GroundUnit;

public class Marine extends GroundUnit implements Attackable {

    public Marine() {
        super("Marine", 65, 20);
    }

}
