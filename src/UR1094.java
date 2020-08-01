import java.util.Locale;
import java.util.Scanner;

public class UR1094 {

	public static void main(String[] args) {
		// Exercício URI 1094
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int totalCobaias = 0;
		int coelho = 0;
		int rato = 0;
		int sapo = 0;
		double Pcoelho = 0;
		double Prato = 0;
		double Psapo = 0;
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			String y = sc.next();
			
			totalCobaias += x;
			
			if (y.equals("C")) {
			
				coelho += x;
				
			}
			
			else if (y.equals("R")) {
				
				rato += x;
				
			}
			
			else {
				
				sapo += x;
				
			}
			
			
		}
		
		Pcoelho = (double)coelho / (double)totalCobaias * 100.0;
		Prato = (double)rato / (double)totalCobaias * 100.0;
		Psapo = (double)sapo / (double)totalCobaias * 100.0;
		
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.printf("Percentual de coelhos: %.2f %%%n", Pcoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", Prato);
		System.out.printf("Percentual de sapos: %.2f %%%n", Psapo);
		
		sc.close();

	}

}
