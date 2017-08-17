package test;
import java.util.*;
import java.lang.*;
public class test814work7
{
	public static void main(String args[])
    {
        CA objA =  new CA();
        CB objB =  new CB();;           //objB是子類別物件
        System.out.println("輸入類別CA的objA物件資料");
        objA.inputX();
        objA.inputY();
        objA.inputZ();
        System.out.print("類別CA的objA物件:");
        objA.show();
        System.out.println("-------------------------");
        System.out.println("輸入類別CB的objB物件資料");
        objB.inputX();
        objB.inputY();
        objB.inputZ();
        objB.varX++;
        //objB.varY++;        //外部程式無法存取protected等級資料,目前可以
        objB.addOne();
        System.out.print("類別B的objB物件:");
        objB.show();
    } 
	
}
class CA
{
    Scanner scan = new Scanner(System.in);
    public int varX;
    protected int varY;
    private int varZ;
    public void inputX()
    {
        System.out.print("varX:");
        varX=scan.nextInt();      
    }

    public void inputY()
    {
        System.out.print("varY:");
        varY=scan.nextInt();
    }

    public void inputZ()
    {
        System.out.print("varZ:");
        varZ=scan.nextInt();
    }

    public void show()
    {
        System.out.println("varX=" + varX + " varY=" + varY + " varZ=" + varZ);
    }
}

class CB extends CA   // 類別CB繼承自類別CA
{
    public int varW;          //新增的成員變數
    public void addOne()      //新增的成員函式
    {
        varX++;
        varY++;
        //varZ++;       //無法存取父類別private等級資料
    }
}