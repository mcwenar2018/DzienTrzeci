//PLIK 9
//POLIMORFIZM

public class Test {
    public static void main(String[] args) {
        X x = new X();
        x.introduce();

        Y y = new Y();
        y.introduce();

        Letter letter1 = new X(); // typ interfejsowy, przypisanie X
        Letter letter2 = new Y();

        letter1.introduce(); // wywolanie metody na zmiennej typu interfejsowego
        letter2.introduce();
    }
}

interface Letter{
    void introduce();
}

class X implements Letter{
    @Override // ctri + i
    public void introduce() {
        System.out.println("Jestem X");
    }
}

class Y extends X implements Letter {
    @Override
    public void introduce() {
        System.out.println("Jestem Y");
    }
}