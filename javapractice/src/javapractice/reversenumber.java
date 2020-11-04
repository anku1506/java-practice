//java program to reverse a number
package javapractice;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		int num=0,rem=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your numer");
		num=s.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;	 
		}
		System.out.println("Reverse number is: "+ sum);
		
	}

}
