package placement_2_9_24;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n,i,n1=0,n2=1,n3;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		n=scan.nextInt();
		if(n==1)
		{
			System.out.print("0 ");
			scan.close();
			System.exit(0);
		}
		if(n==2)
		{
			System.out.print("0 1 ");
			scan.close();
			System.exit(0);
		}
		if(n>2)
		{
			System.out.print("0 1 ");
			for(i=2;i<n;i++)
			{
				n3=n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
			scan.close();
			System.exit(0);
		}
		else {
			System.out.println("Not possibe \nnumber must be greater than or equal to 1");
		}
		
	}
}
