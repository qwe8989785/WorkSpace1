package test;
import java.util.*;

import java.lang.*;
public class test814work10
{
	public static void main(String args[])
    {
        final String str = new String ("final�׹��r���ܽd");
        //str = new String(".....");
        System.out.println(str);
        CB3 obj = new CB3();    	
        obj.add();
        obj.show();    //�����~�Ӧۤ����O��show()
    } 
}
class CA3
{
    public final int var1;
    public int var2;
    public CA3()
    {
        var1=10;
        var2=10;
    }
    public void add()
    {
        //var1++; 
        var2++;
    }
    public final void show()   //���i�Q��g���禡
    {
      	System.out.println("var1=" + var1 + "\tvar2=" + var2);
    }    
}

class CB3 extends CA3   // �l���OCB�~�Ӧ����OCA
{
    public void add()
    {
        //var1=var1+10;
        var2=var1+var2;
    }
    //public void show(){}    
}

final class CC1  //���O���i�Q�~��
{
    public int var3;
}

//class CD extends CC{}  
