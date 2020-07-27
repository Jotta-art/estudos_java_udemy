import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		// Exercício URI  1018
		
		Scanner sc = new Scanner(System.in);
		
		int N, cem, cinquenta, vinte, dez, cinco, dois, um;
		int resto1, resto2, resto3, resto4, resto5, resto6;
		
		N = sc.nextInt();
		
		cem = N / 100;
		resto1 = N % 100;
		
		cinquenta = resto1 / 50;
		resto2 = resto1 % 50;
		
		vinte = resto2 / 20;
		resto3 = resto2 % 20;
		
		dez = resto3 / 10;
		resto4 = resto3 % 10;
		
		cinco = resto4 / 5;
		resto5 = resto4 % 5;
		
		dois = resto5 / 2;
		resto6 = resto5 % 2;
		
		um = resto6 / 1;
		
		System.out.println(N);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");

		
		sc.close();

	}

}
