import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		// Exercício URI 1116
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			
			if (y == 0) {
				
				System.out.println("divisao impossivel");
								
			}
			
			else {
				
				double divisao = (double)x / y;
				
				System.out.println(divisao);	
				
			}
			
		}
		
		sc.close();

	}

}
