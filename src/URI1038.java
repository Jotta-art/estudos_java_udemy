import java.util.Locale;
import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		// Exercício URI 1038

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double lanche = 0;		

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		switch (codigo) {

		case 1:

			lanche = quantidade * 4.0 ;

			break;

		case 2:

			lanche = quantidade * 4.5 ;

			break;

		case 3:

			lanche = quantidade * 5.0 ;

			break;

		case 4:

			lanche = quantidade * 2.0 ;

			break;

		case 5:

			lanche = quantidade * 1.5 ;

			break;

		}
		
		System.out.printf("Total: R$ %.2f%n", lanche);

		sc.close();

	}

}
