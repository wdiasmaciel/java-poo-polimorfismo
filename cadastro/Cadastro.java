package cadastro;

import pessoa.Pessoa;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

public class Cadastro {
    int cont, quantidade;
    Pessoa[] pessoas;

    public Cadastro(int quantidade){
       this.cont = 0;
       this.quantidade = quantidade;
       pessoas = new Pessoa[quantidade];
    }

    public void cadastrar(Pessoa pessoa){
        if(this.cont < this.quantidade)
           pessoas[this.cont++] = pessoa;
    }

    public String toString(){
        String mensagem = "--- Pessoas Cadastradas: ---\n";

        for(Pessoa pessoa : pessoas)
          mensagem += pessoa.toString() + "\n";
        
        return mensagem;
    }
}