// PLIK 11
// metoda toString()

import java.awt.*;
import java.util.Objects;

public class Employee {

    String name;
    int age;
    int salary;

    public Employee (){}

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override // mozna samemu zdefiniowac metode toString() [alt+insert]
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    @Override
    public boolean equals(Object o) { //trzeba zaimplementowac metode equals zeby porownac miedzy soba dane, nie referencje
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Jan Boczkowski",32,2345);
        Employee e2 = new Employee("Mateusz Cwenar", 30, 12000);
        Employee e3 = new Employee("Jan Boczkowski",32,2345);
        Manager m1 = new Manager("Jan Boczkowski",32,2345, 700);


        if (e1.equals(e3)){
            System.out.println("Ta sama osoba!!!!!!");
        } else {
            System.out.println("Rozne osoby");
        }



    }
}
class Manager extends Employee{
    int bonusSalary;

    public Manager(String name, int age, int salary, int bonusSalary) {
        super(name, age, salary);
        this.bonusSalary = bonusSalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return bonusSalary == manager.bonusSalary;
    }
}