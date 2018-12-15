//DRUGI PLIK

public class ScopeTest {

    //THIS
    int test = 10;
    private String name;

    void setName(String name){
        this.name = name;   //referencja do pola klasy
    }

    void printTest(){
        int test = 20;
        System.out.println("test: " + this.test);
    }

    public static void main(String[] args) {

        ScopeTest scopeTest = new ScopeTest();

        System.out.println("--- " + scopeTest.test);
        scopeTest.printTest();
    }
}
