package moves.special;

import ru.ifmo.se.pokemon.*;

public final class SludgeWave extends SpecialMove{
	public SludgeWave() {
		super(Type.POISON, 95, 100);
	}
	
	@Override
	public void applyOppEffects(Pokemon p) {
		if (Math.random() < 0.1) {
			Effect.poison(p);
		}
	}
	
	@Override
	protected String describe() {
		return "использует Sludge Wave";
	}
}
