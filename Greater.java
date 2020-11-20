/*write a program that accepts one number from the user and checks that number is greater than 100 or not.
INPUT: 101 OUTPUT: Greater*/


import java.util.*;
import java.io.*;
class Greater
{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter a number");
	int a=Integer.parseInt(br.readLine());

	if(a>100)
	System.out.println("enter integer num is greater:");
	//System.out.println("enter char is:"+b);
	}
}
