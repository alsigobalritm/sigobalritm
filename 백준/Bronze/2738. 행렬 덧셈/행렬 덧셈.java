import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] numsA = new int[N][M];

		// numsA에 B를 더해서 출력
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < M; col++) {
				numsA[row][col] = sc.nextInt();
			}
		}

		for (int row = 0; row < N; row++) {
			for (int col = 0; col < M; col++) {
				numsA[row][col] += sc.nextInt();
				System.out.print(numsA[row][col] + " ");
			}
			System.out.println();
		}

	}

}
