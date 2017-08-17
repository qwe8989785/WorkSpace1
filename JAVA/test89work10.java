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
          
        System.out.print("1+2+...+n=?請輸入n=");
        n=scan.nextInt();
        System.out.print("請問要做奇數和(O),偶數和(E),還是整數和(I)?");
        System.out.print("請選擇:");
        addChoice= scan.next().charAt(0);
  
        switch(addChoice)
        {
            case 'O': sum=odd(n);
                      break;
            case 'E': sum=even(n);
                      break;
            case 'I': sum=totalSum(n);
                      break;
            default:  System.out.println("選擇錯誤");
                      return;
        }
        System.out.println("總和為" + sum);
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