package test;
import java.util.*;
import java.lang.*;
public class test814work8
{
	public static void main(String args[])
    {
        CB1 objB =  new CB1();           //objB是子類別物件
        objB.show();
        objB.show(10);
        objB.show(10.0);
    } 
}
class CA1
{
    public void show()
    {
        System.out.println("目前執行父類別的show()");
    }

}

class CB1 extends CA   // 子類別CB繼承自類別CA
{
    public void show()
    {
        System.out.println("目前執行子類別的show()");
    }
    public void show(int x)
    {
        System.out.println("目前執行子類別的show(" + x +")");
    }
    public void show(double x)
    {
        System.out.println("目前執行子類別的show(double)");
        super.show();
    }
}