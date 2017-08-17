package test;
import java.util.*;

import java.lang.*;
public class test814work9
{
	public static void main(String args[])
    {
        CC objC1 =  new CC();
        CC objC2 =  new CC(10); 
        CC objC3 =  new CC(3,5); 
        objC1.show();
        objC2.show();
        objC3.show();
    } 
}
class CA2
{
    protected int varA;
    public CA2() { varA=1;}
    public CA2(int i) { varA=i;}
}

class CB2 extends CA2  // 類別CB繼承自類別CA
{
    protected int varB;
    public CB2() { varB=1;}
    public CB2(int i)
    {
        super(i);
        varB=i;
    }
}    

class CC extends CB2   // 類別CC繼承自類別CB
{
    protected int varC;
    public CC() { varC=1;}
    public CC(int i){varC=i;}    
    public CC(int i,int j)
    {
        super(i*j);
        varC=i*j;
    }    
    public void show()
    {
        System.out.print("varA=" + varA + "\t");
        System.out.print("varB=" + varB + "\t");
        System.out.println("varC=" +varC);   	
    }
}