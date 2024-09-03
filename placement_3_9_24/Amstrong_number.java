package placement_3_9_24;

import java.util.Scanner;

public class Amstrong_number {
	public static void main(String[] args) {
		int n,org,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=org=scan.nextInt();
		int len=String.valueOf(org).length();
		while(n>0)
		{
			sum+=Math.pow(n%10, len);
			n=n/10;
		}
		System.out.println("sum="+sum);
		if(sum==org)
		{
			System.out.println("Amstrong");
		}
		else
			System.out.println("Not Amstrong");
		scan.close();
			
		
	}

}
