package test;
import java.util.*;

import java.lang.*;
public class test814work10
{
	public static void main(String args[])
    {
        final String str = new String ("final修飾字的示範");
        //str = new String(".....");
        System.out.println(str);
        CB3 obj = new CB3();    	
        obj.add();
        obj.show();    //執行繼承自父類別的show()
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
    public final void show()   //不可被改寫的函式
    {
      	System.out.println("var1=" + var1 + "\tvar2=" + var2);
    }    
}

class CB3 extends CA3   // 子類別CB繼承自類別CA
{
    public void add()
    {
        //var1=var1+10;
        var2=var1+var2;
    }
    //public void show(){}    
}

final class CC1  //類別不可被繼承
{
    public int var3;
}

//class CD extends CC{}  
