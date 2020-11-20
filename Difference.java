/*write a program that accepts two numbers and prints the difference between those numbers.
INPUT: 10 3 OUTPUT: 7*/

import java.util.*;
import java.io.*;
class Difference
{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter 1 number");
	int a=Integer.parseInt(br.readLine());

	System.out.println("Enter 2 number");
	int b=Integer.parseInt(br.readLine());
	if(a>b)
	System.out.println("difference is:"+(a-b));
	else
	System.out.println("enter char is:"+(b-a));
	}
}
