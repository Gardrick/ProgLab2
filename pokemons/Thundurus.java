package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.physical.Crunch;
import moves.special.FlashCannon;
import moves.special.SludgeWave;
import moves.status.ThunderWave;

public final class Thundurus extends Pokemon{
	public Thundurus(String name, int level) {
		super(name, level);
		setType(Type.ELECTRIC, Type.FLYING);
		setStats(79, 115, 70, 125, 80, 111);
		setMove(new Crunch(), new FlashCannon(), new SludgeWave(), new ThunderWave());
	}
}
