package test;
import java.util.*;
import java.lang.*;
public class test89work9
{
	public static void main(String[] args) 
	{
		int k;
        double Ans;
        Scanner scan = new Scanner(System.in);
        System.out.print("�p��3.5��k����?�п�Jk=");
        k=scan.nextInt();
        Ans= power(3.5,k);                         //  �I�s�禡
        System.out.println("3.5��" + k + "����=" + Ans);  
	}
	public static double power(double X,int n)    //�禡�w�q
	{
	    int i;
	    double powerXn=1; 
	    for(i=1;i<=n;i++)
	        powerXn=powerXn*X;
	    return powerXn;
	}
}
