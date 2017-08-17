package test;
import java.util.*;
import java.lang.*;
public class test810work1
{
	public static void main(String[] args) 
	{
		int m,n;
        long ans;
        Scanner scan = new Scanner(System.in);
        long temp[]=new long[3];
        
        System.out.println("�D�ƦC�զXC(m,n)");
        System.out.print("m = ");
        m=scan.nextInt();
        System.out.print("n = ");
        n=scan.nextInt();
 
        temp[0] = factorial(m);      //  �p�� m! ����
        temp[1] = factorial(n);      //  �p�� n! ����
        temp[2] = factorial(m-n);    //  �p�� (m-n)! ����
        ans = (temp[0])/(temp[1]*temp[2]);  // C(m,n) = (m!)/(n!*(m-n)!)
        System.out.println("C(" + m + "," + n + ")=" + ans);  	
	}
	public static long factorial(int p)  /* �禡�w�q */
    {
        long result = 1L;
  
        for(int count=1;count<=p;count++)
            result = result * count;
        return result;
    }
}