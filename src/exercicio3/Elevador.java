package exercicio3;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int lotacao;

    public void inicializa(int capacidade, int totalAndares) {
        this.andarAtual = 0;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.lotacao = 0;
    }

    public void entra(){
        if (this.lotacao < this.capacidade){
            this.lotacao += 1;
            System.out.println("Entrou uma pessoa no elevador.");
        }else{
            System.out.println("Não é possível entrar mais pessoas no elevador.");
        }
    }

    public void sai(){
        if (this.lotacao > 0){
            this.lotacao -= 1;
            System.out.println("Saiu uma pessoa do elevador.");
        }else{
            System.out.println("Não há pessoas no elevador.");
        }
    }

    public void sobe(){
        if (this.andarAtual < this.totalAndares){
            this.andarAtual += 1;
            System.out.println("Subiu um andar.");
        }else{
            System.out.println("Não é possível subir mais.");
        }
    }

    public void desce(){
        if (this.andarAtual > 0){
            this.andarAtual -= 1;
            System.out.println("Desceu um andar.");
        }else{
            System.out.println("Não é possível descer mais.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
}
