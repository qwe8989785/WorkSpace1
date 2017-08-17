package test;
import java.util.*;
public class work87two
{
	public static void main(String[] args) 
	{
		int a ,b ,c ;
		System.out.print("請輸入第一個邊:");
		Scanner scan1 = new Scanner(System.in);
		a = scan1.nextInt();
		System.out.println("=========================================");
		System.out.print("請輸入第二個邊:");
		Scanner scan2 = new Scanner(System.in);
		b = scan2.nextInt();
		System.out.println("=========================================");
		System.out.print("請輸入第三個邊:");
		Scanner scan3 = new Scanner(System.in);
		c = scan3.nextInt();
		if(a <=0 || b<=0 || c<=0)
		{
			System.out.println("邊長不得為零或負數");
		}
		else
		{
			if(a>b && a>c)
			{
				if((a*a) == (b*b) + (c*c))
				{
					System.out.println("此三角形為直角三角形");
				}
				else
				{
					System.out.println("此三角形非直角三角形");
				}
			}
			else if(b>a && b>c)
			{
				if((b*b) == (a*a) + (c*c))
				{
					System.out.println("此三角形為直角三角形");
				}
				else
				{
					System.out.println("此三角形非直角三角形");
				}
			}
			else if(c>b && c>a)
			{
				if((c*c) == (b*b) + (a*a))
				{
					System.out.println("此三角形為直角三角形");
				}
				else
				{
					System.out.println("此三角形非直角三角形");
				}
			}
		}
	}
}