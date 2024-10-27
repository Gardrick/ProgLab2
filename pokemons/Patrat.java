package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.status.WorkUp;
import moves.status.DoubleTeam;
import moves.status.Swagger;

public class Patrat extends Pokemon{
	public Patrat(String name, int level) {
		super(name, level);
		setType(Type.NORMAL);
		setStats(45, 55, 39, 35, 39, 42);
		setMove(new WorkUp(), new DoubleTeam(), new Swagger());
	}
}
