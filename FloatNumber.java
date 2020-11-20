/*write a program which accepts a number in floating-point and print number.*/
//by using Scanner class

import java.util.*;
import java.io.*;
class FloatNumber
{
	public static void main(String args[])throws IOException
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a float number");
	float a=sc.nextFloat();
	System.out.println(a);
	}
}
