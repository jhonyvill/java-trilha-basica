package exercicio4;

public class Televisao {

    private int volumeMaximo = 30;
    private int volumeAtual = 0;
    private int canalAtual = 0;

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolumeMaximo() {
        return volumeMaximo;
    }

}
