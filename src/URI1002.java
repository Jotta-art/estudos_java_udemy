import java.util.Scanner;
import java.util.Locale;

public class URI1002 {
	
	//Teste commit versao 2
	//Teste commit outro dev
	public static void main(String[] args) {
		//Exercício URI 1002
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double area, n, raio;
		
		n = 3.14159;
		
		System.out.println("Digite o raio:");
		raio = sc.nextDouble();
		
		
		area = n * (raio * raio);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
		
	}

}
