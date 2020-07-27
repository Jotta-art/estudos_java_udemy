import java.util.Locale;
import java.util.Scanner;

public class URI1061 {

	public static void main(String[] args) {
		// Exercício URI  1061
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String d;
		int w, x, y, z;
		int w1, x1, y1, z1;
		int dia, hora, minuto, segundo;
		int inicio, fim, duracao, resto;
		
		d = sc.next();
		w = sc.nextInt();
		x = sc.nextInt();
		d = sc.next();
		y = sc.nextInt();
		d = sc.next();
		z = sc.nextInt();
		
		d = sc.next();
		w1 = sc.nextInt();
		x1 = sc.nextInt();
		d = sc.next();
		y1 = sc.nextInt();
		d = sc.next();
		z1 = sc.nextInt();
		
		inicio = w*24*60*60 + x*60*60 + y*60 + z;
		fim = w1*24*60*60 + x1*60*60 + y1*60 + z1;
		duracao = fim - inicio;
		
		dia = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		hora = resto / (60*60);
		resto = resto % (60*60);
		minuto = resto / 60;
		segundo = resto % 60;
		
		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(minuto + " minuto(s)");
		System.out.println(segundo + " segundo(s)");
		
		sc.close();

	}

}
