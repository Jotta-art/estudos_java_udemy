import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		// Exercício URI 1132
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min = 0;
		int max = 0;
		
		if (x < y) {
			
			min = x;
			max = y;
			
		}
		
		else {
			
			min = y;
			max = x;
			
		}
		
		int soma = 0;
		
		for (int i = min; i <= max; i++) {
			
			if (i % 13 != 0 ) {
				
				soma += i;
				
			}
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
