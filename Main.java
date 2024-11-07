import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;
import cadastro.Cadastro;

public class Main {
    public static void main(String[] args){
        Cadastro cadastro = new Cadastro(6);

        PessoaFisica pessoaFisica1 = new PessoaFisica("1", "Ana");
        PessoaFisica pessoaFisica2 = new PessoaFisica("2", "Bruna");
        PessoaFisica pessoaFisica3 = new PessoaFisica("3", "Caio");
  
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("1", "XYZ");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("2", "ABC");
        PessoaJuridica pessoaJuridica3 = new PessoaJuridica("3", "MNP");

        cadastro.cadastrar(pessoaFisica1);
        cadastro.cadastrar(pessoaFisica2);
        cadastro.cadastrar(pessoaFisica3);

        pessoaFisica3.cumprimentar();
        pessoaFisica3.cumprimentar("PessoaFisica3");

        cadastro.cadastrar(pessoaJuridica1);
        cadastro.cadastrar(pessoaJuridica2);
        cadastro.cadastrar(pessoaJuridica3);

        System.out.println(cadastro);
    }
}