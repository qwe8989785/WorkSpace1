package test;
import java.util.*;



import java.lang.*;
public class test814work5
{
	public static void main(String args[])
    {         
         CMyClass4 X = new CMyClass4();
         X.show();
         X.show2();
    }
}
class CMyClass4
{
    public int var=10;    //�����ܼ� 
    public void show()
    {
        int var=20;                         //�ϰ��ܼ�
        System.out.println("var=" + var);   //�N�|���Ψ�ϰ��ܼ� 
    }
    public void show2()
    {
    	System.out.println("var=" + var); 
    }
}