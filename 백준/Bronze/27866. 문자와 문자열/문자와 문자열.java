import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int i = sc.nextInt();

		// S의 i번째 글자를 출력 -> 인덱스는 -1
		System.out.println(S.charAt(i - 1));

	}

}
