package test;
import java.util.*;
import java.lang.*;
public class test814work8
{
	public static void main(String args[])
    {
        CB1 objB =  new CB1();           //objB�O�l���O����
        objB.show();
        objB.show(10);
        objB.show(10.0);
    } 
}
class CA1
{
    public void show()
    {
        System.out.println("�ثe��������O��show()");
    }

}

class CB1 extends CA   // �l���OCB�~�Ӧ����OCA
{
    public void show()
    {
        System.out.println("�ثe����l���O��show()");
    }
    public void show(int x)
    {
        System.out.println("�ثe����l���O��show(" + x +")");
    }
    public void show(double x)
    {
        System.out.println("�ثe����l���O��show(double)");
        super.show();
    }
}