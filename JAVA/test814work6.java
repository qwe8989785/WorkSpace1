package test;
import java.util.*;

import java.lang.*;
public class test814work6
{
	public static void main(String args[])
    {         
         CMyClass5 X = new CMyClass5();
         X.show();
    }
}
class CMyClass5
{
    public int var=10;    //�����ܼ� 
    public void show()
    {
        int var=20;                     //�ϰ��ܼ�
        System.out.println("�ϰ��ܼ�var=" + var);
        System.out.println("�����ܼ�var=" + this.var);
    }
}    