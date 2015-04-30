import java.util.Scanner;

public class Validator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int v = sc.nextInt();
			int e = sc.nextInt();
			if ((v | e) == 0)
				break;
			checkRange(v, 2, 1000);
			checkRange(e, 0, 1000);
			for (int i = 0; i < e; i++) {
				int s = sc.nextInt();
				int g = sc.nextInt();
				checkRange(s, 1, v);
				checkRange(g, 1, v);
				if (s == g)
					System.exit(1);
			}
		}
		sc.close();
	}

	private static void checkRange(int n, int min, int max) {
		if (n >= min && n <= max)
			return;
		System.exit(1);
	}

}
