// PLIK 5
// KONSTRUKTORY

public class Sample {
    public static void main(String[] args) {

        new C();
    }

}

class A {
    A() {
        System.out.println("konstruuje A");

    }
    }

class B extends A {
    public B() {
        System.out.println("konstruuje B");
    }
    }


class C extends B {
    public C() {
        System.out.println("konstruuje C");
    }
}