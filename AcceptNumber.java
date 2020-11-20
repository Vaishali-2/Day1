
/*Write a program that accepts a number from a user and print that number.*/

import java.util.*;
import java.io.*;
class AcceptNumber
{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	int a=Integer.parseInt(br.readLine());
	System.out.println(a);
	}
}
