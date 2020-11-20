/*Write a program that accepts name from user and print that String.
Input:India is my country
output:India is my country*/

import java.util.*;
import java.io.*;
class AcceptPrintString
{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter a string");
	String a=br.readLine();
	System.out.println("enter string is:"+a);
	}
}
