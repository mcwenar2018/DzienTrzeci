//PLIK 6 rozszerzenie

public class SubPrinter extends Printer {
    int z = 3;

    void printMe(){
        super.printMe(); // wywolanie na klasie rodzicu ze slowem SUPER
        System.out.println("z wynosi " + z);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getName());
    }

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.printMe();

        System.out.println("------------------------------------------");

        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();
    }
}
