package test;
import java.util.*;


import java.lang.*;
public class test814work2
{
	public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        CMyClass Y = new CMyClass();
        
        X.initVar();      //在X物件上,執行initVar成員函式
        Y.initVar();      //在Y物件上,執行initVar成員函式
 
        X.addVar(10);     //在X物件上,執行addVar成員函式
        System.out.print("物件X\t");
        X.showVar();
        
        System.out.print("物件Y\t");
        Y.addVar(5);      //在Y物件上,執行addVar成員函式
        Y.showVar();

        System.out.print("物件Y\t");
        Y.addVar(3);      //在Y物件上,執行addVar成員函式
        Y.showVar();  
    }
}
class CMyClass
{
    public void initVar()
    {
        Var=1;
    }
    public void addVar(int b)
    {
        Var=Var+b;
    }
    public void showVar()
    {
        realShow();  //執行private等級的函式
    }
    private int Var;
    private void realShow()
    {
        System.out.println("Var=" + Var);
    }
}