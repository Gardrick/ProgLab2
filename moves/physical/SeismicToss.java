package moves.physical;

import ru.ifmo.se.pokemon.*;

public class SeismicToss extends PhysicalMove{
	public SeismicToss() {
		super(Type.FIGHTING, 0, 100);
	}
	
	@Override
	protected double calcBaseDamage(Pokemon atk, Pokemon def) {
		return atk.getLevel();
	}
	
	@Override
	protected String describe() {
		return "использует Seismic Toss";
	}
}
