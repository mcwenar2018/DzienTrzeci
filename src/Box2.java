//PLIK 6
// Wariacja programu Box, na zadanie
import java.awt.*;

public class Box2 {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box2(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Box2(Point topLeft, Point bottomRight ) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
    }

    Box2(Point topLeft, int w, int h){
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
    }

    void printBox(){
        System.out.print("Box2: <");
        System.out.print(x1 + "," + y1);
        System.out.print(",");
        System.out.print(x2 + "," + y2);
        System.out.println(">");
    }

    public static void main(String[] args) {
        Box2 box2; // tu nie tworzymy obiektu i nie wywolujemy metody

        System.out.println("Wywolanie buildBox ze wspolrzednymi (25,25) i (50,50)");
        box2 = new Box2(25,25,50,50); // tu tworzymy obiekt, rezerwowana jest pamiec
        box2.printBox();

        //z punktami (10,10) i (20,20)

        System.out.println("Wywolanie buildBox z punktami (10,10) i (20,20)");
        box2 = new Box2(new Point (10,10), new Point(20,20)); //tu tworzymy obiekt, rezerwowana jest pamiec
        box2.printBox();

        //z punktem (12,12) i szerokoscia (30,40)

        System.out.println("Wywolanie z punktem (12,12) oraz szerokoscia 30 i wysokoscia 40");
        box2 = new Box2(new Point(12,12),30,40); // tu tworzymy obiekt, rezerwowana jest pamiec
        box2.printBox();
    }

}
