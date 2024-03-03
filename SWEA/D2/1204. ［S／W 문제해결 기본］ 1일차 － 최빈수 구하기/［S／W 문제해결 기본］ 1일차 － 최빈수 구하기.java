

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// 0~100까지의 카운트배열을 만들어서 저장하고 최대값 중 가장 큰 점수를 출력
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			t = sc.nextInt();

			int[] count = new int[101]; // 점수는 0~100점

			for (int i = 0; i < 1000; i++) { // 학생 수 = 1000명
				count[sc.nextInt()]++;
			}

			int max = 0;
			int maxidx = 0;
			for (int i = 0; i < 101; i++) {
				if (count[i] >= max) {
					max = count[i];
					maxidx = i;
				}
			}
			System.out.printf("#%d %d\n", t, maxidx);
		}
	}

}