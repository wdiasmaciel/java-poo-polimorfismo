package pessoa;

public class Pessoa implements PessoaInterface {
    String nome;

    public Pessoa(String nome){
       this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: " + nome;
    }
}