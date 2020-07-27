import java.util.Scanner;
import java.util.Locale;

public class URI1005 {

	public static void main(String[] args) {
		// Exercício URI 1005
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, media;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		media = (A * 3.5 + B * 7.5) / 11;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}

}
