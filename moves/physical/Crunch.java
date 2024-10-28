package moves.physical;

import ru.ifmo.se.pokemon.*;

public final class Crunch extends PhysicalMove{
	public Crunch() {
		super(Type.GROUND, 80, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		if (Math.random() < 0.2) {
			p.setMod(Stat.DEFENSE, -1);
		}
	}
	
	@Override
	protected String describe() {
		return "использует Crunch";
	}
}
