package exercicio2;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        for (int indice = 0; indice < 10; indice++) {
            String nome = "Pessoa " + (indice + 1);
            int idade = 20;
            float altura = (float) 1.79;
            agenda.armazenaPessoa(nome, idade, altura);
        }

        agenda.imprimeAgenda();
        System.out.println("Posição da pessoa pesquisada na agenda: " + agenda.buscaPessoa("Pessoa 2"));
        System.out.println("");

        agenda.imprimePessoa(1); //Para chamar o método que imprime todos os dados de um contato pesquisado pelo index.
        System.out.println("");

        agenda.removePessoa("Pessoa 1");
        agenda.imprimeAgenda(); //Imprime novamente para validação do método de remoção.
    }
}
