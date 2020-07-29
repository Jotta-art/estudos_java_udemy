import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {
		// Exerecício URI 1049

		Scanner sc = new Scanner(System.in);

		String coluna, tipo, comida;

		coluna = sc.next();

		if (coluna.equals("vertebrado")) {

			tipo = sc.next();

			if (tipo.equals("ave")) {

				comida = sc.next();

				if (comida.equals("carnivoro")) {

					System.out.println("aguia");

				}

				else {

					System.out.println("pomba");

				}

			}

			else {

				comida = sc.next();

				if (comida.equals("onivoro")) {

					System.out.println("homem");

				}

				else {

					System.out.println("vaca");

				}

			}

		}

		else {

			tipo = sc.next();

			if (tipo.equals("inseto")) {

				comida = sc.next();

				if (comida.equals("hematofago")) {

					System.out.println("pulga");

				}

				else {

					System.out.println("lagarta");

				}

			}

			else {

				comida = sc.next();

				if (comida.equals("hematofago")) {

					System.out.println("sanguessuga");

				}

				else {

					System.out.println("minhoca");

				}

			}

		}

		sc.close();

	}

}
