package test;
import java.util.*;
import java.lang.*;
public class test810work5
{
	public static void main(String args[])
    {
        int m=1,n=1;
       
        func1(m,n);
        System.out.println("main( )��m=" + m);
        System.out.println("main( )��n=" + n);
    }
    
    public static void func1(int a,int b)
    {
        a=a+10;
        b=b+100;
        System.out.println("func1()��a=" + a);
        System.out.println("func1()��b=" + b);
    }
}