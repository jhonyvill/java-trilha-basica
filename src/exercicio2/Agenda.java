package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<AgendaPerson> people = new ArrayList<>(10);

    public void savePerson(String name, int age, float height) {
        AgendaPerson agendaPerson = new AgendaPerson(name, age, height);
        people.add(agendaPerson);
    }

    public void deletePerson(String name) {
        int index = personSearch(name);
        if (index > -1) {
            people.remove(index);
        } else {
            System.out.println("Pessoa não encontrada");
        }
    }

    public int personSearch(String name) {
        int index = 0;
        for (AgendaPerson agendaPerson : people) {
            if (agendaPerson.getName().equalsIgnoreCase(name)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public void printAgenda() {
        System.out.println("Lista de contatos da agenda:");

        for (int index = 0; index < people.size(); index++) {
            System.out.println((index + 1) + "º contato da agenda:");
            System.out.println(people.get(index).toString());
            System.out.println("");
        }
    }// imprime os dados de todas as pessoas da agenda.

    public void searchPersonForIndex(int index) {
        if (index < 0) {
            System.out.println("Opção inválida.");
        } else {
            System.out.println("Pessoa do índice pesquisado:");
            System.out.println(people.get(index).toString());
            System.out.println("");
        }
    }// imprime os dados da pessoa que está na posição “i” da agenda.

}
