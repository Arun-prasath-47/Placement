package placement_2_9_24;

import java.util.Scanner;

public class Even_no_between_1_to_n {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		n=scan.nextInt();
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		scan.close();
	}

}
