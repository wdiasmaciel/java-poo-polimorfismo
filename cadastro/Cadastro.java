package cadastro;

import pessoa.PessoaFisica;

public class Cadastro {
    int cont, quantidade;
    PessoaFisica[] pessoas;

    public Cadastro(int quantidade){
       this.cont = 0;
       this.quantidade = quantidade;
       pessoas = new PessoaFisica[quantidade];
    }

    public void cadastrar(PessoaFisica pessoaFisica){
        if(this.cont < this.quantidade)
           pessoas[cont++] = pessoaFisica;
    }

    public String toString(){
        String mensagem = "--- Pessoas Cadastradas: ---\n";
        for(PessoaFisica pessoaFisica : pessoas)
          mensagem += pessoaFisica.toString() + "\n";
        return mensagem;
    }
}