package test;
import java.util.*;
import java.io.Console;
import java.lang.*;
public class test89work10
{
	public static void main(String[] args) 
	{
		int n,sum;
        char addChoice;
        Scanner scan= new Scanner(System.in);
          
        System.out.print("1+2+...+n=?�п�Jn=");
        n=scan.nextInt();
        System.out.print("�аݭn���_�ƩM(O),���ƩM(E),�٬O��ƩM(I)?");
        System.out.print("�п��:");
        addChoice= scan.next().charAt(0);
  
        switch(addChoice)
        {
            case 'O': sum=odd(n);
                      break;
            case 'E': sum=even(n);
                      break;
            case 'I': sum=totalSum(n);
                      break;
            default:  System.out.println("��ܿ��~");
                      return;
        }
        System.out.println("�`�M��" + sum);
	}
	public static int odd(int U)
    {
        int i,total=0;
        for(i=1;i<=U;i++)
            if(i%2 == 1)
               total = total + i;
        return total;
    }

    public static int even(int U)
    {
        int i,total=0;
        for(i=1;i<=U;i++)
            if(i%2 == 0)
               total = total + i;
        return total;
    }

    public static int totalSum(int U)
    {
        return odd(U)+even(U);
    }
}