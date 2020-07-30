import java.util.Scanner;

public class Exercicio_reaolvidoURI1113 {

	public static void main(String[] args) {
		// Exercício Resolvido URI 1113
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			
			if (x < y) {
				
				System.out.println("Crescente");
				
			}
			
			else {
				
				System.out.println("Decrescente");
				
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		sc.close();

	}

}
