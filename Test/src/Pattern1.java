
public class Pattern1 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int pat[][] = new int[4][5];
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (k > a.length - 1) {
					k = 0;
					pat[i][j] = a[k];
					k++;
				} else {
					pat[i][j] = a[k];
					k++;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(pat[i][j] + "\t");
			System.out.println();
		}
	}
}
