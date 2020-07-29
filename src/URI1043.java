import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) throws IOException {
		// Exercício URI 1043 (resposta da internet)

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float A, B, C, perimetro, area;

		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();

		if ((A < (float)(B + C)) && (B < (float)(A + C)) && (C < (float)(B + A))) {

			perimetro = A + B + C;

			System.out.printf("Perimetro = %.1f%n", perimetro);

		}

		else {

			area = ((A + B) * C) / 2;

			System.out.printf("Area = %.1f%n", area);

		}

		sc.close();

	}

}
