
import java.util.Scanner;

public class Solution {

	static int N, K;
	static int[][] puzzle;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			K = sc.nextInt();
			puzzle = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			} // 입력받기, 초기화

			int ans = 0;

			// 행 우선 탐색 -> K칸인지 찾기
			for (int i = 0; i < N; i++) {
				int count = 0;
				for (int j = 0; j < N; j++) {
					if (puzzle[i][j] == 1) {
						count++;
					} else {
						if (count == K) {
							ans++; // 단어가 딱 맞게 들어간다면 답에 더해준다
						}
						count = 0;
					}
				}
				if (count == K) {
					ans++; // 행을 다 돌았는데 count == K 인 경우 있을 수도 있어서 체크
				}
			}

			// 열 우선 탐색
			for (int j = 0; j < N; j++) {
				int count = 0;
				for (int i = 0; i < N; i++) {
					if (puzzle[i][j] == 1) {
						count++;
					} else {
						if (count == K) {
							ans++;
						}
						count = 0;
					}
				}
				if (count == K) {
					ans++;
				}
			}

			System.out.printf("#%d %d\n", t, ans);
		}
	}
}
