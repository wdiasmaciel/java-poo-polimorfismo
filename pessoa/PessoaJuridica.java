package pessoa;

public class PessoaJuridica extends Pessoa {
   private String cnpj;

   public PessoaJuridica(String cnpj, String nome) {
    super(nome);
    this.cnpj = cnpj;
   }
   
   @Override
   public String toString() {
    return "CNPJ: " + this.cnpj + ", " + super.toString();
   }
}