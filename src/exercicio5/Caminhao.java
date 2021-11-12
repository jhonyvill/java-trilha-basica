package exercicio5;

import java.util.List;

public class Caminhao {

    private String tipo; // Alfa ou Beta
    private List<Pluviometro> pluviometros;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Pluviometro> getPluviometros() {
        return pluviometros;
    }

    public void setPluviometros(List<Pluviometro> pluviometros) {
        this.pluviometros = pluviometros;
    }
}
