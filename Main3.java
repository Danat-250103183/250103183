
interface MovementStrategy {
    void move();
}
class Walking implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Walking at 5 km/h");
    }
}
class Skateboarding implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Skateboarding at 15 km/h");
    }
}
class Jetpack implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Flying with jetpack at 60 km/h");
    }
}
class Player {
    private MovementStrategy strategy;

    public Player(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void setMovementStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void move() {
        strategy.move();
    }
}
public class Main3 {
    public static void main(String[] args) {
        Player player = new Player(new Walking());

        System.out.println("Race started:");
        player.move();

        System.out.println("\nSwitching to jetpack mid-run!");
        player.setMovementStrategy(new Jetpack());
        player.move();
    }
}

