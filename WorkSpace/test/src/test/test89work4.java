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
			
		int trade[]=new int[4];    //�ŧitrade�}�C�ò��Ͱ}�C����    	
		for(int i=0;i<trade.length;i++)
		{
		System.out.print("��" + (i+1) + "�u����~�B:");
		trade[i]=scan.nextInt();
		sum=sum+trade[i];
		}
		average=(double)sum/(double)12;
		System.out.println("=========================");
		System.out.println("    �~����~�B:" + sum);
		System.out.println("�����U����~�B:" + average);   	
	}
}