package exercicio5;

public enum Fluxo {
    ALFA("Alfa"),
    BETA("Beta"),
    FIM("Fim"),
    REPETIR("Repetir"),
    A("A"),
    B("B");

    private String tipo;

    Fluxo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
