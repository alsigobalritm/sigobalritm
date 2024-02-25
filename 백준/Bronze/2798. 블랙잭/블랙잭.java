import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 전체 카드수
		int M = sc.nextInt(); 	
		// M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합

		int max = 0;
		
		int[] cards = new int[N];
		for (int i=0; i<N; i++) {
			cards[i] = sc.nextInt();
		}
		
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int r=j+1; r<N; r++) {
					if (cards[i]+cards[j]+cards[r] >= max && cards[i]+cards[j]+cards[r] <= M) {
						max = cards[i]+cards[j]+cards[r];
					}
				}
			}
		}
		
		System.out.println(max);
		
	}

}
