import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido3 {

	public static void main(String[] args) {
		// Exercício Resolvido 3
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (double) (idade1 + idade2) / 2;
		//também pode ser feito da seguinte forma:
	  //double media = (idade1 + idade2) / 2.0;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);		
		
		sc.close();
		

	}

}
