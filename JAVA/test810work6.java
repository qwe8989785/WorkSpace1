package test;
import java.util.*;
import java.lang.*;
public class test810work6
{
	 /*public static void main(String args[])
	    {
	        int lotto[]=new int[6];
	       
	        generate_lotto(lotto);
	        System.out.println("�ֳz���X�p�U.....");
	        for(int i=0;i<6;i++)
	            System.out.print(lotto[i] + "\t");
	    }
	    
    public static void generate_lotto(int[] arr)
	    {
	       for(int i=0;i<arr.length;i++)
	       {
	       	   arr[i]= (int)((Math.random()*49)+1);
	           System.out.println("��" + (i+1) + "���H���üƬ�" + arr[i]);
	       }
	    }*/
    public static void main(String args[])
    {
        int lotto[];
       
        lotto=generate_lotto();
        System.out.println("�ֳz���X�p�U.....");
        for(int i=0;i<lotto.length;i++)
            System.out.print(lotto[i] + "\t");
    }
    
    public static int[] generate_lotto()
    {
       int arr[]=new int[6];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]= (int)((Math.random()*49)+1);
           System.out.println("��" + (i+1) + "���H���üƬ�" + arr[i]);
       }
       return arr;
    }
}