import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		// Exercício URI 1047

		Scanner sc = new Scanner(System.in);

		int horaInicio, minutoInicio, horaFinal, minutoFinal, duracao;

		horaInicio = sc.nextInt();
		minutoInicio = sc.nextInt();
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();

		if (horaInicio < horaFinal) {

			duracao = horaFinal - horaInicio;

		}

		else {

			duracao = 24 - horaInicio + horaFinal;

		}
		
		if (horaInicio < horaFinal) {

			duracao = minutoFinal - minutoInicio;

		}

		else {

			duracao = 60 - horaInicio + horaFinal;

		}

		sc.close();

	}

}
