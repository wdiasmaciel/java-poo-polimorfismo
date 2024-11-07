package pessoa;

public interface PessoaInterface {
    String NASCIMENTO = "abc"; //Constante (public static final String NASCIMENTO = "abc")
    int NUM = 5; //Constante (public static final int NUM = 5)

    default void cumprimentar(){
        System.out.println("Olá, Mundo!");
    }
}