package exercicio2;

public class AgendaPerson {

    private String name;
    private int age;
    private float height;

    public AgendaPerson(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s. \nIdade: %s.\nAltura: %.2f.", this.name, this.age, this.height);
    }
}
