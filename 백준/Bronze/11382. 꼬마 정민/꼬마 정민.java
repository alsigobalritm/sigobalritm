import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// double로 받아야하고 출력 형식 주의

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.printf("%.0f", (A + B + C));

	}

}
