package exercicio4;

public class ControleRemoto {

    public void aumentarVolume(Televisao televisao){
        if (televisao.getVolumeAtual() < televisao.getVolumeMaximo()){
            televisao.setVolumeAtual(televisao.getVolumeAtual() + 1);
            System.out.println("Aumentou o volume.");
        }else{
            System.out.println("Não é possível aumentar o volume. Volume máximo alcançado.");
        }
    }

    public void diminuirVolume(Televisao televisao){
        if (televisao.getVolumeAtual() > 0){
            televisao.setVolumeAtual(televisao.getVolumeAtual() - 1);
            System.out.println("Diminuiu o volume.");
        }else{
            System.out.println("Não é mais possível diminuir o volume. Volume mínimo alcançado.");
        }
    }

    public void aumentarCanal(Televisao televisao){
        televisao.setCanalAtual(televisao.getCanalAtual() + 1);
        System.out.println("Aumentou um canal.");
    }

    public void diminuirCanal(Televisao televisao){
        if (televisao.getCanalAtual() > 0){
            televisao.setCanalAtual(televisao.getCanalAtual() - 1);
            System.out.println("Diminuiu um canal.");
        }else{
            System.out.println("Não é mais possível diminuir o canal.");
        }
    }

    public void selecionarCanal(Televisao televisao, int canal){
        televisao.setCanalAtual(canal);
    }

}
