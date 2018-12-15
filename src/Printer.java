//PLIK 6
//
public class Printer {
    int x = 0;
    int y = 1;

    void printMe(){
        System.out.println("x wynosi " + x);
        System.out.println("y wynosi " + y);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getName());
    }

}
