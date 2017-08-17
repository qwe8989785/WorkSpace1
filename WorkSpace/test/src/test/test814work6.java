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
    public int var=10;    //Θ跑计 
    public void show()
    {
        int var=20;                     //跋办跑计
        System.out.println("跋办跑计var=" + var);
        System.out.println("Θ跑计var=" + this.var);
    }
}    