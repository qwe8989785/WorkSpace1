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
        
        System.out.println("求排列組合C(m,n)");
        System.out.print("m = ");
        m=scan.nextInt();
        System.out.print("n = ");
        n=scan.nextInt();
 
        temp[0] = factorial(m);      //  計算 m! 的值
        temp[1] = factorial(n);      //  計算 n! 的值
        temp[2] = factorial(m-n);    //  計算 (m-n)! 的值
        ans = (temp[0])/(temp[1]*temp[2]);  // C(m,n) = (m!)/(n!*(m-n)!)
        System.out.println("C(" + m + "," + n + ")=" + ans);  	
	}
	public static long factorial(int p)  /* 函式定義 */
    {
        long result = 1L;
  
        for(int count=1;count<=p;count++)
            result = result * count;
        return result;
    }
}