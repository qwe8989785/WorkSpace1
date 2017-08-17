package test;
import java.util.*;
import java.lang.*;
public class test810work4
{
	public static void main(String args[])
    {
		int lotto[]=new int[6];
        
        for(int i=1;i<=6;i++)
        {
       	   lotto[i-1]= (int)((Math.random()*49)+1);
        }
        Arrays.sort(lotto);
        for(int i=1;i<=6;i++)
        {
       	   System.out.println("第" + i + "個隨機亂數為" + lotto[i-1]);
        }
    }
}