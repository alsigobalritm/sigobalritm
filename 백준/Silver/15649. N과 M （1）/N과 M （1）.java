

import java.util.Scanner;

public class Main {

	static int n, m;
	static int[] nums;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		nums = new int[n + 1];
		arr = new int[m + 1];
		visited = new boolean[n + 1];

		for (int i = 1; i < n + 1; i++) {
			nums[i] = i;
		} // 1~n까지 자연수 배열

		p(1);

	} // main

	static void p(int idx) {
		// idx = 결과 배열에 저장할 위치

		// 종료조건
		if (idx == m + 1) { // 마지막 인덱스까지 다 채우고 나서 또 들어오면
			for (int i = 1; i < m + 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			// 출력하고 리턴
			return;
		}

		// 재귀부분
		for (int i = 1; i < n + 1; i++) { // 1~n까지에서
			if (!visited[i]) { // 사용되지 않았으면
				arr[idx] = i; // idx칸에 넣기
				visited[i] = true; // 방문했다고 체크
				p(idx + 1); // 다음 자리 판단
				visited[i] = false; // 원상복구(방문 안한척)?
			}
		}

	}

}
