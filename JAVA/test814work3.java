package test;
import java.util.*;


import java.lang.*;
public class test814work3
{
	public static void main(String args[])
    {
        CMyClass2 X = new CMyClass2();          //龟砰玻ネ礚ま计
        CMyClass2 Y = new CMyClass2(5,40);      //龟砰玻ネΤㄢ俱计ま计
        CMyClass2 Z = new CMyClass2(20.2,30.6); //龟砰玻ネΤㄢ疊翴计ま计
        X.showVar();
        Y.showVar();
        Z.showVar();
    } 
}

class CMyClass2
{
    public double VarA;
    private double VarB;

    public CMyClass2()               //﹚竡礚把计篶ㄧΑ
    {
        VarA=10;
        VarB=10;
    }
    public CMyClass2(int a,int b)    //﹚竡ㄢ俱计把计篶ㄧΑ
    {
        VarA=a;
        VarB=a+b;
    }
    public CMyClass2(double a,double b)    //﹚竡ㄢ疊翴计把计篶ㄧΑ
    {
        VarA=a;
        VarB=a*b;
    }
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);
    }
}