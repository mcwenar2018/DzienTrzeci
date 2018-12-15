import java.util.Objects;
import java.util.Random;

public class JackPot {
    public static final int BETS_NUMBER = 1000;
    public static void main(String[] args) {
        Random random = new Random(99999999L); // wspolczynnik randomowosci :)
        Bet[] bets = new Bet[BETS_NUMBER];
        Bet jackPot = new Bet(7,7,7);

        for (int i = 0; i < bets.length; i++) {
            bets[i] = new Bet(random);
        }

        for (int j = 1; j<bets.length; j++){
            if (jackPot.equals(bets[j])){
                System.out.println("Jackpot w j: " + j + " probie");
            }
        }
    }

}

class Bet {
    int x;
    int y;
    int z;

    public Bet(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Bet(Random random) {
        this.x = draw(random);
        this.y = draw(random);
        this.z = draw(random);
    }

    private int draw(Random random) {
        return random.nextInt(10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return x == bet.x &&
                y == bet.y &&
                z == bet.z;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

