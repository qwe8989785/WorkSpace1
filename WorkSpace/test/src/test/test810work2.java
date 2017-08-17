package test;
import java.util.*;
import java.lang.*;
public class test810work2
{
	public static void main(String[] args) 
	{
		 print99();  
	}
	public static void print99()  // ¨ç¦¡©w¸q
    {
       for(int i=1;i<=9;i++)
       {
         for(int j=1;j<=9;j++)
             System.out.print(i + "*" + j + "=" + i*j + "\t");
         System.out.println();
       }
    }
}