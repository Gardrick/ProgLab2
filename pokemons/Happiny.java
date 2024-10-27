package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.special.Psychic;
import moves.status.ThunderWave;

public class Happiny extends Pokemon{
	public Happiny(String name, int level) {
		super(name, level);
		setType(Type.NORMAL);
		setStats(100, 5, 5, 15, 65, 30);
		setMove(new Psychic(), new ThunderWave());
	}
}
