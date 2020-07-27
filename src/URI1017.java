import java.util.Locale;
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		// Exercício URI 1017
		
		Scanner sc = new Scanner(System.in); 
		Locale.setDefault(Locale.US);
		
		int horas, VM;
		double distancia, litros;
		
		horas = sc.nextInt();
		VM = sc.nextInt();
		
		distancia = VM * horas;
		
		litros = distancia / 12;
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}
