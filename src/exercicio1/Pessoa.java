package exercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private double altura;

    public String retornaTodosDadosPessoa(String nome, String dataNascimento, double altura){
        String todosDadosPessoa = "Nome: " + nome + ". \n" +
                "Data nascimento: " + dataNascimento + ". \n" +
                "Altura: " + altura;
        return todosDadosPessoa;
    }

    public int retornaIdade(){
        SimpleDateFormat formatoDataAno = new SimpleDateFormat("yyyy");
        int dataAtual = Integer.parseInt(formatoDataAno.format(new Date()));
        int idade = dataAtual - Integer.parseInt(formatoDataAno.format(dataNascimento));

        return idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
