package test;
import java.util.*;


import java.lang.*;
public class test814work3
{
	public static void main(String args[])
    {
        CMyClass2 X = new CMyClass2();          //���鲣�ͮɵL�޼�
        CMyClass2 Y = new CMyClass2(5,40);      //���鲣�ͦ���Ӿ�Ƥ޼�
        CMyClass2 Z = new CMyClass2(20.2,30.6); //���鲣�ͦ���ӯB�I�Ƥ޼�
        X.showVar();
        Y.showVar();
        Z.showVar();
    } 
}

class CMyClass2
{
    public double VarA;
    private double VarB;

    public CMyClass2()               //�w�q�L�Ѽƪ��غc�禡
    {
        VarA=10;
        VarB=10;
    }
    public CMyClass2(int a,int b)    //�w�q��Ӿ�ưѼƪ��غc�禡
    {
        VarA=a;
        VarB=a+b;
    }
    public CMyClass2(double a,double b)    //�w�q��ӯB�I�ưѼƪ��غc�禡
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