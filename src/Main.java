import exercicio1.Pessoa;
import exercicio2.Agenda;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) throws ParseException {
    // EXERCÍCIO 1:
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jhony");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        pessoa.setDataNascimento(formato.parse("15/11/1993"));
        String dataFormatada = formato.format(pessoa.getDataNascimento());
        pessoa.setAltura(1.76);

        System.out.println("EXERCÍCIO 1:");
        System.out.println(pessoa.retornaTodosDadosPessoa(pessoa.getNome(),
                dataFormatada,
                pessoa.getAltura())
        );

        System.out.println("Nesse ano, você completa " + pessoa.retornaIdade() + " anos de idade.");
        System.out.println("");

     //EXERCÍCIO 2:
        Agenda agenda = new Agenda();

            for (int indice = 0; indice <10; indice++){
                String nome = "Pessoa " + (indice + 1);
                int idade = 20;
                float altura = (float) 1.79;
                agenda.armazenaPessoa(nome, idade, altura);
            }

        System.out.println("EXERCÍCIO 2:");
        agenda.imprimeAgenda();
        System.out.println("Posição da pessoa pesquisada na agenda: " + agenda.buscaPessoa("Pessoa 2"));
        System.out.println("");

        agenda.imprimePessoa(1); //Para chamar o método que imprime todos os dados de um contato pesquisado pelo index.
        System.out.println("");

        agenda.removePessoa("Pessoa 1");
        agenda.imprimeAgenda(); //Imprime novamente para validação do método de remoção.


    }
}
