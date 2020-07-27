import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {
		// Exercício URI  1020
		
		Scanner sc = new Scanner(System.in);
		
		int idade, ano, mes, dia, resto1, resto2;
		
		idade = sc.nextInt();
		
		ano = idade / 365;
		resto1 = idade % 365;
		
		mes = resto1 / 30;
		resto2 = resto1 % 30;
		
		dia = resto2;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();

	}

}
