
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disks you want to move:");
		int n = sc.nextInt();
		towerOfHanoi(n, 'A', 'B', 'C');
		sc.close();
	}

	public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
		if (n == 1) {
			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
			return;
		}
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}
}