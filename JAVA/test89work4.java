package test;
import java.io.Console;
import java.util.*;
public class test89work4
{
	public static void main(String[] args) 
	{
		int sum=0;
		double average;
		Scanner scan = new Scanner(System.in);
			
		int trade[]=new int[4];    //宣告trade陣列並產生陣列實體    	
		for(int i=0;i<trade.length;i++)
		{
		System.out.print("第" + (i+1) + "季的營業額:");
		trade[i]=scan.nextInt();
		sum=sum+trade[i];
		}
		average=(double)sum/(double)12;
		System.out.println("=========================");
		System.out.println("    年度營業額:" + sum);
		System.out.println("平均各月營業額:" + average);   	
	}
}