import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {
		// Exercício URI 1131

		Scanner sc = new Scanner(System.in);
		
		int grenais = 1;
		int grenaisInter = 0;
		int grenaisGremio = 0;
		int empates = 0;
		String vencedor = "";

		int inter = sc.nextInt();
		int gremio = sc.nextInt();
		
		if (inter > gremio) {

			grenaisInter += 1;

		}

		else {

			grenaisGremio += 1;

		}

		if (inter == gremio) {

			empates += 1;

		}
		
		System.out.println("Novo grenal (1-sim 2-nao)");
		int x = sc.nextInt();

		while (x == 1) {
			
				grenais += 1;

			if (inter > gremio) {

				grenaisInter += 1;

			}

			else {

				grenaisGremio += 1;

			}

			if (inter == gremio) {

				empates += 1;

			}
			
			inter = sc.nextInt();
			gremio = sc.nextInt();
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			x = sc.nextInt();

		}

		if (grenaisInter > grenaisGremio) {

			vencedor = "Inter";

		}

		else {

			vencedor = "Gremio";

		}

		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + grenaisInter);
		System.out.println("Gremio:" + grenaisGremio);
		System.out.println("Empates:" + empates);
		System.out.println(vencedor + " venceu mais");

		sc.close();

	}

}