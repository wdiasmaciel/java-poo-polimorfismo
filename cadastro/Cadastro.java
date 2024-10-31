package cadastro;

import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

public class Cadastro {
    int contPessoaFisica, contPessoaJuridica, quantidade;
    PessoaFisica[] pessoasFisicas;
    PessoaJuridica[] pessoasJuridicas;

    public Cadastro(int quantidade){
       this.contPessoaFisica = 0;
       this.contPessoaJuridica = 0;
       this.quantidade = quantidade;
       pessoasFisicas = new PessoaFisica[quantidade];
       pessoasJuridicas = new PessoaJuridica[quantidade];
    }

    public void cadastrarPessoaFisica(PessoaFisica pessoaFisica){
        if(this.contPessoaFisica < this.quantidade)
           pessoasFisicas[this.contPessoaFisica++] = pessoaFisica;
    }

    public void cadastrarPessoaJuridica(PessoaJuridica pessoaJuridica){
        if(this.contPessoaJuridica < this.quantidade)
           pessoasJuridicas[this.contPessoaJuridica++] = pessoaJuridica;
    }

    public String toString(){
        String mensagem = "--- Pessoas Fisicas Cadastradas: ---\n";
        for(PessoaFisica pessoaFisica : pessoasFisicas)
          mensagem += pessoaFisica.toString() + "\n";
        
        mensagem += "\n\n--- Pessoas Juridicas Cadastradas: ---\n";
        for(PessoaJuridica pessoaJuridica : pessoasJuridicas)
          mensagem += pessoaJuridica.toString() + "\n";

        return mensagem;
    }
}