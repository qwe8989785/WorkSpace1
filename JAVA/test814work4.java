package test;
import java.util.*;


import java.lang.*;
public class test814work4
{
	public static void main(String args[])
    {
        CMyClass3 X = new CMyClass3(5,40);   //���鲣�ͦ���Ӿ�Ƥ޼�
        //CMyClass3 Y = new CMyClass3();     //�L�k���������غc�l
        X.showVar();
        //Y.showVar();
    }
}
class CMyClass3
{
    public int VarA;
    private int VarB;
    
    public CMyClass3(int a,int b)    //�w�q��Ӿ�ưѼƪ��غc�禡
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