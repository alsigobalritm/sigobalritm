
import java.util.Scanner;

public class Main {

//	전략
//	1. 남학생의 스위치 딸깍 메서드 - 자기 수의 배수면 스위치 딸깍
//	2. 여학생의 스위치 딸깍 메서드 - 자기 수를 중심으로 좌우대칭 + 가장 길게해서 모두다 딸깎
//		- (홀수 갯수만 딸깎 하게 된다)
//	3. 입력받은 대로 메서드에 넣어서 딸깍딸깍

	static int N; // 스위치 개수
	static int M; // 학생수
	static int[] light; // 스위치로하면 스위치문이랑 헷갈려서 ㅋㅋ

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		light = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			light[i] = sc.nextInt();
		}
		M = sc.nextInt(); // 초기화, 입력받기

		for (int i = 0; i < M; i++) { // 학생수만큼
			if (sc.nextInt() == 1) { // 남학생
				boy(sc.nextInt());
			} else { // 여학생
				girl(sc.nextInt());
			}
		}

		int n = 1; // 20줄마다 줄 띄울 용도

		// 양식에 맞게 출력
		for (int i = 1; i <= N; i++) {
			System.out.print(light[i] + " ");

			if (i / 20 == n) {
				System.out.println();
				n++;
			}
		}

	} // main

	// 남학생
	static void boy(int num) { // 자기 수의 배수면 스위치 딸깍
		int i = 1; // 배수 판단용도
		while (num * i <= N) { // 인덱스범위 내에서
			if (light[num * i] == 0) {
				light[num * i] = 1;
			} else {
				light[num * i] = 0;
			}
			i++;
		}
	} // boy()

	// 여학생
	static void girl(int num) { // 자기 수를 중심으로 좌우대칭 + 가장 길게해서 모두다 딸깎
		int i = 1;

		if (light[num] == 0) {
			light[num] = 1;
		} else {
			light[num] = 0;
		}

		while (num - i >= 1 && num + i <= N) { // 인덱스범위 내에서
			if (light[num - i] == light[num + i]) { // 좌우대칭이면
				if (light[num - i] == 0) {
					light[num - i] = 1;
					light[num + i] = 1;
				} else {
					light[num - i] = 0;
					light[num + i] = 0;
				}

			} else {
				return;
			}
			i++;
		}

	} // girl()
}
