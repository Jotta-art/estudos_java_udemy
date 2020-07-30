import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		// Exercício URI 1134
		
		Scanner sc = new Scanner(System.in);
		
		int tipo = sc.nextInt();
		int alcool = 0;
		int gasol = 0;
		int diesel = 0;
		
		while (tipo != 4) {
			
			if (tipo == 3) {
				
				diesel += 1;
				
			}
			
			else if (tipo == 2) {
				
				gasol += 1;
				
			}
			
			else if (tipo == 1) {
				
				alcool += 1;
				
			}
			
				tipo = sc.nextInt();
		
	}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasol);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
	}	
}