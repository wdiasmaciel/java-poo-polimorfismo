package pessoa;

public class PessoaFisica extends Pessoa {
   private String cpf;

   public PessoaFisica(String cpf, String nome) {
    super(nome);
    this.cpf = cpf;
   }
   
   @Override
   public String toString() {
    return "CPF: " + this.cpf + ", " + super.toString();
   }

   @Override
   public void cumprimentar(){
      System.out.println("Olá, sou uma pessoa física!");
  }

  public void cumprimentar(String parametro){
    System.out.println("Olá, sou uma pessoa física!" + parametro);
  }

}