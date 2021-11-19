package exercicio3;

public class Elevator {

    private int currentFlor;
    private int totalFloors;
    private int capacity;
    private int peopleInside;

    public void start(int capacity, int totalFloors) {
        this.currentFlor = 0;
        this.capacity = capacity;
        this.totalFloors = totalFloors;
        this.peopleInside = 0;
    }

    public void enterPerson(){
        if (this.peopleInside < this.capacity){
            this.peopleInside += 1;
            System.out.println("Entrou uma pessoa no elevador.");
        }else{
            System.out.println("Não é possível entrar mais pessoas no elevador.");
        }
    }

    public void goOutPerson(){
        if (this.peopleInside > 0){
            this.peopleInside -= 1;
            System.out.println("Saiu uma pessoa do elevador.");
        }else{
            System.out.println("Não há pessoas no elevador.");
        }
    }

    public void goUp(){
        if (this.currentFlor < this.totalFloors){
            this.currentFlor += 1;
            System.out.println("Subiu um andar.");
        }else{
            System.out.println("Não é possível subir mais.");
        }
    }

    public void goDown(){
        if (this.currentFlor > 0){
            this.currentFlor -= 1;
            System.out.println("Desceu um andar.");
        }else{
            System.out.println("Não é possível descer mais.");
        }
    }

    public int getCurrentFlor() {
        return currentFlor;
    }

    public int getPeopleInside() {
        return peopleInside;
    }

    @Override
    public String toString() {
        return String.format("Andar atual: %s.\n" +
                "Total de andares: %s.\n" +
                "Capacidade máxima: %s.\n" +
                "Pessoas no elevador: %s.\n",currentFlor, totalFloors, capacity, peopleInside);
    }
}
