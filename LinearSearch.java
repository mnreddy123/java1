package sep_05;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter your array elements:");
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

		// int a[] = { 1, 2, 34, 33, 55, 22 };
		// int n1 = a.length;
		// int value = 56;
		boolean val = false;
		for (int i = 0; i < n; i++) {
			if (a[i] == value) {
				val = true;
				System.out.println("\nvalue is found at position :" + i);
			}

		}
		if (!val) {
			System.out.println("not exist");
		}

	}
}
