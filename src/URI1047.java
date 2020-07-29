import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		// Exercício URI 1047

		Scanner sc = new Scanner(System.in);

		int horaInicial, minutoInicial, horaFinal, minutoFinal, inicio, fim, duracao, duracaoHoras, duracaoMinutos; 

		horaInicial = sc.nextInt();
		minutoInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();
		
		inicio = horaInicial * 60 + minutoInicial;
		fim = horaFinal * 60 + minutoFinal;		
		
		if (inicio < fim) {

			duracao = fim - inicio;

		}

		else {

			duracao = (24 * 60 - inicio) + fim;

		}
		
		duracaoHoras = duracao / 60;
		duracaoMinutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E "  + duracaoMinutos + " MINUTO(S)");

		sc.close();

	}

}
