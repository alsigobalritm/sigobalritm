

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static char[] ABC = new char[26];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			// N개의 제목을 규칙에 따라 몇 개까지 쓸 수 있는지 판단
			// String의 맨 앞글자만 판단하기
			char[] words = new char[N]; // N사이즈의 char배열에 넣고 정리

			for (int i = 0; i < N; i++) {
				String temp = sc.next();
				words[i] = temp.charAt(0);
			}

			Arrays.sort(words);

			char count = 65;
			// A~Z까지의 char배열 만들기
			for (int i = 0; i < 26; i++) {
				ABC[i] = count++;
			}

			int ABCidx = 0;

			for (int i = 0; i < N; i++) {
				if (words[i] == ABC[ABCidx]) {
					ABCidx++;
					if (ABCidx == 26) {
						break; // 인덱스범위 벗어나면 break
					}
				}
			}

			System.out.printf("#%d %d\n", t, ABCidx);
		}
	}

}