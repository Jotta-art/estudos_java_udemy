import java.util.Locale;
import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		// Exercício URI  1013
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int A, B, C, maiorInicial, maiorFinal;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
	
		maiorInicial = (A + B + Math.abs(A - B)) / 2;
		maiorFinal = (maiorInicial + C + Math.abs(maiorInicial - C)) / 2;
		
		System.out.println(maiorFinal + " eh o maior");
		
		sc.close();

	}

}
