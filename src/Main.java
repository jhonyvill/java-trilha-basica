import exercicio1.Pessoa;
import exercicio2.Agenda;
import exercicio3.Elevador;
import exercicio4.ControleRemoto;
import exercicio4.Televisao;
import exercicio5.Caminhao;
import exercicio5.ControleCaminhao;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) throws ParseException {
    //--EXERCÍCIO 1:
        System.out.println("EXERCÍCIO 1:");

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

    //--EXERCÍCIO 2:----------------------------------------------------------------------------------------------
        System.out.println("EXERCÍCIO 2:");
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

    //--EXERCÍCIO 3:----------------------------------------------------------------------------------------------
        System.out.println("EXERCÍCIO 3:");

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

    //--EXERCÍCIO 4:----------------------------------------------------------------------------------------------
        System.out.println("");
        System.out.println("EXERCÍCIO 4:");
        Televisao televisao = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.aumentarVolume(televisao);
        System.out.println("Volume atual: " + televisao.getVolumeAtual());

        controleRemoto.diminuirVolume(televisao);
        System.out.println("Volume atual: " + televisao.getVolumeAtual());

        controleRemoto.aumentarCanal(televisao);
        System.out.println("Canal atual: " + televisao.getCanalAtual());

        controleRemoto.diminuirCanal(televisao);
        System.out.println("Canal atual: " + televisao.getCanalAtual());

        System.out.println("");
        controleRemoto.selecionarCanal(televisao, 20);
        System.out.println("Canal selecionado: " + televisao.getCanalAtual());

        System.out.println("Volume atual da televisão: " + televisao.getVolumeAtual()); //Para consultar o volume de som.
        System.out.println("Canal atual da televisão: " + televisao.getCanalAtual());// Para consultar o canal selecionado.


    //--EXERCÍCIO 5:----------------------------------------------------------------------------------------------
        System.out.println("");
        System.out.println("EXERCÍCIO 5:");

        ControleCaminhao controleCaminhao = new ControleCaminhao();
        controleCaminhao.carregarCaminhao();




    }
}
