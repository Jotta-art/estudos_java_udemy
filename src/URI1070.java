import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		//Exercicio URI 1070
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if (!(n % 2 == 0)) {
			
			System.out.println(n);
			
		} 
		
		else {
			
			n += 1;
			
			System.out.println(n);
		
		}
		
		n += 2;
		System.out.println(n);
		
		n += 2;
		System.out.println(n);
		
		n += 2;
		System.out.println(n);
		
		n += 2;
		System.out.println(n);
		
		n += 2;
		System.out.println(n);
		
		sc.close();

	}

}
