package exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;
    private double height;

    public Person(String name, LocalDate birthDate, double height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    public String returnAllData() {
        return String.format("Nome: %s. \nAltura: %.2f.\nNascimento: %s.", this.name, this.height, this.birthDate);
    }

    public int returnAge() {
        Period period = Period.between(this.birthDate, LocalDate.now());

        if(period.getMonths() < 0 || period.getDays() < 0){
            return period.getYears() - 1;
        }

        return period.getYears();
    }

}
