package test;
import java.util.*;


import java.lang.*;
public class test814work4
{
	public static void main(String args[])
    {
        CMyClass3 X = new CMyClass3(5,40);   //實體產生有兩個整數引數
        //CMyClass3 Y = new CMyClass3();     //無法找到對應的建構子
        X.showVar();
        //Y.showVar();
    }
}
class CMyClass3
{
    public int VarA;
    private int VarB;
    
    public CMyClass3(int a,int b)    //定義兩個整數參數的建構函式
    {
        VarA=a;
        VarB=a+b;
    }
    
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);
    }
}