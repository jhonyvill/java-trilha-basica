package exercicio2;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        for (int index = 0; index < 10; index++) {
            agenda.savePerson("Pessoa " + (index + 1), 20, (float) 1.79);
        }

        agenda.printAgenda();
        System.out.println("Posição da pessoa pesquisada na agenda: " + (agenda.personSearch("Pessoa 2") + 1));
        System.out.println("");

        agenda.searchPersonForIndex(1); //Para chamar o método que imprime todos os dados de um contato pesquisado pelo index.

        agenda.deletePerson("Pessoa 1");
        agenda.printAgenda(); //Imprime novamente para validação do método de remoção.
    }
}
