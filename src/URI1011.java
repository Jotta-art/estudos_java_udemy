import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		// Exercício URI  1011
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio, volume;
		
		raio = sc.nextDouble();
		
		volume = (4.0/3.0) * 3.14159 * Math.pow(raio, 3.0);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
