import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
    Battle b = new Battle();
    Pokemon p1 = new Thundurus("Thunder", 10);
    Pokemon p2 = new Patrat("Rat", 7);
    Pokemon p3 = new Watchog("Dog", 8);
    Pokemon p4 = new Happiny("Happy", 6);
    Pokemon p5 = new Chansey("Chan", 9);
    Pokemon p6 = new Blissey("Bliss", 11);
    b.addAlly(p1);
    b.addAlly(p2);
    b.addAlly(p3);
    b.addFoe(p4);
    b.addFoe(p5);
    b.addFoe(p6);
    b.go();
    }
}