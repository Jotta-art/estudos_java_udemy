import java.util.Scanner;

public class Exercicio_resolvido4_3 {

	public static void main(String[] args) {
		// Exercício Resolvido 3 Seção 4
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a < b && a < c) {
			
			System.out.println("MENOR = " + a);
			
		}
		
		else if (b < c) {
			
			System.out.println("MENOR = " + b);
			
		}
		
		else {
			
			System.out.println("MENOR = " + c);
			
		}
		
		sc.close();
		

	}

}
