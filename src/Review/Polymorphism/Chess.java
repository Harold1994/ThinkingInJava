package Review.Polymorphism;
class Game {
    public Game() {
        System.out.println("Game construct");
    }

    public Game(int i) {
        System.out.println("Game construct with int ");
    }
}

class BoardGame extends Game{

    public BoardGame(int i) {
        super(i);
        System.out.println("BroadGame");
    }
}
public class Chess extends BoardGame{
    public Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
