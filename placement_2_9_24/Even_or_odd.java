package placement_2_9_24;

import java.util.Scanner;

public class Even_or_odd {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		n=scan.nextInt();
		if(n%2== 0)
			System.out.println("even");
		else
			System.out.println("odd");
		scan.close();
	}
}
