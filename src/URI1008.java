import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		//Exercício URI 1007
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int NUMBER, hoursWORKED;
		double HOURS, SALARY; 
		
		NUMBER = sc.nextInt();
		hoursWORKED = sc.nextInt();
		HOURS = sc.nextDouble();
		
		SALARY =  hoursWORKED * HOURS;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		
		sc.close();
		
	}

}
