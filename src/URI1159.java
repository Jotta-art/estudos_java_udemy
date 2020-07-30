import java.util.Scanner;

public class URI1159 {

	public static void main(String[] args) {
		// Exercício URi 1159
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			
			if (x % 2 == 0) {
				
			soma = x +  (x + 2) + (x + 4) + (x + 6) + (x + 8);
			
			System.out.println(soma);
				
			}
			
			else {
				
				x += 1;
				
				soma = x +  (x + 2) + (x + 4) + (x + 6) + (x + 8);
				
				System.out.println(soma);

			}
			
			x = sc.nextInt();
			
		}
		
		sc.close();

	}

}
