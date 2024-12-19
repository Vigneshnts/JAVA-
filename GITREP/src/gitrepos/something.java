package gitrepos;

import java.util.Scanner;

public class something {

	public static void main(String[] args) {
		System.out.println("Welcome");

		Scanner sc = new Scanner(System.in );
	
		System.out.println("Enter the number");
		int p=sc.nextInt();
		
		if(p%2==0)
		{
			System.out.println("Not a prime number");
			
		}
		else
		{
			System.out.println("Prime number");
		}

	}

}
