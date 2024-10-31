package pessoa;

public class PessoaJuridica {
   private String nome;
   private String cnpj;

   public PessoaJuridica(String cnpj, String nome) {
    this.cnpj = cnpj;
    this.nome = nome;
   }

   public String toString() {
    return "CNPJ: " + this.cnpj + ", Nome: " + this.nome;
   }
}