package exercicio5;

import java.util.ArrayList;
import java.util.List;

import static exercicio5.Fluxo.*;

public class ControleCaminhao extends Controle{

    List<Caminhao> listaCaminhoes = new ArrayList<>();

    public void carregarCaminhao(){ // Método para gerenciar se carregará novo caminhão ou finalizará imprimindo o mais apto.
        String fluxo = REPETIR.getTipo();
        while(fluxo.equalsIgnoreCase(REPETIR.getTipo())){
            adicionarCaminhao();
            String valor = leString("Para adiconar um novo caminhão pressione 'enter', ou digite 'fim' para finalizar:");
            if (valor.equalsIgnoreCase(FIM.getTipo())){
                fluxo = FIM.getTipo();
            }
        }
        imprimirCaminhaoMaisApto(retornaCaminhaoMaisApto(listaCaminhoes));
    }

    public void adicionarCaminhao(){ // Método para adicionar caminhão na lista.
        Caminhao caminhao = new Caminhao();
        String tipo = REPETIR.getTipo();
        while (tipo == REPETIR.getTipo()){
            tipo = leString("Informe o tipo do caminhao (Alfa ou Beta): ");
            if(tipo.equalsIgnoreCase(ALFA.getTipo())){
                caminhao.setTipo(ALFA.getTipo());
            }else if(tipo.equalsIgnoreCase(BETA.getTipo())){
                caminhao.setTipo(BETA.getTipo());
            }else{
                System.out.println("O tipo informado é inválido.");
                tipo = REPETIR.getTipo();
            }
        }
        caminhao.setPluviometros(adicionarPluviometro(leInteiro("Informe quantos pluviometros esse caminhão pode carregar: ")));
        listaCaminhoes.add(caminhao);
    }

    public List<Pluviometro> adicionarPluviometro(int quantidade){ // Método para adicionar pluviometro.
        List<Pluviometro> pluviometros = new ArrayList<>();
        for (int index = 0; index < quantidade; index++){
            Pluviometro pluviometro = new Pluviometro();
            String tipoPluviometro = REPETIR.getTipo();
            while(tipoPluviometro == REPETIR.getTipo()){
                tipoPluviometro = leString("Informe o tipo do " + (index +1) + "º pluviometro ('A' ou 'B'): ");
                if(tipoPluviometro.equalsIgnoreCase(A.getTipo())){
                    pluviometro.setTipo(A.getTipo());
                }else if(tipoPluviometro.equalsIgnoreCase(B.getTipo())){
                    pluviometro.setTipo(B.getTipo());
                }else{
                    System.out.println("O tipo informado é inválido.");
                    tipoPluviometro = REPETIR.getTipo();
                }
            }
            pluviometro.setCapacidade(leInteiro("Informe a capacidade do " + (index +1) + "º pluviometro em mm: "));
            pluviometros.add(pluviometro);
        }
        return pluviometros;
    }

    public static Caminhao retornaCaminhaoMaisApto(List<Caminhao> listaCaminhoes){ // Método para retornar caminhão mais apto.
        Caminhao caminhaoMaisApto = null;
        int capacidadeTotal = 0;
        for (Caminhao caminhao: listaCaminhoes) {
            int capacidadeAtual = 0;
            for (Pluviometro pluviometro: caminhao.getPluviometros()) {
                capacidadeAtual = capacidadeAtual + pluviometro.getCapacidade();
                if (capacidadeAtual > capacidadeTotal){
                    capacidadeTotal = capacidadeAtual;
                    caminhaoMaisApto = caminhao;
                }
            }
        }
        return caminhaoMaisApto;
    }

    public void imprimirCaminhaoMaisApto(Caminhao caminhao){ // Método para imprimir os dados do caminhão mais apto.
        if (caminhao != null){
            System.out.println("");
            System.out.println("O caminhão mais apto é: ");
            System.out.println("Tipo: " + caminhao.getTipo());
            System.out.println("Com os seguintes pluviometros: ");
            int capacidadeTotal = 0;
            for (Pluviometro pluviometro: caminhao.getPluviometros()) {
                System.out.print("Tipo pluviometro: " + pluviometro.getTipo());
                System.out.println(", com capacidade de " + pluviometro.getCapacidade() + "mm.");
                capacidadeTotal = capacidadeTotal + pluviometro.getCapacidade();
            }
            System.out.println("Capacidade total dos pluviometros do caminhão: " + capacidadeTotal + "mm.");
        }else{
            System.out.println("Não há caminhão apto.");
        }

    }
}
