package exercicio3;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.start(4, 5);
        System.out.println(elevator.toString());
        System.out.println("");

        for (int index = 0; index < 5; index++) {
            elevator.enterPerson();
        }
        System.out.println("Pessoas no elevador: " + elevator.getPeopleInside());

        elevator.goOutPerson();
        System.out.println("Pessoas no elevador: " + elevator.getPeopleInside());

        for (int index = 0; index < 6; index++) {
            elevator.goUp();
        }
        System.out.println("Andar atual: " + elevator.getCurrentFlor() + "º.");


        for (int index = 0; index < 6; index++) {
            elevator.goDown();
        }
        System.out.println("Andar atual: " + elevator.getCurrentFlor() + "º.");
    }
}
