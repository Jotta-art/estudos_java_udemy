import java.util.Scanner;

public class Main4_34 {

	public static void main(String[] args) {
		// Exemplo if simples

		Scanner sc = new Scanner(System.in);

		int horas;

		System.out.println("Que horas são?");
		horas = sc.nextInt();

		if (horas < 12) 

			System.out.println("Bom dia");

		

		else if (horas < 18) {

			System.out.println("Bom tarde");

		}

		else {
				
			System.out.println("Bom noite");
				
		}
				
		sc.close();

	}

}
