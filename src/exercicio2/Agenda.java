package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<PessoaAgenda> listaPessoas = new ArrayList<PessoaAgenda>(10);

    public void armazenaPessoa(String nome, int idade, float altura){
            PessoaAgenda pessoaAgenda = new PessoaAgenda();
            pessoaAgenda.setNome(nome);
            pessoaAgenda.setIdade(idade);
            pessoaAgenda.setAltura(altura);
            listaPessoas.add(pessoaAgenda);
    };

    public void removePessoa(String nome){
        for (PessoaAgenda pessoaAgenda: listaPessoas) {
            if(pessoaAgenda.getNome().contains(nome)){
                listaPessoas.remove(pessoaAgenda);
                break;
            }
        }
    }

    public int buscaPessoa(String nome){
        for (PessoaAgenda pessoaAgenda: listaPessoas) {
            if (pessoaAgenda.getNome().contains(nome)){
                return listaPessoas.indexOf(pessoaAgenda) + 1;
            }
        }
        return -1;
    };//informa em que posição da agenda está a pessoa.

    public void imprimeAgenda(){
            System.out.println("Lista de contatos da agenda:");
            int tamanhoLista = listaPessoas.size();
            for (int indice = 0; indice < tamanhoLista; indice++){
                System.out.println((indice + 1) +"º contato da agenda:");
                System.out.println("Nome: " + listaPessoas.get(indice).getNome());
                System.out.println("Idade: " + listaPessoas.get(indice).getIdade());
                System.out.println("Altura: " + listaPessoas.get(indice).getAltura());
                System.out.println("");
            }
    };// imprime os dados de todas as pessoas da agenda.

    public void imprimePessoa(int index){
        if (index < 0){
            System.out.println("Opção inválida.");
        }else{
            System.out.println("Dados do " + (index + 1) + "º contato da agenda:"); //somado 1 ao index para retornar a posição na agenda, tendo em vista que em uma agenda a contagem começa do 1, diferente da contagem de index.
            System.out.println("Nome: " + listaPessoas.get(index).getNome());
            System.out.println("Idade: " + listaPessoas.get(index).getIdade());
            System.out.println("Altura: " + listaPessoas.get(index).getAltura());
        }
    }; // imprime os dados da pessoa que está na posição “i” da agenda.

}
