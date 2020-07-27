import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		// Exercício URI 1046
		
		Scanner sc = new Scanner(System.in);

		int duracao, inicio, fim;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			
			duracao = fim - inicio;
			
		}
		
		else {
			
			duracao = 24 - inicio + fim;
			
		}
				
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
