//PLIK 7

import java.awt.*;

public class NamedPoint extends Point {

    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y); //wywolanie konstruktora z klasy, z ktorej dziedziczymy
        this.name = name;
        }

    public static void main(String[] args) {
        NamedPoint np = new NamedPoint(5, 5, "Small Point");

        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("name wynosi " + np.name);
    }
}
