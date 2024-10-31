import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;
import cadastro.Cadastro;

public class Main {
    public static void main(String[] args){
        Cadastro cadastro = new Cadastro(3);

        PessoaFisica pessoaFisica1 = new PessoaFisica("1", "Ana");
        PessoaFisica pessoaFisica2 = new PessoaFisica("2", "Bruna");
        PessoaFisica pessoaFisica3 = new PessoaFisica("3", "Caio");
  
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("1", "XYZ");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("2", "ABC");
        PessoaJuridica pessoaJuridica3 = new PessoaJuridica("3", "MNP");

        cadastro.cadastrarPessoaFisica(pessoaFisica1);
        cadastro.cadastrarPessoaFisica(pessoaFisica2);
        cadastro.cadastrarPessoaFisica(pessoaFisica3);

        cadastro.cadastrarPessoaJuridica(pessoaJuridica1);
        cadastro.cadastrarPessoaJuridica(pessoaJuridica2);
        cadastro.cadastrarPessoaJuridica(pessoaJuridica3);

        System.out.println(cadastro);
    }
}