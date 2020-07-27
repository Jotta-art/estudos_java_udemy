import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido4_1 {

	public static void main(String[] args) {
		// Exercício Resolvido 1 Seção 4
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double nota1, nota2, notaFinal;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		System.out.printf("NOTA FINAl = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			
			System.out.println("REPROVADO");
			
		}
	
		sc.close();
		
	}

}
