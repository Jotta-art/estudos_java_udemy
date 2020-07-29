import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		// Exercicio URI 1066

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, n5, positivo, negativo, par, impar;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();

		par = 0;
		impar = 0;
		positivo = 0;
		negativo = 0;

		if (n1 % 2 == 0) {

			par += 1;

		}

		else {

			impar += 1;

		}

		if (n2 % 2 == 0) {

			par += 1;

		}

		else {

			impar += 1;

		}

		if (n3 % 2 == 0) {

			par += 1;

		}

		else {

			impar += 1;

		}

		if (n4 % 2 == 0) {

			par += 1;

		}

		else {

			impar += 1;

		}

		if (n5 % 2 == 0) {

			par += 1;

		}

		else {

			impar += 1;

		}
		
		
		
		if (n1 > 0) {

			positivo += 1;

		}

		else if (n1 < 0) {

			negativo += 1;

		}

		if (n2 > 0) {

			positivo += 1;

		}

		else if (n2 < 0) {

			negativo += 1;

		}

		if (n3 > 0) {

			positivo += 1;

		}

		else if (n3 < 0) {

			negativo += 1;

		}

		if (n4 > 0) {

			positivo += 1;

		}

		else if (n4 < 0) {

			negativo += 1;

		}

		if (n5 > 0) {

			positivo += 1;

		}

		else if (n5 < 0) {

			negativo += 1;

		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

		sc.close();

	}

}
