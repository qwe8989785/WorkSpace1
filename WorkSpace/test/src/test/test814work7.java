package test;
import java.util.*;
import java.lang.*;
public class test814work7
{
	public static void main(String args[])
    {
        CA objA =  new CA();
        CB objB =  new CB();;           //objB�O�l���O����
        System.out.println("��J���OCA��objA������");
        objA.inputX();
        objA.inputY();
        objA.inputZ();
        System.out.print("���OCA��objA����:");
        objA.show();
        System.out.println("-------------------------");
        System.out.println("��J���OCB��objB������");
        objB.inputX();
        objB.inputY();
        objB.inputZ();
        objB.varX++;
        //objB.varY++;        //�~���{���L�k�s��protected���Ÿ��,�ثe�i�H
        objB.addOne();
        System.out.print("���OB��objB����:");
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

class CB extends CA   // ���OCB�~�Ӧ����OCA
{
    public int varW;          //�s�W�������ܼ�
    public void addOne()      //�s�W�������禡
    {
        varX++;
        varY++;
        //varZ++;       //�L�k�s�������Oprivate���Ÿ��
    }
}