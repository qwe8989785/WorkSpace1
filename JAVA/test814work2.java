package test;
import java.util.*;


import java.lang.*;
public class test814work2
{
	public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        CMyClass Y = new CMyClass();
        
        X.initVar();      //�bX����W,����initVar�����禡
        Y.initVar();      //�bY����W,����initVar�����禡
 
        X.addVar(10);     //�bX����W,����addVar�����禡
        System.out.print("����X\t");
        X.showVar();
        
        System.out.print("����Y\t");
        Y.addVar(5);      //�bY����W,����addVar�����禡
        Y.showVar();

        System.out.print("����Y\t");
        Y.addVar(3);      //�bY����W,����addVar�����禡
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
        realShow();  //����private���Ū��禡
    }
    private int Var;
    private void realShow()
    {
        System.out.println("Var=" + Var);
    }
}