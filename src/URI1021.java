import java.util.Locale;
import java.util.Scanner;

public class URI1021 {

	public static void main(String[] args) {
		// Exercício URI 1021

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cem, cinquenta, vinte, dez, cinco, dois;
		int Mcem, Mcinquenta, MvinteCinco, Mdez, Mcinco, Mum;
		int resto, resto1, resto2, resto3, resto4, resto5, resto6;
		int resto7, resto8, resto9, resto10, resto11;
		double N;

		N = sc.nextDouble();

		// Vamos multiplicar N por 100 e forçar a conversão para int.
		// Desse modo, por exemplo, 576.73 vai se tornar 57673
		
		// Vamos tambem somar 0.5 antes de converter, para assegurar
		// que o numero seja devidamente arredondado, pois o tipo double
		// as vezes da problema de arredondamento (por exemplo: se digitarmos
		// 576.81 e multiplicarmos por 100, o resultado sera 57680.99999999,
		// dai o casting resultaria em 57680 e nao 57681 como desejado)

		resto = (int) (N * 100.0 + 0.5);

		cem = resto / (100 * 100);
		resto1 = resto % (100 * 100);

		cinquenta = resto1 / (50 * 100);
		resto2 = resto1 % (50 * 100);

		vinte = resto2 / (20 * 100);
		resto3 = resto2 % (20 * 100);

		dez = resto3 / (10 * 100);
		resto4 = resto3 % (10 * 100);

		cinco = resto4 / (5 * 100);
		resto5 = resto4 % (5 * 100);

		dois = resto5 / (2 * 100);
		resto6 = resto5 % (2 * 100);

		Mcem = resto6 / 100;
		resto7 = resto6 % 100;

		Mcinquenta = resto7 / 50;
		resto8 = resto7 % 50;

		MvinteCinco = resto8 / 25;
		resto9 = resto8 % 25;

		Mdez = resto9 / 10;
		resto10 = resto9 % 10;

		Mcinco = resto10 / 5;
		resto11 = resto10 % 5;

		Mum = resto11 / 1;

		System.out.println("NOTAS:");
		System.out.println(cem + " nota(s) de R$ 100.00");
		System.out.println(cinquenta + " nota(s) de R$ 50.00");
		System.out.println(vinte + " nota(s) de R$ 20.00");
		System.out.println(dez + " nota(s) de R$ 10.00");
		System.out.println(cinco + " nota(s) de R$ 5.00");
		System.out.println(dois + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(Mcem + " moeda(s) de R$ 1.00");
		System.out.println(Mcinquenta + " moeda(s) de R$ 0.50");
		System.out.println(MvinteCinco + " moeda(s) de R$ 0.25");
		System.out.println(Mdez + " moeda(s) de R$ 0.10");
		System.out.println(Mcinco + " moeda(s) de R$ 0.05");
		System.out.println(Mum + " moeda(s) de R$ 0.01");

		sc.close();

	}

}
