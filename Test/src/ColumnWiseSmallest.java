
public class ColumnWiseSmallest {
	public static void main(String[] args) {
		int r = 3;
		int c = 3;
		int a[][] = { { 12, 5, 21 }, { 4, 2, 6 }, { 7, 8, 3 } };
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				for (int k = j + 1; k < c; k++)
					if (a[j][i] >= a[k][i]) {
						int t = a[j][i];
						a[j][i] = a[k][i];
						a[k][i] = t;
					}

			}
		}
		for (int i = 0; i < c; i++)
			System.out.println("Smallest of " + i + " is " + a[0][i]);
	}
}
