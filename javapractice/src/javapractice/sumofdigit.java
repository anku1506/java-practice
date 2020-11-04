//program to find sum of digit
package javapractice;

import java.util.Scanner;


public class sumofdigit {
	public static void main(String[] args) {
		int rem=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num=s.nextInt();
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
				
		}
		System.out.println("Sum of digit is: "+sum);
		
		
	}

}
