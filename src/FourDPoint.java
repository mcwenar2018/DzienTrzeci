import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int v;


    FourDPoint(int x, int y, int z, int v) {
        super(x,y);
        this.z = z;
        this.v = v;
    }


    void printDPoint(){
        System.out.print("DPoint: <");
        System.out.print(x + "," + y);
        System.out.print(",");
        System.out.print(z + "," + v);
        System.out.println(">");
    }

    public static void main(String[] args) {

        FourDPoint fourDPoint;

        System.out.println("Wywolanie DPoint ze wspolrzednymi (25,25) oraz (15,15)");
        fourDPoint = new FourDPoint(25,25,15,15);
        fourDPoint.printDPoint();
    }


}