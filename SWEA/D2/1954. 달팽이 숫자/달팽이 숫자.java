
import java.util.Scanner;

public class Solution {

	static int N, count;
	static int[][] snail;

	static int[] dr = { 1, 0, -1, 0 }; // 우 하 좌 상
	static int[] dc = { 0, 1, 0, -1 };

	static int d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			// n크기의 달팽이 출력
			// 1부터 N*N 까지
			snail = new int[N][N];
			count = 1;

			d = 0; // 델타배열 인덱스 초기화

			// 값 넣기
			int i = 0;
			int j = 0; // 0, 0에서 시작

			snail[i][j] = count++; // 1 넣고 시작

			while (count <= N * N) {
				// N*N까지 가도록 while문
				if (0 <= i + dr[d % 4] && i + dr[d % 4] < N && 0 <= j + dc[d % 4] && j + dc[d % 4] < N
						&& snail[i + dr[d % 4]][j + dc[d % 4]] == 0) {
					// 한칸 더 갔을 때 0이면서 경계조건 안이라면
					snail[i + dr[d % 4]][j + dc[d % 4]] = count++; // 값 넣어주고
					i += dr[d % 4];
					j += dc[d % 4];
					// 칸 증가
				} else { // 아니면 방향 틀기
					d++;
				}
			}

			// 출력
			System.out.println("#" + t);
			for (int row = 0; row < N; row++) {
				for (int col = 0; col < N; col++) {
					System.out.print(snail[col][row] + " ");
				}
				System.out.println();
			}
		}
	}

}
