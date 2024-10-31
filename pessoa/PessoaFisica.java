package pessoa;

public class PessoaFisica {
   private String nome;
   private String cpf;

   public PessoaFisica(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
   }

   public String toString() {
    return "CPF: " + this.cpf + ", Nome: " + this.nome;
   }
}