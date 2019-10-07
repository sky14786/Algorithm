import java.util.ArrayList;

public class Algorithm {
	public static void main(String[] args) {
		int target1 = 16384;
		int target2 = 28840;
		int max = target1 > target2 ? target1 : target2;

		// 나눠질 수
		int min = target1 > target2 ? target2 : target1;
		// 나눌 수
		int nmg = max % min;
		// 최대 공약수
		int temp = 0;

		while (nmg != 0) {
			temp = nmg;
			nmg = min % nmg;
			min = temp;
		}

		System.out.println(temp);

	}
}
