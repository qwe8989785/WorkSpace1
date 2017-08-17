package test;
import java.util.*;
import java.lang.*;
public class test810work5
{
	public static void main(String args[])
    {
        int m=1,n=1;
       
        func1(m,n);
        System.out.println("main( )的m=" + m);
        System.out.println("main( )的n=" + n);
    }
    
    public static void func1(int a,int b)
    {
        a=a+10;
        b=b+100;
        System.out.println("func1()的a=" + a);
        System.out.println("func1()的b=" + b);
    }
}