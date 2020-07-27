import java.util.Scanner;
import java.util.Locale;

public class URI1006 {

	public static void main(String[] args) {
		// Exercício URI 1006
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C, media;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		media = (A * 2 + B * 3 + C * 5) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
	}

}
