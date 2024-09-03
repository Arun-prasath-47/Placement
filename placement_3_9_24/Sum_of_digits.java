package placement_3_9_24;

import java.util.Scanner;

public class Sum_of_digits {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=scan.nextInt();
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
		scan.close();
	}

}
