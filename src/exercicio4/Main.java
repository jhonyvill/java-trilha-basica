package exercicio4;

public class Main {
    public static void main(String[] args) {
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
    }
}
