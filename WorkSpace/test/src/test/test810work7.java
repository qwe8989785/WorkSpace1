package test;
import java.util.*;
import java.lang.*;
public class test810work7
{
	public static void main(String args[])
    {
        printHello();         //�I�s��18~21�檺�禡
        System.out.println("----------");
        printHello(2);        //�I�s��23~37�檺�禡
        System.out.println("----------");
        printHello("three");  //�I�s��38~44�檺�禡
        //printHello(2.1);    //���~���禡�I�s
    } 
    
    public static void printHello()
    {
        System.out.println("Hello Java");        
    }
    
    public static void printHello(int n)
    {
        if(n>3)
        {
           System.out.println("sorry,more than 3!");
           return;
        }
        else if(n<0)
        {
           System.out.println("sorry,bad command!");
           return;
        }
        for(int i=0;i<n;i++)
           printHello();       //�I�s��18~21�檺�禡             
    }
    public static void printHello(String str1)
    {
        if(str1=="one") printHello();         //�I�s��18~21�檺�禡
        else if(str1=="two") printHello(2);   //�I�s��23~37�檺�禡
        else if(str1=="three") printHello(3); //�I�s��23~37�檺�禡
        else System.out.println("sorry,more than 3 or bad command!");
    }    
}