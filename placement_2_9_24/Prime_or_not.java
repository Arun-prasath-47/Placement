package placement_2_9_24;

import java.util.Scanner;

public class Prime_or_not {
	public static void main(String[] args) {
		int n;
		boolean flag=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		n=scan.nextInt();
		for(int i=2;i<n/2;i++)
		{
			if(n%i == 0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("prime");
		else
			System.out.println("not prime");
		scan.close();
	}

}
