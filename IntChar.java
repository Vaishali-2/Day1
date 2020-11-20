
/*Write a program that accepts one integer and one character from the user and prints both.*/

import java.util.*;
import java.io.*;
class IntChar
{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter a number");
	int a=Integer.parseInt(br.readLine());
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character");
	char b=sc.next().charAt(0);
	
	System.out.println("enter integer num is:"+a);
	System.out.println("enter char is:"+b);
	}
}
