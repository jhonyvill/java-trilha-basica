package exercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jhony", LocalDate.of(1993, 11, 18), 1.76);
        System.out.println(person.returnAllData());

        System.out.println("Idade: " + person.returnAge() + ".");
    }
}
