package exercicio3;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(4, 5);
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Total de andares: " + elevador.getTotalAndares());
        System.out.println("Capacidade máxima: " + elevador.getCapacidade());
        System.out.println("Pessoas no elevador: " + elevador.getLotacao());
        System.out.println("");

        for (int indice = 0; indice < 5; indice++) {
            elevador.entra();
        }
        System.out.println("Pessoas no elevador: " + elevador.getLotacao());

        elevador.sai();
        System.out.println("Pessoas no elevador: " + elevador.getLotacao());

        for (int indice = 0; indice < 6; indice++) {
            elevador.sobe();
        }
        System.out.println("Andar atual: " + elevador.getAndarAtual() + "º.");


        for (int indice = 0; indice < 6; indice++) {
            elevador.desce();
        }
        System.out.println("Andar atual: " + elevador.getAndarAtual() + "º.");
    }
}
