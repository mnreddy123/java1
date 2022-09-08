package sep_05;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array elemenyts in sorting order:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("your array elements are:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("enter num which is going to search");
		int value = sc.nextInt();
		// int a[] = { 2, 3, 4, 5, 8, 9, 10, 22, 33 };
		int low = 0;
		int high = a.length - 1;
		// int value = 34;
		int mid = (low + high) / 2;
		System.out.println("\n low: " + low + " high: " + high + " mid: " + mid);
		boolean var = false;
		while (low <= high) {
			// mid = (low+high) / 2;
			if (a[mid] == value) {
				// var = true;
				System.out.println("entered value is found at " + mid + " index position");
				var = true;
				break;

			} else if (a[mid] < value) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (!var) {
			System.out.println("element not found");

		}
	}

}
