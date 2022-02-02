import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
        
	String produto1 = "Computador";
    String produto2 = "mesa de trabalho";
    int idade = 27;
    int codigo = 1993;
    char sexo = 'M';
    double preço1 = 2100.00;
    double preço2 = 1000.00;
    double medida = 50.258769;

    System.out.println("Produtos:");
    System.out.printf("%s, o preço do computador é %.2f%n", produto1, preço1);
    System.out.printf("%s o preço da mesa de trabalho é %.2f%n", produto2, preço2);
    System.out.println();
    System.out.printf("Registro: %d anos de idade, codigo %d e do sexo : %c%n", idade, codigo, sexo);
    System.out.println();
    System.out.printf("medida com oito casas decimais: %.8f%n", medida);
    System.out.printf("Rodado: (três casas decimais): %.3f%n", medida);
    System.out.println();
    Locale.setDefault(Locale.US);
    System.out.printf("ponto decimal dos USA %.3f%n", medida);
	}
}
