import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		int a[] = new int[3];
		int b[] = new int[3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < b.length; i++)
			b[i] = sc.nextInt();
		int n = (a.length + b.length);
		int c[] = new int[n];
		for (int i = 0; i < n; i++)
			if (i < a.length)
				c[i] = a[i];
			else
				c[i] = b[i - a.length];
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (c[i] >= c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
		for (int i = 0; i < c.length; i++)
			System.out.println(c[i]);
	}
}
