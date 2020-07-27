import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		// Exercício URI 1014
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x;
		double y, total;
		
		x = sc.nextInt();
		y = sc.nextDouble();
		
		total = x / y; 
		
		System.out.printf("%.3f km/l%n", total);		
		
		sc.close();

	}

}
