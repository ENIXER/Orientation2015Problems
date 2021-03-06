import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
	private static Random rnd = new Random(System.currentTimeMillis());

	public static void main(String[] args) {
		generateSmallInputFile();
		generateLargeInputFile();
		for (int i = 0; i < 10; i++)
			generateRandomInputFile(i);
	}

	private static void generateSmallInputFile() {
		File file = new File("20-small.in");
		try {
			PrintStream stream = new PrintStream(file);
			int n = 10;
			stream.println(n);
			for (int i = 0; i < n; i++) {
				generateSmallTestCase(stream);
			}
		} catch (FileNotFoundException e) {
			return;
		}
	}

	private static void generateLargeInputFile() {
		File file = new File("21-large.in");
		try {
			PrintStream stream = new PrintStream(file);
			int n = 100;
			stream.println(n);
			for (int i = 0; i < n; i++) {
				generateLargeTestCase(stream);
			}
		} catch (FileNotFoundException e) {
			return;
		}
	}

	private static void generateRandomInputFile(int index) {
		File file = new File((50 + index) + "-random" + index + ".in");
		try {
			PrintStream stream = new PrintStream(file);
			int n = generateRandomNum(1, 100);
			stream.println(n);
			for (int i = 0; i < n; i++) {
				generateLargeTestCase(stream);
			}
		} catch (FileNotFoundException e) {
			return;
		}
	}

	private static void generateSmallTestCase(PrintStream stream) {
		StringBuilder sb = new StringBuilder();
		int n = generateRandomNum(2, 10);
		int t = generateRandomNum(1, 20);
		sb.append(n).append(" ").append(t);
		stream.println(sb.toString());
		int m = generateRandomNum(1, n - 1);
		stream.println(m);
		sb = new StringBuilder();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i);
		for (int i = 0; i < m; i++) {
			if (sb.length() > 0)
				sb.append(" ");
			sb.append(choiseRandom(list));
		}
		stream.println(sb.toString());
	}

	private static void generateLargeTestCase(PrintStream stream) {
		StringBuilder sb = new StringBuilder();
		int n = generateRandomNum(2, 1000);
		int t = generateRandomNum(1, 10000);
		sb.append(n).append(" ").append(t);
		stream.println(sb.toString());
		int m = generateRandomNum(1, n - 1);
		stream.println(m);
		sb = new StringBuilder();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(i);
		for (int i = 0; i < m; i++) {
			if (sb.length() > 0)
				sb.append(" ");
			sb.append(choiseRandom(list));
		}
		stream.println(sb.toString());
	}

	private static int generateRandomNum(int min, int max) {
		int len = max - min + 1;
		return rnd.nextInt(len) + min;
	}

	private static int choiseRandom(List<Integer> list) {
		int id = generateRandomNum(0, list.size() - 1);
		return list.remove(id);
	}

}
