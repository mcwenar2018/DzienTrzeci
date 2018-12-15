import java.awt.*;

public class Passer {
    //TRZECI PLIK
    Point point = new Point(1,1);
    int x = 1;

    public static void main(String[] args) {
        Passer passer = new Passer();

        passer.toUpperCase(args);

        for (String str: args) {
            System.out.println(str);

        }

/*        System.out.println(passer.point);
        passer.changePoint(passer.point);
        System.out.println(passer.point);

        System.out.println();

        System.out.println(passer.x);
        passer.changeX(passer.x);
        System.out.println(passer.x);*/
    }


    void changePoint(Point point){
        point.x = 7;
        point.y = 9;
    }

    void changeX(int x){
        x = 8;
    }

    void toUpperCase(String[] text){
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();


        }
    }


}
