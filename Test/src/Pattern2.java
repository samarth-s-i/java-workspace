
public class Pattern2 {
	public static void main(String[] args) {
		int ch[] = new int[30];
		char chars[] = new char[30];
		char pat[][] = new char[4][5];
		for (int i = 1; i <= 26; i++)
			if (i % 5 == 0)
				ch[i] = 0;
			else
				ch[i] = i + 64;
		for (int i = 1; i <= ch.length; i++)
			for (int j = i + 1; j <= ch.length; j++)
				if (ch[i] < ch[j]) {
					int t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
		int k = 1;
		for (int i = 1; i <= 26; i++)
			chars[i] = (char) ch[i];
		for (int i = 1; i <= chars.length; i++)
			System.out.println(chars[i]);
//		for (int i = 0; i < 5; i++)
//			for (int j = 0; j < 4; j++) {
//				pat[i][j] = chars[k];
//				k++;
//			}
//
//		for (int i = 0; i < 5; i++)
//			for (int j = 0; j < 4; j++)
//				System.out.println(pat[i][j]);
	}
}
