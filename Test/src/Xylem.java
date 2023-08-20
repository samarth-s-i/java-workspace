import java.util.Scanner;

public class Xylem {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0, mul = 1;
		while (n != 0) {
			int r = n % 10;
			sum += r;
			mul *= r;
			n /= 10;
		}
		if (sum == mul)
			System.out.println(temp + " is a xylem number");
		else
			System.out.println(temp + " is not a xylem number");
	}
}
