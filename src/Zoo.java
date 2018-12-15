//PLIK 10

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Dog("Azor");
        animals[2] = new Cat("Filemon");
        animals[3] = new Pig("Swinka");
        animals[4] = new Animal();
        animals[5] = new Cow("Iwona");

        for (Animal animal : animals){
            animal.introduce();
        }
    }
}

class Animal{
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierze " + name;
    }

    String makeSound(){
        return "?????";
    }

    void introduce() {
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}

class Cat extends Animal{

    public Cat(String name) {
        this.name = name;
    }

    @Override
    String showName() {
            return "kot" + name;
        }

    @Override
    String makeSound() {
            return "miau";
        }

    }


class Pig extends Animal{
    public Pig(String name) {
        this.name = name;
    }
}

class Cow extends Animal{
    public Cow(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Krowa " + name;
    }

    @Override
    String makeSound() {
        return "muuu";
    }
}

