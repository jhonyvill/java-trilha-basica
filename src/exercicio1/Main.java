package exercicio1;

import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jhony");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        pessoa.setDataNascimento(formato.parse("15/11/1993"));
        String dataFormatada = formato.format(pessoa.getDataNascimento());
        pessoa.setAltura(1.76);

        System.out.println(pessoa.retornaTodosDadosPessoa(pessoa.getNome(),
                dataFormatada,
                pessoa.getAltura())
        );

        System.out.println("Nesse ano, você completa " + pessoa.retornaIdade() + " anos de idade.");
        System.out.println("");
    }
}
