import java.util.Scanner;

public class Solution {

	static int N, speed, command, ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			// 매 초마다 0 1 2 주어짐 (1이나 2는 가속도의 값이 추가로 주어짐)
			// 가속도는 1or2 // 감속을 마이너스수준으로 하면 0으로 고정된다
			// N초 동안 이동한 거리를 계산
			N = sc.nextInt();// 2<=N<=30

			speed = 0; // 속도를 speed에 저장 // 초기 속도는 0m/s
			ans = 0; // 이동한 거리
			
			// N번 반복문안에서 조건문으로 command 판단
			for (int i = 0; i < N; i++) {
				command = sc.nextInt();
				if (command == 1) {
					speed += sc.nextInt();
				} else if (command == 2) {
					speed -= sc.nextInt();
					if (speed < 0) {
						speed = 0;
					}
				} // 0 일 경우 아무것도 안해도 현재 속도 유지
				ans += speed;
			}
			System.out.printf("#%d %d\n", t, ans);
		}
	}

}