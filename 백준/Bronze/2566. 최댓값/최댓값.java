import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[9][9];

		int max = 0;
		int maxrow = 0;
		int maxcol = 0;

		// 입력을 받으면서 최대값 찾기
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = sc.nextInt();
				if (board[i][j] >= max) {
					max = board[i][j];
					maxrow = i + 1; // 번호가 1~9임에 주의
					maxcol = j + 1;
				}
			}
		}

		System.out.println(max);
		System.out.println(maxrow + " " + maxcol);

	}

}
