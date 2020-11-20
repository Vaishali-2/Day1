/*Write a program that accepts one character from the user and check whether that is capital or small.
Input: P Output:Capital*/

import java.util.*;
import java.io.*;
class UpperLowerChar
{
	public static void main(String args[])throws IOException
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character");
	char b=sc.next().charAt(0);
	if(b>=65 && b<=90)
	System.out.println("character is uppercase:");
	else
	System.out.println("character is lowercase:");
	}
}
