package test;
import java.util.*;
public class work87two
{
	public static void main(String[] args) 
	{
		int a ,b ,c ;
		System.out.print("�п�J�Ĥ@����:");
		Scanner scan1 = new Scanner(System.in);
		a = scan1.nextInt();
		System.out.println("=========================================");
		System.out.print("�п�J�ĤG����:");
		Scanner scan2 = new Scanner(System.in);
		b = scan2.nextInt();
		System.out.println("=========================================");
		System.out.print("�п�J�ĤT����:");
		Scanner scan3 = new Scanner(System.in);
		c = scan3.nextInt();
		if(a <=0 || b<=0 || c<=0)
		{
			System.out.println("������o���s�έt��");
		}
		else
		{
			if(a>b && a>c)
			{
				if((a*a) == (b*b) + (c*c))
				{
					System.out.println("���T���ά������T����");
				}
				else
				{
					System.out.println("���T���ΫD�����T����");
				}
			}
			else if(b>a && b>c)
			{
				if((b*b) == (a*a) + (c*c))
				{
					System.out.println("���T���ά������T����");
				}
				else
				{
					System.out.println("���T���ΫD�����T����");
				}
			}
			else if(c>b && c>a)
			{
				if((c*c) == (b*b) + (a*a))
				{
					System.out.println("���T���ά������T����");
				}
				else
				{
					System.out.println("���T���ΫD�����T����");
				}
			}
		}
	}
}